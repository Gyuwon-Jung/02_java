package com.ohgiraffers.hw1.view;

import java.util.Scanner;
import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();

    public BookMenu() {
    }

    public void menu() {
        while (true) {
            System.out.print("""
                    *** 도서 관리 프로그램 ***
                    1. 새 도서 추가 
                    2. 도서정보 정렬 후 출력             
                    3. 도서 삭제 
                    4. 도서 검색출력
                    5. 전체 출력
                    6. 끝내기
                    메뉴 번호 선택 : 
                    """);
            int menuNum = sc.nextInt();
            switch (menuNum) {
                case 1:
                    BookDTO book = inputBook();
                    bm.addBook(book);
                    break;
                case 2: {
                    System.out.print("(1. 오름차순, 2.내림차순) 정렬 방식을 선택해주세요 : ");
                    int sortNum = sc.nextInt();
                    while (sortNum < 1 || sortNum > 2) {
                        System.out.print("번호를 잘못입력하였습니다. 다시 입력해주세요 : ");
                        sortNum = sc.nextInt();
                    }
                    var list = bm.sortedBookList(sortNum);
                    bm.printBookList(list);
                    break;
                }
                case 3:
                    System.out.print("삭제할 도서의 번호를 입력해주세요 : ");
                    int deleteNum = sc.nextInt();
                    bm.deleteBook(deleteNum);
                    break;
                case 4:
                    String title = inputBookTitle();
                    int index = bm.searchBook(title);
                    if (index == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        bm.printBook(index);
                    }
                    break;
                case 5:
                    bm.displayAll();
                    break;
                case 6:
                    System.out.println("시스템을 종료합니다.");
                    return;
                default:
                    System.out.println("메뉴를 잘못 선택하셧습니다.");
            }
        }
    }


    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int bNo = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 제목 : ");
        String title = sc.nextLine();
        System.out.println("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int category = sc.nextInt();
        sc.nextLine();
        System.out.println("도서 저자 : ");
        String author = sc.nextLine();
        return new BookDTO(bNo, category, title, author);
    }


    public String inputBookTitle() {
        sc.nextLine();
        System.out.print("검색할 도서 제목을 입력해주세요 : ");
        return sc.nextLine();
    }
}