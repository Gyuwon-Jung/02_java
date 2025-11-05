package com.ohgiraffers.io.controller;

import java.io.BufferedWriter;

public class FileController {

    public void fileSave() {

        if(save.equlasIgnoreCase("y")) {
            System.out.println("저장할 파일명을 입력하시오 : ");
            String fileName = sc.nextLine();
            BufferedWriter bw = null;

        }



        System.out.println();

        //덮어쓰기!!!

    }

    public void fileOpen() {
        System.out.println();

        //덮어쓰기!!!

    }

    public void fileEdit() {
        System.out.println();

        //덮어쓰기!!!

    }


}

/*public void fileSave() {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String line;

    System.out.println("내용을 입력하세요. 종료는 exit 입력");
    while(true) {
        line = sc.nextLine();
        if(line.equalsIgnoreCase("exit")) break;
        sb.append(line).append("\n");
    }

    System.out.print("저장할 파일명을 입력하시오 : ");
    String fileName = sc.nextLine();

    BufferedWriter bw = null;
    try {
        bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
        bw.write(sb.toString());
        System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
    } catch(IOException e) {
        e.printStackTrace();
    } finally {
        try { if(bw != null) bw.close(); } catch(IOException e) { e.printStackTrace(); }
    }
}*/
