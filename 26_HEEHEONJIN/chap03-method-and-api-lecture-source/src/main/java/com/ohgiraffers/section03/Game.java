package com.ohgiraffers.section03;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.gameStart();
    }
    public void gameStart() {

        int firstNum =  (int) (Math.random() * 9) + 1;
        int secondNum = (int) (Math.random() * 9) + 1;
        int thirdNum =  (int) (Math.random() * 9) + 1;

        int[] answer = new int[]{1, 2, 3}; // {firstNum, secondNum, thirdNum}

        int win = 0;
        int lose = 0;
        int tie = 0;

        while (win < 3) {
            win = 0;
            lose = 0;
            tie = 0;

            int[] inputs = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.println("1에서 9 사이의 숫자를 입력해주세요.");
                Scanner scanner = new Scanner(System.in);
                inputs[i] = scanner.nextInt();
            }

        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i] == answer[i]) {
                win++;
            } else if (inputs[i] == answer[0] || inputs[i] == answer[1] || inputs[i] == answer[2]) {
                tie++;
            } else {
                lose++;
            }
        }
            String total = "너는 " + win + "판 이겼고, "+ tie + "판 비겼으며, " + lose + "판 졌습니다.";
            System.out.println(total);
        }
    }
}