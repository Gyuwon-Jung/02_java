package com.ohgiraffers.section01;

import java.io.*;

public class Application1 {
    public static void main(String[] args) {

        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            int value;
             // read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽을 데이터가 없을 경우 -1 반환
            while((value = fin.read()) != -1) {
            System.out.println((char)value);
        }

            File readFile = new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            System.out.println("파일의 길이 : " + readFile.length());
            int size = (int ) readFile.length();
            byte[] buffer = new byte[size];

            fin.read(buffer);

            for (int i = 0; i < buffer.length; i++) {
                System.out.println((char)buffer[i]) ;
            }

        // File readFile = new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
        System.out.println("파일의 길이 : " + readFile.length());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
