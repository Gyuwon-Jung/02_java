package com.ohgiraffers.section01.conditional;
import java.util.Scanner;

    public class Game {
        public static void main(String[] args) {
            Game game = new Game();
            Scanner scanner = new Scanner(System.in);
            int[] inputs = new int[3];

            System.out.print("1에서 9 사이의 숫자를 중복되지 않게 입력해주세요.");
            for (int i = 0; i < 3; i++) {
                inputs[i] = scanner.nextInt();
                System.out.println();
            }

            game.gameStart(inputs);
        }
        public void gameStart(int [] arr) {

            int firstNum =  (int) (Math.random() * 9) + 1;
            int secondNum = (int) (Math.random() * 9) + 1;
            while (firstNum != secondNum ) {
                if (firstNum == secondNum) {
                    secondNum = (int) (Math.random() * 9) + 1;
                }
            }
            int thirdNum =  (int) (Math.random() * 9) + 1;


            System.out.println("중복되는 숫자가 있습니다. 다시 입력하시오.");

            int[] answer = new int[]{firstNum, secondNum, thirdNum}; //{firstNum, secondNum, thirdNum};
            int win = 0;
            int lose = 0;
            int tie = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == answer[i]) {
                    win++;
                } else if (arr[i] == answer[0] || arr[i] == answer[1] || arr[i] == answer[2]) {
                    tie++;
                } else {
                    lose++;
                }
            }
            String total = "너는 " + win + "이겼고, "+ tie + "비겼으며, " + lose + "졌습니다.";
            System.out.println(total);
        }
    }
