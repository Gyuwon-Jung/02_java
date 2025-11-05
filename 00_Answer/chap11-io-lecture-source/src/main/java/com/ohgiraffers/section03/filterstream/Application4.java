package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.dto.MemberDto;

import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        MemberDto[] outputMembers = {
                new MemberDto("user01", "pass01", "홍길동", "hong345@ohgiraffers.com", 25, '남', 1250.7),
                new MemberDto("user02", "pass02", "유관순", "korea345@ohgiraffers.com", 16, '여', 1850.7),
                new MemberDto("user03", "pass03", "이순신", "leesoonsin777@ohgiraffers.com", 35, '남', 3250.7)
        };

        // 직렬화(쓰기)
        ObjectOutputStream objOut = null;
        try {
            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt", true)
                    )
            );

            for (MemberDto member : outputMembers) {
                objOut.writeObject(member);
            }

            System.out.println("✅ 객체 직렬화 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("=========================");

        // 역직렬화(읽기)
        ObjectInputStream objIn = null;
        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/testObjectStream.txt")
                    )
            );

            while (true) {
                try {
                    MemberDto member = (MemberDto) objIn.readObject();
                    System.out.println(member);
                } catch (EOFException e) {  // 파일 끝 도달 시 반복 종료
                    break;
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("✅ 객체 역직렬화 완료!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objIn != null) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
