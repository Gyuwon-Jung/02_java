package com.ohgiraffers.api.string;

public class StringProcess {
    public String preChar(String str){
        String preUp = str.substring(0,1).toUpperCase() + str.substring(1);
        return preUp;
    }
    public int charSu(String s, char ch){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
