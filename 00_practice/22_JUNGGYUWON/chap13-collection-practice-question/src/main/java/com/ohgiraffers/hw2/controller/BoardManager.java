package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw1.model.BookDTO;
import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class BoardManager {
    private ArrayList<BoardDTO> boardList;
    private ResultPrinter rp= new ResultPrinter();

    public void insertBoard(BoardDTO boardDTO){
        if(boardList == null){
            boardList = new ArrayList<>();
        }

        if(boardList.isEmpty()){
            boardDTO.setBoardNo(0);
            boardList.add(boardDTO);
            rp.successPage("게시물 등록 성공!");
        }
        else{
            boardDTO.setBoardNo(boardList.size());
            boardList.add(boardDTO);
            rp.successPage("게시물 등록 성공!");
        }


    }

    public void selectAllList(){
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo){
        BoardDTO result = null;
        for(BoardDTO boardDTO : boardList){
            if(boardDTO.getBoardNo() == boardNo){
                result = boardDTO;
            }
        }
        if(result != null){
            result.setReadCount(result.getReadCount()+1);
            System.out.println(result);
        }
        else{
            rp.errorPage("조회된 글이 없습니다.");
            rp.noSearchResult();

        }

    }

    public void updateBoardTitle(int boardNo, String title){
        BoardDTO result = null;
        for(BoardDTO boardDTO : boardList){
            if(boardDTO.getBoardNo() == boardNo){
                result = boardDTO;
            }
        }
        if(result != null){
            result.setBoardTitle(title);
            rp.successPage("게시물 제목 수정 성공!");
        }
        else{
            rp.errorPage("게시물 제목 수정 실패!");
        }
    }

    public void updateBoardContent(int boardNo, String content){
        BoardDTO result = null;
        for(BoardDTO boardDTO : boardList){
            if(boardDTO.getBoardNo() == boardNo){
                result = boardDTO;
            }
        }
        if(result != null){
            result.setBoardTitle(content);
            rp.successPage("게시물 내용 수정 성공!");
        }
        else{
            rp.errorPage("게시물 내용 수정 실패!");
        }
    }

    public void deleteBoard(int boardNo){
        BoardDTO result = null;
        for(BoardDTO boardDTO : boardList){
            if(boardDTO.getBoardNo() == boardNo){
                result = boardDTO;
            }
        }
        if(result != null){
                boardList.remove(result);
            rp.successPage("게시글 삭제 성공!");
        }
        else{
            rp.errorPage("게시글 삭제 실패!");
        }
    }

    public void searchBoard(String title){
        ArrayList<BoardDTO> result = new ArrayList<>();
        for(BoardDTO boardDTO : boardList){
            if(boardDTO.getBoardTitle().toLowerCase().contains(title.toLowerCase())){
                result.add(boardDTO);
            }
        }

        if(result.isEmpty()){
            rp.noSearchResult();

        }
        else{
            for (BoardDTO boardDTO : result) {
                System.out.println(boardDTO.getBoardTitle());
            }
        }
    }

    public void sortList(Comparator<BoardDTO> c){

        ArrayList<BoardDTO> result = new ArrayList<>();
        for(BoardDTO boardDTO : boardList){
            result.add(boardDTO);
        }
        result.sort(c);

        for (BoardDTO boardDTO : result) {
            System.out.println(boardDTO);
        }

    }
}
