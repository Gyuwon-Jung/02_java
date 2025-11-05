package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard() {
        BoardDTO newBoard = new BoardDTO();

        newBoard.setBoardTitle(inputBoardTitle());
        newBoard.setBoardWriter(inputBoardWriter());
        newBoard.setBoardContent(inputBoardContent());
        newBoard.setBoardDate(new Date());

        return newBoard;
    }

    public int inputBoardNo() {
        System.out.print("게시글 번호를 입력하세요 : ");
        int no = sc.nextInt();
        sc.nextLine();
        return no;
    }

    public String inputBoardTitle() {
        System.out.print("제목을 입력하세요 : ");
        return sc.nextLine();
    }

    public String inputBoardWriter() {
        System.out.print("작성자 이름을 입력하세요 : ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        System.out.println("<<<글을 작성하세요 : 저장하시려면 exit를 입력하세요.>>>");

        String input = null;
        StringBuilder bContent = new StringBuilder("");
        while (true) {
            input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) break;
            bContent.append(input + "\n");
        }
        return bContent.toString();
    }
}
