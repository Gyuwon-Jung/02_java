package com.ohgiraffers.section03.filterstream;

import java.io.*;

/* public class Application3 {
    public static void main(String[] args) {
        /*
         * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
         * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야한다.
         * ex)  정수 입력받아 처리하려면 parsing을 해줘야한다
         * "1" =================> 1 : parsing

         */
       /* DataOutputStream dout = null;
        /* try {
            dout = new DataOutputStream(new FileOutputStream("src/main/java/co/ohgiraffers/section03/filterstream/scire.txt"));
            try {
                dout.writeUTF("홍길동");

        } catch (FileNotFoundException e) {

        } finally {
            if (dout != null) {
                try {
                    dout.close();
                } catch(IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

        /* System.out.println("================");
        DataInputStream din = null;
        try {
            din =
        }
    }
} */