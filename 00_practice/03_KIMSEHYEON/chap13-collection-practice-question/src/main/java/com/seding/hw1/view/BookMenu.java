package com.seding.hw1.view;

import com.seding.hw1.controller.BookManager;
import com.seding.hw1.dto.BookDTO;
import com.seding.hw1.model.comparator.AscCategory;

import java.util.ArrayList;
import java.util.Scanner;


public class BookMenu {
    private Scanner sc = new Scanner(System.in);
    private BookManager bm = new BookManager();


    public BookMenu() {
    }


    public void menu(){
        /*도서관리 프로그램에 해당하는 메인 메뉴 출력,
          각 메뉴에 해당하는 BookManager 클래스의 메소드 실행 -> 반복 출력되게 한다*/
        String str = """
                *** 도서 관리 프로그램 ***
                1. 새 도서 추가
                2. 도서정보 정렬 후 출력
                3. 도서 삭제
                4. 도서 검색출력
                5. 전체 출력
                6. 끝내기""";
        do {
            System.out.println(str);
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("도서 번호, 도서 분류 코드, 도서 제목, 도서 저자를 순서대로 입력하세요.");
                    System.out.print("도서 번호 : ");
                    int no = sc.nextInt();
                    System.out.print("도서 분류 코드 : ");
                    int category = sc.nextInt();
                    sc.nextLine();
                    System.out.print("도서 제목 : ");
                    String title = sc.nextLine();
                    System.out.println("도서 저자 : ");
                    String author = sc.nextLine();
                    bm.addBook(inputBook(no, category, title, author));
                    break;
                case 2:
                    System.out.print("정렬 방식을 선택해주세요(1: 오름차순, 2: 내림차순) :");
                    int choice2 = sc.nextInt();
                    sc.nextLine();
                    if (choice2 == 1 || choice2 == 2) {
                        ArrayList<BookDTO> sorted = bm.sortBookList(choice2); // ← 리턴값 받기
                        bm.printBookList(sorted);                            // ← 출력하기
                    } else {
                        System.out.println("1 또는 2를 입력해야 합니다.");
                    }
                    break;
                case 3:
                { // 삭제: 도서 번호로
                    System.out.print("삭제할 도서 번호 : ");
                    int bNo = sc.nextInt();
                    sc.nextLine();
                    bm.deleteBook(bNo);
                    break;
                }
                case 4: { // 검색 출력
                    String findTitle = inputBookTitle();
                    int idx = bm.searchBook(findTitle);
                    if (idx == -1) {
                        System.out.println("조회한 도서가 존재하지 않음");
                    } else {
                        bm.printBook(idx);
                    }
                    break;
                }
                case 5: { // 전체 출력
                    bm.displayAll();
                    break;
                }
                case 6: {
                    System.out.println("프로그램을 종료합니다.");
                    return; // main으로 리턴
                }
                default:
                    System.out.println("번호를 잘못입력하였습니다");
            }
        }while(true);
    }


    public String inputBookTitle(){
        /*검색할 도서제목을 키보드로 입력 받아 리턴*/
        System.out.print("도서 제목 : ");
        return sc.nextLine();
    }
    // 위와 같이 추가, 삭제, 검색에 필요한 정보는 키보드로 입력 받도록 각각의 메소드 따로 구현
    public BookDTO inputBook(int bNo, int category,String title, String author){
        return new BookDTO(bNo,category,title,author);
    }

}
