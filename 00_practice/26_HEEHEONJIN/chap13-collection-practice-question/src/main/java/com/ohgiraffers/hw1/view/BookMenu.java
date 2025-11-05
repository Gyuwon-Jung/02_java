package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.controller.BookManager;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();

    public BookMenu() {

    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        while (run) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BookDTO  book = new BookDTO();
                    System.out.println("책 번호 뭐임? ");
                    int bNo  = sc.nextInt();
                    System.out.println("카테고리는 뭐임? ");
                    int category = sc.nextInt();
                    System.out.println("제목은 뭐임? ");
                    String title = sc.next();
                    System.out.println("저자는 누구임? ");
                    String author = sc.next();

                    System.out.println(book.addBook(bNo, category, title, author));
                    break;
                case 2:
                    System.out.println("정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)");
                    System.out.println(sortedBookList());
                    break;
                case 3:
                    System.out.println(deleteBook());
                    break;
                case 4:
                    System.out.println(searchBook());
                    break;
                case 5:
                    System.out.println(displayAll());
                    break;
                case 6:
                    System.exit(0);
            default:
                System.out.println("잘못된 입력값입니다.");
            }
        }

//        1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
//        2. 도서정보 정렬 후 출력 // sortedBookList(정렬종류번호) 실행
//=>입력받은 매개변수를 이용하여 정렬방식에 따라 출력
//        정렬방식을 선택해주세요 (1. 오름차순, 2.내림차순)
//        1,2 이외의 값을 입력했을 시에는 “번호를 잘못입력하였습니다”를 출력
//=> ArrayList<BookDTO> 리턴 받아 printBookList(ArrayList<BookDTO>) 실행
//        3. 도서 삭제 // deleteBook (도서 번호) 실행
//        4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
//=> index 리턴 받아 -1일 경우 “조회한 도서가 존재하지 않음”
//        -1이 아닐 경우 printBook(index) 출력
//        5. 전체 출력 // displayAll() 실행
//=> 결과 리스트 리턴 받아 비어있을 경우 “출력할 도서가 없습니다.”
//        아닌 경우는 전체 출력
//        6. 끝내기 // main()으로 리턴
//        메뉴 번호 선택 : >> 입력 받음
//// 메뉴 화면 반복 실행 처리
//// 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행


    }

    public BookDTO inputBook() {

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("책 번호를 입력해주쇼 : ");
        Integer bookId = sc.nextInt();

        System.out.println("책 제목을 입력해주쇼 : ");
        String bookTitle = sc.nextLine();

        while (run) {
            System.out.println("1:인문 / 2:자연과학 / 3:의료 / 4:기타");

            int choice = sc.nextInt();

            System.out.println("도서 저자 : ");
            Scanner sc = new Scanner(System.in);
            String bookAuthor= sc.nextLine();

            switch (choice) {
                case 1:
                    break;
                case 2:
                   break;
                case 3:
                  break;
                case 4:
                   break;
                default:
                    System.out.println("잘못된 입력값입니다.");
            }
        }

// "도서 저자 : " >> 입력 받음
    // 매개변수 생성자를 이용하여 위의 초기값을 이용한 a 객체 리턴
    }

    public String inputBookTitle() {
        System.out.println("책 제목을 입력해주쇼 : ");
        Scanner sc = new Scanner(System.in);
        String bookTitle = sc.nextLine();

        return bookTitle;
    }


}
