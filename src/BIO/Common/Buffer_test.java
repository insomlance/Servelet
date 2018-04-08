package BIO.Common;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class Buffer_test {
    public static void main(String[] args){
//        ByteBuffer bf=ByteBuffer.allocate(1024);
//        bf.put((byte) 'a');
//        bf.put((byte)'b');
//        bf.put((byte)'c');
//        bf.flip();
//        System.out.println(bf.get(1));
//        System.out.println(bf.position());
//        System.out.println(bf.get());
//        System.out.println(bf);
//        System.out.println(bf.get());
//        System.out.println(bf.remaining());
//        bf.rewind();
//        System.out.println(bf.get());
//        bf.mark();
//        bf.get();
//        bf.reset();
//        System.out.println(bf.get());
//        bf.compact();
//        System.out.println(bf.position()+"   limmit:"+bf.limit()+"    remaining:"+bf.remaining());//一般compact后进行写操作，此处先读的话读的位置是前面已读过的数据
//        System.out.println(bf.get());
//        bf.clear();
        CharBuffer cbf=CharBuffer.allocate(1024);
        cbf.put('a');cbf.put('b');cbf.put('c');
        System.out.println(cbf.position());
        cbf.get();//未flip的话不出结果；且position的位置依旧会+1
        System.out.println(cbf.position());
        CharBuffer cbf1=cbf.duplicate();
        CharBuffer cbf2=cbf.asReadOnlyBuffer();
        cbf.flip();
        cbf.get();
        cbf.compact();
        cbf.put('d');
        cbf.flip();
        System.out.println("cbf:---"+cbf.get(3));
        System.out.println("cbf:---"+cbf.get(1));
        cbf1.flip();cbf2.flip();
        System.out.println(cbf1.get());
        System.out.println(cbf2.get());
        cbf1.clear();
        cbf1.put('g');cbf1.put('h');cbf1.put('i');
        System.out.println(cbf2.get());
        cbf1.flip();
        System.out.println("cbf1:---"+cbf1.get());
        cbf2.clear();
        //cbf2.put('p');//只读的buffer修改数据会出错
        CharBuffer cbf3=cbf1.slice();
        System.out.println("position:"+cbf3.position()+"  limit:"+cbf3.limit()+" element:"+cbf3.get(cbf3.position())+" capacity:"+cbf3.capacity());



    }
}
