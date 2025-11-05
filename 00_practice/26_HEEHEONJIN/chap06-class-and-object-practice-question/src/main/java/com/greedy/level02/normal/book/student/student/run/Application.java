package main.java.com.greedy.level02.normal.book.student.student.run;

import main.java.com.greedy.level02.normal.book.student.model.vo.StudentVO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int grade = sc.nextInt();
    int classroom = sc.nextInt();
    String name = sc.next();
    double height = sc.nextDouble();
    char gender = sc.next().charAt(0);

    StudentVO studentVO = new StudentVO();
    studentVO.setGrade(grade);
    studentVO.setClassroom(classroom);
    studentVO.setName(name);
    studentVO.setHeight(height);
    studentVO.setGender(gender);

    studentVO.printInformation();
    }
}
