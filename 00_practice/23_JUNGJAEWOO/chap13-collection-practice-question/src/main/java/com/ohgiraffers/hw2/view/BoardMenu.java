package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;

import java.util.Scanner;

public class BoardMenu {
    private BoardManager bm = new BoardManager();
    private InputBoard ib = new InputBoard();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        int menu = 0;
        do {
            System.out.println("\n*** 게시글 서비스 프로그램 ***");
            System.out.println("1. 게시글 쓰기");
            System.out.println("2. 게시글 전체보기");
            System.out.println("3. 게시글 한 개 보기");
            System.out.println("4. 게시글 제목 수정");
            System.out.println("5. 게시글 내용 수정");
            System.out.println("6. 게시글 삭제");
            System.out.println("7. 게시글 제목 검색");
            System.out.println("8. 정렬하기");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 선택 : ");

            menu = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            switch (menu) {
                case 1:
                    bm.insertBoard(ib.inputBoard());
                    break;
                case 2:
                    bm.selectAllList();
                    break;
                case 3:
                    bm.selectOneBoard(ib.InputBoardNo());
                    break;
                case 4:
                    bm.updateBoardTitle(ib.InputBoardNo(), ib.InputBoardTitle());
                    break;
                case 5:
                    bm.updateBoardContent(ib.InputBoardNo(), ib.InputBoardContent());
                    break;
                case 6:
                    bm.deleteBoard(ib.InputBoardNo());
                    break;
                case 7:
                    bm.searchBoard(ib.InputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }

        } while (menu != 9);
    }


    public void sortSubMenu(){
        int subMenu = 0;
        do {
            System.out.println("\n***** 게시글 정렬 메뉴 *****");
            System.out.println("1. 글번호순 오름차순");
            System.out.println("2. 글번호순 내림차순");
            System.out.println("3. 작성날짜순 오름차순");
            System.out.println("4. 작성날짜순 내림차순");
            System.out.println("5. 글제목순 오름차순");
            System.out.println("6. 글제목순 내림차순");
            System.out.println("7. 메인메뉴로 이동");
            System.out.print("메뉴 번호 선택 : ");

            subMenu = sc.nextInt();
            sc.nextLine();

            switch (subMenu) {
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
                    System.out.println("메인 메뉴로 돌아갑니다.");
                    return;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
            }

        } while (subMenu != 7);
    }
}


