package com.sekong.io.member;

import java.io.*;

public class MemberManager {
    Member[] members ;


    //members.ser 파일을 읽어서 필드에 저장하고, 출력하는 메소드
    public void readMembers(){
        ObjectInputStream ois = null;

        try{

            ois = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/main/java/com/sekong/io/member/member.ser")));

            while(true){
                System.out.println(ois.readObject());
            }
        }catch(EOFException e){
            System.out.println("끝");
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public void addMember(Member member){
        ObjectOutputStream oos = null;

        try{
            
            members = new Member[]{member};
            oos = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    "src/main/java/com/sekong/io/member/member.ser")));
            oos.writeObject(member);
            oos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
