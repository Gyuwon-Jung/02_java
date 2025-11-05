package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    private Member[] members;

    public void readMembers(){
        File file = new File("src/main/java/com/ohgiraffers/io/member/members.ser");

        if(!file.exists()){
            System.out.println("파일 없음");
            return;

        }

//try, catch, catch .. finally가 좀 특이한거

        ObjectInputStream obj = null;

        try {
            obj = new ObjectInputStream(
                    new FileInputStream(file));

            members = (Member[]) obj.readObject();
            System.out.println("===회원정보===");
            for (Member m : members) {
                System.out.println(m);
            }


        } catch (IOException e) {
            System.out.println("오류 발생" + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("없음" + e.getMessage());
            e.printStackTrace();wgw  r
        } finally {
            if (obj != null) {
                try {
                    obj.close();
                } catch (IOException e) {
                    System.out.println("스트림 오류" + e.getMessage());
                    e.printStackTrace();}
            }
        }
    }
}

