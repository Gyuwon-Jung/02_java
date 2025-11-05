package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.*;

public class BoardManager {
    private final ArrayList<BoardDTO> boardList = new ArrayList<>();
    private final ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO b) {
        if (b == null) {
            rp.errorPage("insertBoard");
            return;
        }
        int nextNo = boardList.isEmpty() ? 1 : boardList.get(boardList.size() - 1).getBoardNo() + 1;
        b.setBoardNo(nextNo);
        if (b.getBoardDate() == null) b.setBoardDate(new Date());
        b.setReadCount(0);

        boardList.add(b);
        rp.successPage("insertBoard");
    }

    public void selectAllList() {
        rp.printAllList(new ArrayList<>(boardList));

    }

    public void selectOneBoard(int i) {
        BoardDTO found = findByNo(i);
        if (found == null) {
            rp.errorPage("selectOne");
            return;
        }
        found.setReadCount(found.getReadCount() + 1);
        rp.printBoard(found);
    }

    public void updateBoardTitle(int i, String s) {
        BoardDTO found = findByNo(i);
        if (found == null) {
            rp.errorPage("updateTitle");
            return;
        }
        found.setBoardTitle(s);
        rp.successPage("updateTitle");
    }

    public void updateBoardContent(int i, String s) {
        updateBoardContent(i, s);

    }

    public void deleteBoard(int i) {
        int idx = indexOfNo(i);
        if (idx < 0) {
            rp.errorPage("deleteBoard");
            return;
        }
        boardList.remove(idx);
        rp.successPage("deleteBoard");
    }

    public void searchBoard(String s) {
        if (s == null) s = "";
        String needle = s.toLowerCase();

        List<BoardDTO> result = new ArrayList<>();
        for (BoardDTO b : boardList) {
            String t = Objects.toString(b.getBoardTitle(), "");
            if (t.toLowerCase().contains(needle)) {
                result.add(b);
            }
        }
    }

    public void sortList (Comparator < BoardDTO > c) {
        if (boardList.isEmpty()) {
            rp.printAllList(new ArrayList<>(boardList));
            return;
        }
        Collections.sort(boardList, c);
        rp.printAllList(new ArrayList<>(boardList));
    }

    private BoardDTO findByNo ( int boardNo){
        int idx = indexOfNo(boardNo);
        return idx >= 0 ? boardList.get(idx) : null;
    }

    private int indexOfNo ( int boardNo){
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getBoardNo() == boardNo) return i;
        }
        return -1;
    }
}

