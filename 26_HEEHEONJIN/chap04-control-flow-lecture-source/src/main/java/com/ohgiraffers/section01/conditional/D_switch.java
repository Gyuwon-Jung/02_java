package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 : ");
        int first = sc.nextInt();
        System.out.println("두 번째 정수 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = switch (op) {
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first + second;
            }
            case '-' -> first - second;
            case '*', 'x' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> 0;
        };
//        switch(op) {
//            case '+':
//                result = first + second; break;
//                case '-':
//                    result = first - second; break;
//                    case '*':
//                        result = first * second; break;
//                        case 'x':
//                            result = first * second; break;
//                            case '/':
//                                result = first / second; break;
//            case '%':
//                result = first % second; break;
//                // case에서 일치 값을 찾지 못할 경우 수행한 구문을 작성할 수 있다.
//            default:
//        }
        System.out.println(first + " " + op + " " + second + " = " + result );
    }
}
