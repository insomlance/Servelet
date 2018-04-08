package BIO.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class BIO_Server {
    static ServerSocket server;
    static int default_port=666;

    public static void start() throws IOException {
        start(default_port);
    }

    public static synchronized void start(int port) throws IOException {
        Socket sc;
        if (server!=null) return;
        try {
            server=new ServerSocket(port);
            while (true){
                sc=server.accept();
                System.out.println("2nd place");
                new Thread(new ProcessThread(sc)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (server!=null){
                server.close();
                server=null;//以null来判断server是否关闭
            }
        }

    }

}
