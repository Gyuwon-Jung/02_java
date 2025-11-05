package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDto;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {
        /*
         * 객체 단위로 입출력을 하기 위한 ObjectInputStream/ObjectOutputStream 확인
         * */

        MemberDto[] outputMembers = {
                new MemberDto("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDto("user02", "pass02", "유관순", "korea345@ohgiraffers.com", 16, '여', 1850.7),
                new MemberDto("user03", "pass03", "이순신", "leesoonsin777@ohgiraffers.com", 35, '남', 3250.7),
        };

        ObjectOutputStream objOut = null;

        try {
            boolean exists = new File("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt");
            System.out.println( "exists : " + exists);

            if (exists) {
                objOut = new MyObjectStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));

            } else {
                objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));
            }

            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }
            objOut.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("======================================");
        MemberDto[] inputMembers = new MemberDto[3];

        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")));
            while (true){
                System.out.println(objIn.readObject());
            }
        } catch  (EOFException e) {
            System.out.println("끝");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}