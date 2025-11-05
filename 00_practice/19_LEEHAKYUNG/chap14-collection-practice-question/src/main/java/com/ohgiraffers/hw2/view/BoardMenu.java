package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.comparator.*;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Scanner;

public class BoardMenu {
    BoardManager bm = new BoardManager();
    InputBoard iBoard = new InputBoard();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.print("*** 게시글 서비스 프로그램 ***" + "\n"
                    + "1. 게시글 쓰기" + "\n"
                    + "2. 게시글 전체보기" + "\n"
                    + "3. 게시글 한 개 보기" + "\n"
                    + "4. 게시글 제목 수정" + "\n"
                    + "5. 게시글 내용 수정" + "\n"
                    + "6. 게시글 삭제" + "\n"
                    + "7. 게시글 제목 검색" + "\n"
                    + "8. 정렬하기" + "\n"
                    + "9. 끝내기" + "\n"
                    + "메뉴 번호 선택 : ");
            int menuNum = sc.nextInt();
            sc.nextLine();
            if (menuNum == 1) {
                BoardDTO board = iBoard.inputBoard();
                bm.insertBoard(board);
            } else if (menuNum == 2) {
                bm.selectAllList();
            } else if (menuNum == 3) {
                int boardNo = iBoard.inputBoardNo();
                bm.selectOneBoard(boardNo);
            } else if (menuNum == 4) {
                int boardNo = iBoard.inputBoardNo();
                String boardTitle = iBoard.inputBoardTitle();
                bm.updateBoardTitle(boardNo, boardTitle);
            } else if (menuNum == 5) {
                int boardNo = iBoard.inputBoardNo();
                String boardContent = iBoard.inputBoardContent();
                bm.updateContent(boardNo, boardContent);
            } else if (menuNum == 6) {
                int boardNo = iBoard.inputBoardNo();
                bm.deleteBoard(boardNo);
            } else if (menuNum == 7) {
                String boardTitle = iBoard.inputBoardTitle();
                bm.searchBoard(boardTitle);
            } else if (menuNum == 8) {
                sortSubMenu();
            } else if (menuNum == 9) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            } else {
                System.out.println("정확한 메뉴 번호를 입력해주세요.");
            }
        }

    }

    public void sortSubMenu() {
        System.out.print("***** 게시글 정렬 메뉴 *****\n" +
                "1. 글번호순 오름차순 정렬\n" +
                "2. 글번호순 내림차순 정렬\n" +
                "3. 작성날짜순 오름차순 정렬\n" +
                "4. 작성날짜순 내림차순 정렬\n" +
                "5. 글제목순 오름차순 정렬\n" +
                "6. 글제목순 내림차순 정렬\n" +
                "7. mainMenu()메소드로 이동\n" +
                "메뉴 번호를 입력하세요 : ");
        int sortNum = sc.nextInt();
        sc.nextLine();
        switch (sortNum) {
            case 1:
                AscBoardNo ascBNo = new AscBoardNo();
                bm.sortList(ascBNo);
                break;
            case 2:
                DescBoardNo descBNo = new DescBoardNo();
                bm.sortList(descBNo);
                break;
            case 3:
                AscBoardDate ascBDate = new AscBoardDate();
                bm.sortList(ascBDate);
                break;
            case 4:
                DescBoardDate descBDate = new DescBoardDate();
                bm.sortList(descBDate);
                break;
            case 5:
                AscBoardTitle ascBoardTitle = new AscBoardTitle();
                bm.sortList(ascBoardTitle);
                break;
            case 6:
                DescBoardTitle descBoardTitle = new DescBoardTitle();
                bm.sortList(descBoardTitle);
                break;
            case 7:
            default:
                break;
        }
    }
}
