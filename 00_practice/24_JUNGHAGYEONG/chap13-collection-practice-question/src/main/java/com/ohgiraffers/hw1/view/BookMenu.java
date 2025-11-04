package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.*;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookManager bm =  new BookManager();

    public BookMenu() {
    }

    public void menu() {


        String menu = """
                *** 도서 관리 프로그램
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기
                """;

        int choice;
        int sorte;
        int bNum;
        String bTitle;
        int index = 0;
        do {
            System.out.println(menu);
            System.out.print("메뉴 번호 선택 : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                    case 2:
                        System.out.print("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순) : ");
                        sorte = sc.nextInt();
                        bm.sortedBookList(sorte);
                        break;
                        case 3:
                            System.out.print("삭제 할 도서 번호를 입력해주세요 : ");
                            bNum = sc.nextInt();
                            bm.deleteBook(bNum);
                            break;
                            case 4:
                                bm.searchBook(inputBookTitle());
                                break;
                                case 5:
                                    bm.displayAll();
                                    break;
                case 6:
                    break;
                    default:
                        System.out.println("번호를 잘못입력하였습니다”");
                        System.out.println("번호를 입력하세요 : ");

            }
        } while (choice != 6);

    }

    public BookDTO inputBook() {
        System.out.print("도서 번호 : ");
        int bNum = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 제목 : ");
        String bTitle = sc.nextLine();

        System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
        int sorte = sc.nextInt();
        sc.nextLine();

        System.out.print("도서 저자 : ");
        String bAuthor = sc.nextLine();

        return new BookDTO(bNum, sorte, bTitle, bAuthor);
    }

    public String inputBookTitle() {
        sc.nextLine();
        System.out.print("도서 제목 : ");
        String bookTitle = sc.nextLine();
        return bookTitle;
    }
}
