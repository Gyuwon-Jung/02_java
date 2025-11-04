package com.ohgiraffers.io.note.controller;

import java.io.*;
import java.util.Scanner;

public class FileController {

    private Scanner sc = new Scanner(System.in);

    public void fileSave() {
        StringBuilder sb = new StringBuilder();
        System.out.print("내용 입력 (종료는 'exit') : ");

        while (true) {
            String line = sc.nextLine();
            if (line.equals("exit")) {
                break;
            }
            sb.append(line).append("\n");
        }

        System.out.print("저장하시겠습니까? (y/n) : ");
        String save = sc.nextLine();

        if (save.equalsIgnoreCase("y")) {
            System.out.print("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;

            try {
                bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/note/list/" + fileName + ".txt"));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public void filOpen() {

        System.out.print("열기 할 파일명 : ");
        String fileName = sc.nextLine();
        String content = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/note/list/" + fileName + ".txt"));

            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 존재하지 않습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void fileEdit() {
        String save;

        System.out.print("수정할 파일명 : ");
        String fileName = sc.nextLine();
//      StringBuilder 사용
        BufferedReader br = null;
        String content = null;

        // 기존 내용 출력
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/ohgiraffers/io/note/list/" + fileName + ".txt"));
            while ((content = br.readLine()) != null) {
                System.out.println(content);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        // 내용 입력
        StringBuilder sb = new StringBuilder();
        System.out.print("추가 할 내용 (종료는 'exit') : ");
        while (true) {
            content = sc.nextLine();
            if (content.equals("exit")) {
                break;
            }
            sb.append(content).append("\n");
        }
        BufferedWriter bw = null;

        // 내용 저장
        try {
            System.out.print("저장하시겠습니까? (y/n) : ");
            save = sc.nextLine();

            if (save.equalsIgnoreCase("y")) {
                bw = new BufferedWriter(new FileWriter("src/main/java/com/ohgiraffers/io/note/list/" + fileName + ".txt", true));
                bw.write(sb.toString());
                System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
            } else {
                System.out.println("다시 메뉴로 돌아갑니다.");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
