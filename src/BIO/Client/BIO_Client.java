package BIO.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class BIO_Client {
    static int default_port = 666;
    static String server_IP = "127.0.0.1";

    public static void send(String content) throws IOException, InterruptedException {
        send(content, default_port);
    }

    public static void send(String content, int port) throws IOException, InterruptedException {
        Selector selector = Selector.open();
        Socket sc = null;
        BufferedReader in = null;
        PrintWriter out = null;
        ServerSocketChannel ssc=ServerSocketChannel.open();
        ssc.socket().bind(new InetSocketAddress(123),1024);
        //ssc.bind()
        SelectionKey key=ssc.register(selector, SelectionKey.OP_ACCEPT);
        key.readyOps();
        try {
            System.out.println("1st place");
            Thread.sleep(5000);
            sc = new Socket(server_IP, port);
            System.out.println("3rd place");
            in = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            out = new PrintWriter(sc.getOutputStream(),true);
            out.println(content);
            System.out.println("5th place");
            String ans;
            //while ((ans=in.readLine())!=null)
                System.out.println(in.readLine());
        } catch (IOException e) {
            throw e;
        } finally {
            if (in != null) {
                in.close();
                in = null;
            }
            if (out != null) {
                out.close();
                out = null;
            }
            if (sc != null) {
                sc.close();
                sc = null;
            }

        }
    }
}