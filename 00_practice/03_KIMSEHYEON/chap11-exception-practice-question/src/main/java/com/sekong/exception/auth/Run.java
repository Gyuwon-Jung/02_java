package com.sekong.exception.auth;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.test6();
    }
    public void test6() {
        String user1 = "user01";
        String usr2 = "guest99";
        AuthChecker at = new AuthChecker();
        try{
            at.checkAdminPermission(user1,true);
            at.checkAdminPermission(usr2,false);
        }catch(PermissionDeniedException e){
            System.out.println(e.getMessage());
        }
    }
}
