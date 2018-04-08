package BIO.Client;

import BIO.Server.BIO_Server;

import java.io.IOException;

public class entrance {
    public static void main(String args[]) throws InterruptedException, IOException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    BIO_Server.start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        Thread.sleep(100);
        System.out.println("saerwer\r\n");
        BIO_Client.send("it is sending content\r\n1...\r\n2....\r\n3....");


    }

}
