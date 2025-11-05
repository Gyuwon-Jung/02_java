package com.sekong.section03.filterstream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
        * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야 한다.
        * 예) 정수 입력받아 처리하려면 parsing을 해줘야한다.
        * "1" =================> 1 : parsing
        * */
        DataOutputStream dout = null;
        try {
            dout = new DataOutputStream(new FileOutputStream("src/main/java/com/sekong/section03/filterstream/score.txt"));

            dout.writeUTF("홍길동");
            dout.writeInt(95);
            dout.writeChar('A');
            dout.writeUTF("김철수");
            dout.writeInt(85);
            dout.writeChar('B');
            dout.writeUTF("영희");
            dout.writeInt(65);
            dout.writeChar('C');
            dout.writeUTF("짱구");
            dout.writeInt(100);
            dout.writeChar('D');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("=======================");
        DataInputStream din = null;
        try {
            din = new DataInputStream(new FileInputStream("src/main/java/com/sekong/section03/filterstream/score.txt"));

            while(true) {
                // 파일에 기록한 순서대로 읽어들어야 한다.
//                System.out.println(din.readUTF()+", "+din.readInt()+", "+din.readChar());
                System.out.println(din.readInt()+", "+din.readUTF()+", "+din.readChar());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(EOFException e) {
            System.out.println("파일 읽기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally
         {
            if (din != null) {
                try {
                    din.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
