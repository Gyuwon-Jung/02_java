package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    Scanner sc = new Scanner(System.in);
    public BoardDTO InputBoard(){
        System.out.print("글 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("작성자를 입력해주세요 : ");
        String author = sc.nextLine();
        System.out.print("글 내용을 입력해주세요");
        String content = sc.nextLine();

        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setBoardTitle(title);
        boardDTO.setBoardContent(content);
        boardDTO.setBoardWriter(author);
        boardDTO.setBoardDate(new Date());

        return boardDTO;
    }

    public int InputBoardNo(){
        System.out.print("글 번호를 입력해주세요 : ");
        int no = sc.nextInt();
        sc.nextLine();
        return no;
    }

    public String InputBoardTitle(){
        System.out.print("글 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        return title;
    }

    public String InputBoardContent(){
        System.out.print("글 내용을 입력해주세요 : ");
        String content = sc.nextLine();
        return content;
    }
}
