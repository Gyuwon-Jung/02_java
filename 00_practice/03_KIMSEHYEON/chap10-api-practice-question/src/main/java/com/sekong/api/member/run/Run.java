package com.sekong.api.member.run;

import com.sekong.api.member.model.vo.Member;

public class Run {
    public static void main(String[] args) {
        String string = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        String[] member = string.split("\\|");
        Member[] mem =  new Member[member.length];
        for(int i=0;i<member.length;i++){
            System.out.println(member[i]);
            mem[i] = new Member();
            String m = member[i];
            m.split(",");


        }

    }
}
