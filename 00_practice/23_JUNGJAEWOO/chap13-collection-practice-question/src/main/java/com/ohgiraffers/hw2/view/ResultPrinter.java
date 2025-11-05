package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("게시물이 없습니다.");
            return;
        }
        System.out.println("\n===== 게시글 목록 =====");
        for (BoardDTO b : list) {
            System.out.printf("#%d | %s | %s | %s | 조회수 %d%n",
                    nz(b.getBoardNo()),
                    ns(b.getBoardTitle()),
                    ns(b.getBoardWriter()),
                    // 날짜 포맷 지정 없이 그냥 표시
                    String.valueOf(b.getBoardDate()),
                    nz(b.getReadCount()));
        }
        System.out.println("======================");
    }

    public void printBoard(BoardDTO b) {
        if (b == null) {
            System.out.println("조회된 글이 없습니다.");
            return;
        }
        System.out.println("\n===== 게시글 상세 =====");
        System.out.println("번호     : " + nz(b.getBoardNo()));
        System.out.println("제목     : " + ns(b.getBoardTitle()));
        System.out.println("작성자   : " + ns(b.getBoardWriter()));
        System.out.println("작성일   : " + String.valueOf(b.getBoardDate()));
        System.out.println("조회수   : " + nz(b.getReadCount()));
        System.out.println("내용 -----------------");
        System.out.print(ns(b.getBoardContent()));
        System.out.println("\n----------------------");
    }

    public void errorPage(String msg) {
        switch (safe(msg)) {
            case "insertBoard":
                System.out.println("게시물 등록 실패");
                break;
            case "selectOne":
                System.out.println("조회된 글이 없습니다.");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 실패!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;
            default:
                System.out.println("요청 처리에 실패했습니다.");
        }
    }

    public void successPage(String msg) {
        switch (safe(msg)) {
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 성공!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 성공!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 성공!");
                break;
            default:
                System.out.println("요청이 성공적으로 처리되었습니다.");
        }
    }

    public void noSearchResult() {
        System.out.println("검색결과가 없습니다.");
    }

    /* ===== util ===== */
    private String ns(String v)   { return v == null ? "" : v; }
    private int nz(Integer v)     { return v == null ? 0 : v; }
    private String safe(String v) { return v == null ? "" : v; }
}

