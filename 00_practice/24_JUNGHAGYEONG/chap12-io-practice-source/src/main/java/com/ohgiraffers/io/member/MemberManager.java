package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {

    private Member[] members;

    public void readMembers() {
        File file = new File("src/main/java/com/ohgiraffers/io/member/members.ser");
        ObjectInputStream objIn = null;

        if (!file.exists()) {
            members = new Member[0];
            System.out.println("회원 데이터 없음");
            return;
        }

        try {
            objIn = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)
                    )
            );

            members = (Member[]) objIn.readObject();

            for (Member member : members) {
                System.out.println(member);
            }
        } catch (EOFException e) {
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

    public void addMember(Member member) {
        File file = new File("src/main/java/com/ohgiraffers/io/member/members.ser");
        ObjectOutputStream objOut = null;

        if (members == null) {
            members = new Member[0];
        }

        Member[] memArr = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            memArr[i] = members[i];
        }
        memArr[members.length] = member;
        members = memArr;
        try {

            objOut = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file, false)
                    )
            );

            objOut.writeObject(members);
            objOut.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
