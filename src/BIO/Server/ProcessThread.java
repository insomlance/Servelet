package BIO.Server;

import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;

public class ProcessThread implements Runnable{
    Socket sc;
    BufferedReader in;
    PrintWriter out;

    public ProcessThread(Socket sc) {
        this.sc=sc;
    }

    @Override
    public void run() {
        try {
            ByteBuffer bf=ByteBuffer.allocate(1024);
            in=new BufferedReader(new InputStreamReader(sc.getInputStream()));
            out=new PrintWriter(sc.getOutputStream(),true);
            String expression,result;
            System.out.println("4th place");
            Thread.sleep(3000);
            while ((expression=in.readLine())!=null){
                System.out.println("Server:"+expression);
                result=expression+"+server"+System.currentTimeMillis();
                Thread.sleep(5000);
                out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                in=null;
            }
            if (out!=null){
                out.close();
                out=null;
            }
            if (sc!=null) {
                try {
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                sc=null;
            }
        }
    }
}
