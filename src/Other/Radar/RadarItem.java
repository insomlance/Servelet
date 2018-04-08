package Other.Radar;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.nio.channels.AsynchronousChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.ArrayList;
import java.util.Comparator;

public class RadarItem {
    ArrayList<Integer> list=new ArrayList<>();
    private double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        AsynchronousSocketChannel clientChannel;
        try {
            clientChannel = AsynchronousSocketChannel.open();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //CompletionHandler

        this.score = score;
    }

    public class test{
        Proxy.newProxyInstance()
    }
    public static class RadarCom implements Comparator<RadarItem> {

        @Override
        public int compare(RadarItem o1, RadarItem o2) {
            return (int) (o1.getScore()-o2.getScore());
        }
    }
}
