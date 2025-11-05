package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    private Scanner sc = new Scanner(System.in);

    public BoardDTO inputBoard() {
        System.out.println("\n===== 새 게시글 작성 =====");
        System.out.print("글 제목: ");
        String title = sc.nextLine();

        System.out.print("작성자: ");
        String writer = sc.nextLine();

        System.out.println("내용을 입력하세요. (입력 종료: exit)");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line.trim())) break;
            content.append(line).append(System.lineSeparator());
        }

        Date date = new Date(); // 현재 날짜 등록
        return new BoardDTO(0, title, writer, date, content.toString(), 0);    }

    public int InputBoardNo() {
        System.out.print("글 번호를 입력하세요: ");
        while (!sc.hasNextInt()) {
            System.out.print("숫자를 입력하세요: ");
            sc.next();
        }
        int no = sc.nextInt();
        sc.nextLine();
        return no;
    }

    public String InputBoardTitle() {
        System.out.print("새 제목을 입력하세요: ");
        return sc.nextLine();
    }

    public String InputBoardContent() {
        System.out.println("새 내용을 입력하세요. (입력 종료: exit)");
        StringBuilder content = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if ("exit".equalsIgnoreCase(line.trim())) break;
            content.append(line).append(System.lineSeparator());
        }
        return content.toString();
    }
}
