package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;
import java.util.Iterator;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> list){
        Iterator<BoardDTO> iterator = list.iterator();
        if(list.isEmpty()){
            System.out.println("게시물이 없습니다.");
        }
        else {
            while (iterator.hasNext()) {
                BoardDTO boardDTO = iterator.next();
                System.out.println(boardDTO.toString());
            }
        }
    }

    public void printBoard(BoardDTO b){
        System.out.println(b);
    }

    public void errorPage(String msg){
        System.out.println(msg);
    }

    public void successPage(String msg){
        System.out.println(msg);
    }

    public void noSearchResult(){
        System.out.println("검색 결과가 없습니다.");
    }
}
