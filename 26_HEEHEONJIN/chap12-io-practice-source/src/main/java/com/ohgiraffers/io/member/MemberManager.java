package com.ohgiraffers.io.member;

import java.io.*;

public class MemberManager {
    Member[]  members;

    public void readMembers() {
        try (FileReader fr = new FileReader("src/main/java/com/ohgiraffers/io/member/members.ser")) {
            int size = (int) new File("src/main/java/com/ohgiraffers/io/member/members.ser").length();
            char[] buffer = new char[size];
            fr.read(buffer);

            for(int i = 0; i < buffer.length; i++){
                System.out.print(buffer[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMember(Member  member) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/member/members.ser"));

            for
            bw.write( "" + members + member);

            // bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
