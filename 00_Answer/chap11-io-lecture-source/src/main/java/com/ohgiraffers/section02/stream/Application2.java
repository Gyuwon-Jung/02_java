package com.ohgiraffers.section02.stream;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * fFileReader
        * FileInputStream과 사용하는 방법이 거의 동일하다
        * 단, byte단위가 아닌 character단위로 읽어들이는 부분이 차이점이다.
        * 따라서 2바이트이건 3바이트이건 글자단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
        * */
        try(FileReader fr = new FileReader("00_Answer/chap11-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/testReader.txt")){
            /* int value;

            while((value = fr.read()) != -1){
                System.out.println((char)value );
            }*/
            int size = (int) new File("00_Answer/chap11-io-lecture-source/src/main/java/com/ohgiraffers/section02/stream/testReader.txt").length();
            System.out.println(size);

            char[] buffer = new char[size];
            fr.read(buffer);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*System.out.println("===================== try - with - resourse ================================");
        try(FileInputStream fin2 = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");){

            File readFile = new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");
            System.out.println("파일의 길이 : " + readFile.length());
            int size = (int) readFile.length();
            byte[] buffer = new byte[size];

            fin2.read(buffer);

            for(int i = 0; i < buffer.length; i++){
                System.out.println((char) buffer[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
