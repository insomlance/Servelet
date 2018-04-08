package Other.Common;

import Other.Radar.RadarItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class act {
    public static void main(String[] args){
        List<RadarItem> radars=new ArrayList<>();
        RadarItem r1,r2,r3;
        r1=new RadarItem();
        r2=new RadarItem();
        r3=new RadarItem();
        r1.setScore(1);
        r2.setScore(2);
        r3.setScore(3);
        RadarItem[] aaa=new RadarItem[]{r1,r2,r3};
        radars.add(r1);radars.add(r2);radars.add(r3);
        //Arrays.sort(aaa,new RadarCom());
        RadarItem[] ccc=new RadarItem[]{};
        radars.toArray(ccc);
        //Arrays.sort(ccc,new RadarCom());
        Collections.sort(radars,new RadarItem.RadarCom());

    }
}
