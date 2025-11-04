package com.ohgiraffers.section03.filterStream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        /*
        * java.io패키지의 입출력 스트림은 기본스트림과 필터스트림으로 분류 가능
        * 기본 스트림은 외부 데이터에 직접 연결되는 스트림이고,
        * 필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림임
        * 주로 성능을 향상시키는 목적으로 사용되며 생성자를 보면 구분이 가능함
        * 생성자 쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라고 볼 수 있음
        * */

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));

            bw.write("안녕하세요~\n");
            bw.write("반갑습니다~\n");

//            bw.flush(); // 강제로 버퍼공간을 비운다.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* ======================================================================== */
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/section03/filterStream/testBuffered.txt"));

            String temp;
            System.out.println("[ 파일 읽기 시작 ]");
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
