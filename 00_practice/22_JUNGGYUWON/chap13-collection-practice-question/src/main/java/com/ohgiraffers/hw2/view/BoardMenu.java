package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Scanner;

public class BoardMenu {
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();

    public void mainMenu() {
        String text = """
                        *** 게시글 서비스 프로그램 ***
                        1. 게시글 쓰기
                        2. 게시글 전체보기
                        3. 게시글 한 개보기
                        4. 게시글 제목 수정
                        5. 게시글 내용 수정
                        6. 게시글 삭제
                        7. 게시글 제목 검색
                        8, 정렬하기
                        9. 끝내기
                        메뉴 번호 선택 : """;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.print(text);
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:

                    bm.insertBoard(ib.InputBoard());
                    break;

                case 2:
                    bm.selectAllList();
                    break;

                case 3:
                    System.out.print("조회할 번호를 입력하세요 : ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    bm.selectOneBoard(no);
                    break;

                case 4:
                    System.out.print("수정할 글 번호를 입력하세요 : ");
                    int no2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("수정할 제목을 입력해주세요 : ");
                    String title = sc.nextLine();

                    bm.updateBoardTitle(no2, title);
                    break;

                case 5:
                    System.out.print("수정할 글 번호를 입력하세요 : ");
                    int no3 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("수정할 내용을 입력해주세요 : ");
                    String content = sc.nextLine();
                    bm.updateBoardContent(no3, content);
                    break;

                case 6:
                    System.out.println("삭제할 게시글 번호를 입력해주세요 : ");
                    int no4 = sc.nextInt();
                    sc.nextLine();
                    bm.deleteBoard(no4);
                    break;

                case 7:
                    System.out.print("검색할 게시글의 제목을 입력해주세요 : ");
                    String title1 = sc.nextLine();
                    bm.searchBoard(title1);
                    break;

                case 8:
                    sortSubMenu();
                    int no5 = sc.nextInt();
                    sc.nextLine();
                    switch (no5) {
                        case 1:
                            bm.sortList(new AscBoardNo());
                            break;
                        case 2:
                            bm.sortList(new DescBoardNo());
                            break;
                        case 3:
                            bm.sortList(new AscBoardDate());
                            break;
                        case 4:
                            bm.sortList(new DescBoardDate());
                            break;
                        case 5:
                            bm.sortList(new AscBoardTitle());
                            break;
                        case 6:
                            bm.sortList(new DescBoardTitle());
                            break;
                        case 7:
                            break;
                        default:
                            System.out.println("잘못 입력하셨습니다.");
                            break;
                    }
                    break;

                case 9:
                    System.out.println("프로그램이 종료됩니다.");
                    flag = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
            }
        }


    }

    public void sortSubMenu() {
        String text = """
                      *****게시글 정렬 메뉴 * * * * *
                      1. 글번호순 오름차순 정렬 // sortList(AscBoardNo())
                      2. 글번호순 내림차순 정렬 // sortList(DescBoardNo())
                      3. 작성날짜순 오름차순 정렬 // sortList(AscBoardDate())
                      4. 작성날짜순 내림차순 정렬// sortList(DescBoardDate())
                      5. 글제목순 오름차순 정렬 // sortList(AscBoardTitle())
                      6. 글제목순 내림차순 정렬 // sortList(DescBoardTitle())
                      7. mainMenu() 메소드로 이동
                      메뉴 번호 선택 : 
                """;
        System.out.print(text);
    }

}
