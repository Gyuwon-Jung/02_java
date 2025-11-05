package com.ohgiraffers.lambda.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.test1();
        app.test2();
        app.test3();
        app.test4();
        app.test5();
    }

    private void test1(){
        Runnable run1 = () -> System.out.println("현재시각 " + LocalDateTime.now().
                format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")));
        run1.run();
    }

    private void test2(){
        Supplier<Set<Integer>> supLotto = () -> {
            Set<Integer> lotto = new TreeSet<>();
            while (lotto.size() < 6) {
                lotto.add((int) (Math.random() * 45) + 1);
            }
            return lotto;
        };
        System.out.println(supLotto.get());
    }

    private void test3(){
        IntConsumer csmForDollar = (int won) -> {
            double dollar = (double) won / 1350;
            System.out.println("환율 계산 결과 : $" + dollar + " 입니다.");
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요 : ");
        int won = sc.nextInt();

        csmForDollar.accept(won);
    }

    private void test4(){
        Function<Integer, Double> funcForDollar = ( won) -> {
            return (double) won / 1350;
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요 : ");
        int won = sc.nextInt();
        double dollar = funcForDollar.apply(won);
        System.out.println(won + "원 은 현재 " + dollar + "$ 입니다.");
    }

    private void test5(){
        List<String> strList = Arrays.asList("abc", "", "대한민국", " ");
        Predicate<String> predStrLen = str -> str.trim().length() == 0;

        for (String str : strList) {
            boolean result = predStrLen.test(str);
            System.out.println("[" + str + "]의 길이는 0입니까? " + result);
        }
    }
}
