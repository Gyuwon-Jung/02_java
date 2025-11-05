package com.sekong.section03.filterstream;

import java.io.*;

public class Application {

    public static void main(String[] args) {

        /*

java.io 패키지의 입출력 스트림은 기본스트림과 필터스트림으로 분류할 수 있다.
기본 스트림은 외부 데이터에 직접 연결하는 스트림이고
필터스트림은 외부 데이터에 직접 연결하는 것이 아니라 기본 스트림에 추가로 사용할 수 있는 스트림이다.
주로 성능을 향상시키는 목적으로 사용되면 생성자를 보면 구분이 가능하다.
생성자쪽에 매개변수로 다른 스트림을 이용하는 클래스는 필터스트림이라도 볼 수 있다.
*/

        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/sekong/section03/filterstream/testBuffered.txt"));

            bw.write("안녕하세요~\n");
            bw.write("반갑습니다!\n");

//            bw.flush(); // 강제로 버퍼공간을 채운다.
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
        //==============================
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/sekong/section03/filterstream/testBuffered.txt"));

            String temp;
            System.out.println("파일 읽기 시작");
            while((temp = br.readLine())!=null){
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
