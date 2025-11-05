package com.ohgiraffers.exception.auth;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
    Run run = new Run();
    run.test6();

    }
    public void test6() {
        try {
            System.out.print("ID를 입력해주쇼 : ");
            Scanner sc = new Scanner(System.in);
            String id = sc.nextLine();

            System.out.println("권한 여부를 입력해주쇼 : ");
            Scanner sc2 = new Scanner(System.in);
            boolean auth = sc2.nextBoolean();

            AuthChecker authChecker = new AuthChecker();
            authChecker.checkAdminPermission(id, auth);
        } catch (PermissionDeniedException e) {
            System.out.println(e.getMessage());
        }
    }
}
