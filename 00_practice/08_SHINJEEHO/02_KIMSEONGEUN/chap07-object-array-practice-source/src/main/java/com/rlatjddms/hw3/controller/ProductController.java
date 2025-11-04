package com.rlatjddms.hw3.controller;

import com.rlatjddms.hw3.model.dto.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro =  new ProductDTO[10];
    public static int count = 0;

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        do {
            System.out.println("""
                    ===== 제품 관리 메뉴 =====
                    1. 제품 정보 추가
                    2. 제품 전체 조회
                    9. 프로그램 종료
                    """);
            System.out.print("실행할 메뉴 번호를 입력하세요 : ");
            switch (sc.nextInt()) {
                case 1: productInput(); break;
                case 2: productPrint(); break;
                case 9: System.exit(0); break;
            }
        } while (true);
    }

    public void productInput(){

        System.out.print("제품 번호 입력 : ");
        int pId = sc.nextInt();
        System.out.print("제품명 입력 : ");
        String pName = sc.next();
        System.out.print("제품 가격 입력 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 입력 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pId, pName, price, tax);
    }

    public void productPrint() {

        for (int i = 0; i < count; i++) {
            System.out.println(pro[i].information());
        }
        System.out.println();
    }
}
