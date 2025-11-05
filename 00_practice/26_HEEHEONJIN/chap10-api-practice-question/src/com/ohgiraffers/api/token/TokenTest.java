package com.ohgiraffers.api.token;

import com.ohgiraffers.api.object.Car;

import java.util.Arrays;

public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        char[] charArray = new char[str.length()];

        String[] Arr = str.split(" ");
        int count = (Arrays.toString(Arr).length());

        System.out.println(count);
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
            System.out.print(charArray[i]);
        }
    }
}
