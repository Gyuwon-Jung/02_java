package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import java.util.*;


import java.util.Scanner;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public void menu() {
        while (true) {
            System.out.println("== 도서 관리 프로그램 ==");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색 출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.println("메뉴 번호 선택");

            switch (choice) {
                case 1 -> bm.addBook(inputBook());
                case 2 -> {
                    System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순");
                    int choice = sc.nextInt();
                    bm.printBookList(bm.sortedBookList(choice));
                case 3 -> {
                    System.out.println("도서번호: ")
                    int idx = sc.nextInt();
                    bm.deleteBook(idx);
                }
                case 4 -> {
                    String title = inputBookTitle();

                }
                }
            }
        }
    }
}

/* import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.*;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

                case 4 -> {
                    String title = inputBookTitle();
                    int index = bm.searchBook(title);
                    bm.printBook(index);
                }
                case 5 -> bm.displayAll();
                case 6 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    public BookDTO inputBook() {
        System.out.print("도서 번호: ");
        int no = sc.nextInt();
        System.out.print("도서 제목: ");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
        int category = sc.nextInt();
        System.out.print("도서 저자: ");
        sc.nextLine();
        String author = sc.nextLine();
        return new BookDTO(no, category, title, author);
    }

    public String inputBookTitle() {
        System.out.print("도서 제목: ");
        sc.nextLine();
        return sc.nextLine();
    }
}
*/