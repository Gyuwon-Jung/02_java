package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BoardManager {

    private ArrayList<BoardDTO> boardList;
    ResultPrinter rp = new ResultPrinter();
    Scanner sc = new Scanner(System.in);

    public void insertBoard(BoardDTO b) {
        int boardNo = 0;
        if (boardList == null) {
            boardList = new ArrayList<>();
            boardNo = 1;
        } else {
            boardNo = boardList.size() + 1; // +1해야되는지 점검 필요
        }
        b.setBoardNo(boardNo);
        if (boardList.add(b)) {
            rp.successPage("insertBoard");
        } else {
            rp.errorPage("insertBoard");
        }
    }

    public void selectAllList() {
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                rp.printBoard(b);
                b.setReadCount(b.getReadCount() + 1);
                return;
            }
        }
        rp.errorPage("selectOne");
    }

    public void updateContent(int boardNo, String content) {
        for  (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardContent(content);
            }
        }
    }

    public void updateBoardTitle(int boardNo, String title) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                b.setBoardTitle(title);
                rp.successPage("updateTitle");
                return;
            }
        }
        rp.errorPage("updateTitle");
    }

    public void deleteBoard(int boardNo) {
        for (BoardDTO b : boardList) {
            if (b.getBoardNo() == boardNo) {
                boardList.remove(b);
                rp.successPage("deleteBoard");
                return;
            }
        }
        rp.errorPage("deleteBoard");
    }

    public void searchBoard(String title) {
        BoardDTO tgBoard = null;
        for (BoardDTO b : boardList) {
            if (b.getBoardTitle().equals(title)) {
                tgBoard = b;
            }
        }
        if (tgBoard != null) {
            rp.printBoard(tgBoard);
        } else {
            System.out.println("해당 제목을 가진 게시글이 없습니다.");
        }
    }

    public void sortList(Comparator<BoardDTO> c) {
        ArrayList<BoardDTO> tempList = new ArrayList<>();
        tempList = boardList;
        tempList.sort(c);
        rp.printAllList(tempList);
    }
}
