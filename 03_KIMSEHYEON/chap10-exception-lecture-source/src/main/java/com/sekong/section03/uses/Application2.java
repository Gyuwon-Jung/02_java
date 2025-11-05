package com.sekong.section03.uses;

import java.io.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        * try-with-resource
        * jdk 1.7에 추가된 문법이다.
        * close해야하는 인스턴스의 경우 try 앞에 괄호 안에서 생성하면
        * 해당 try-catch블럭이 완료될 때 자동으로 close 처리 해준다.*/
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            String s;

            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }catch(FileNotFoundException | EOFException e){
            // EOFException -> End Of File 약자
            System.out.println("파일 끝");
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        } finally{
            System.out.println("finally 호출");
        }
    }
}
