package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {
        /*
         * FileWriter
         * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         * 1글자 단위로 데이터를 처리한다.
         */

        FileWriter fw = null;

        try {
            // 파일 생성 및 쓰기
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97); // 문자 'a' (ASCII 97)
            fw.write('A'); // 문자 A
            fw.write(new char[] {'a', 'p', 'p', 'l', 'e'}); // 문자열 "apple"
            fw.write("우리나라 대한민국"); // 문자열 직접 출력

            System.out.println("파일 쓰기 완료!");

        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if (fw != null) {
                try {
                    fw.close(); // 반드시 닫기!
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
