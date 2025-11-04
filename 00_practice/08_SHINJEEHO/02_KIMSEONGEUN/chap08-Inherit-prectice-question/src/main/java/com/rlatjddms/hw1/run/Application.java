package com.rlatjddms.hw1.run;

import com.rlatjddms.hw1.model.dto.EmployeeDTO;
import com.rlatjddms.hw1.model.dto.PersonDTO;
import com.rlatjddms.hw1.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonDTO personDTO = new PersonDTO();
        int count = 0;

        StudentDTO[] students = new StudentDTO[3];
        students[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        students[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        students[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        System.out.println("=================== 학생 정보 ===================");
        for(StudentDTO student : students) {
            System.out.println(student.information());
        }

        System.out.println("=================== 사원 정보 입력 ===================");
        EmployeeDTO[] employees = new EmployeeDTO[10];
        while (true) {
            System.out.print("이름 입력 : ");
            String name = sc.nextLine();
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            System.out.print("신장 입력 : ");
            double height = sc.nextDouble();
            System.out.print("몸무게 입력 : ");
            double weight = sc.nextDouble();
            System.out.print("급여 입력 : ");
            int salary = sc.nextInt();
            System.out.print("부서 입력 : ");
            String dept = sc.next();

            employees[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            char choice = sc.next().charAt(0);
            if(choice != 'y' && choice != 'Y') break;
            if(count == 10) break;
        }

        for(int i = 0; i < count; i++) {
            System.out.println(employees[i].information());
        }
    }
}
