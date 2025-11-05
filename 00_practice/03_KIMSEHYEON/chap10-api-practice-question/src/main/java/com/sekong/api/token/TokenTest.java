package com.sekong.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
//        - 요구사항
//        1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
//        2. 토큰 처리전 글자 및 개수 출력
//        3. 토큰 처리 후 문자배열 갯수 출력 확인
//        4. `char[]` 값 출력
//        5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력
        String s = "J a v a P r o g r a m ";
        System.out.println("string : "+ s +"\nstring.length() : "+s.length());
        char[] chars;
        StringTokenizer st = new StringTokenizer(s," ");
        char[] ch = new char[st.countTokens()];
        int i = 0;
        while(st.hasMoreTokens()) {
            ch[i] = st.nextToken().charAt(0);
            i++;
        }
        System.out.println("토큰 처리 후 문자 배열 개수: " + ch.length);
        System.out.println(Arrays.toString(ch));
        String s1 = "";
        for(int j = 0; j < ch.length; j++){
            s1 = s1+ch[j];
        }
        System.out.println(s1);
        System.out.println(s1.toUpperCase());




    }

}

