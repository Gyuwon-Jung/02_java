package com.sekong.exception.user;

public class Run {
    public static void main(String[] args) {

    }
    public void test9(){
        String id1 = "admin";
        String name1 = "user1";
        String id2 = "";
        String name2 = "user2";
        String id3 = "admin";
        String name3 = null;
        UserValidator userValidator = new UserValidator();
        try{
//            userValidator.validateUserInfo(id1,name1);
//            userValidator.validateUserInfo(id2,name2);
            userValidator.validateUserInfo(id3,name3);
        }catch (MissingInfoException e){
            System.out.println(e.getMessage());
        }


    }
}
