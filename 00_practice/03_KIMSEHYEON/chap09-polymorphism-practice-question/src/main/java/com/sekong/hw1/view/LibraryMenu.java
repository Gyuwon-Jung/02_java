package com.sekong.hw1.view;

import com.sekong.hw1.controller.LibraryManager;
import com.sekong.hw1.model.dto.Book;
import com.sekong.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu{
    private LibraryManager lm = new LibraryManager();;
    Scanner sc = new Scanner(System.in);
    private Member mem;
    public void mainMenu(){
        System.out.print("회원 이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);
        mem = new Member(name,age,gender);
        lm.insertMember(mem);
        boolean flag = true;
        String string = """
                ==== 메뉴 ====
                1. 마이페이지
                2. 도서 전체 조회
                3. 도서 검색
                4. 도서 대여하기
                0. 프로그램 종료하기""";
        while(flag){
            System.out.println(string);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
    public void selectAll(){

        Book[] bList = lm.selectAll();
        int i = 0;
        for (Book book : bList) {
            System.out.print("index = "+i+", ");
            System.out.println(book);
            i++;
        }


    }
    public void searchBook(){
        sc.nextLine();
        System.out.print("키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        Book[] books = lm.searchBook(keyword);
        int i = 0;
        for (Book book : books) {
            if(book != null){
                System.out.print("index = "+i+", ");
                System.out.println(book);
            }

        }

    }
    public void rentBook(){
        System.out.println("인덱스를 입력하세요 : ");
        int index = sc.nextInt();
        int result = lm.rentBook(index);
        if(result == 0){
            System.out.println("성공적으로 대여되었습니다.");
        }else if(result == 1){
            System.out.println("나이 제한으로 대여 불가능입니다.");
        }else if(result == 2){
            mem.setCouponCount(mem.getCouponCount()+1);
            System.out.println("성공적으로 대여되었습니다. 요리학우너 쿠폰이 발급되었습니다.\n 마이페이지를 통해 확인하세요.");
        }

    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}
