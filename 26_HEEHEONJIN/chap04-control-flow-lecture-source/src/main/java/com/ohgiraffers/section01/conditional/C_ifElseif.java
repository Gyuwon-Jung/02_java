package com.ohgiraffers.section01.conditional;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class C_ifElseif {
    public void testIfElseIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름 : ");
        String name = sc.nextLine();
        System.out.println("학생 성정 : ");
        int score = sc.nextInt();

        String grade = "";

//        if (score >= 90) {
//            grade = "A";
//            if(score >= 95) grade = "+";{
//            }
//        } else if (score >= 80) {
//            }
//    }

        if(score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println(name + " 학생의 점수는 " + score + " 점이며, 학점은 " + grade + "입니다.");
    }
}
