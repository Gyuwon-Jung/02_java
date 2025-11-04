package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.AniBook;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.CookBook;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {

    private Member member = new Member();
    private Book[] bList = new Book[5];
    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }

    public void insertMember(Member member) {
        this.member = member;
    }

    public Member myInfo() {
        System.out.println(member.toString());
        System.out.println();
        return member;
    }

    public Book[] selectAll() {
        return bList;
    }

    public Book[] searchBook(String keyword) {
        Book[] temp = new Book[5];
        int count = 0;

        for(int i = 0; i < bList.length; i++) {
            if(bList[i].getTitle().contains(keyword)) {
                temp[count] = bList[i];
                count++;
            }
        }

        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public int rentBook(int index) {
        int result = 0;

        for(int i = 0; i < bList.length; i++) {
            if(i == index) {
                if(bList[i] instanceof AniBook && member.getAge() <= ((AniBook) bList[i]).getAccessAge()) {
                    result = 1;
                }
                if(bList[i] instanceof CookBook && ((CookBook) bList[i]).isCoupon()) {
                    member.setCouponCount(member.getCouponCount() + 1);
                    result = 2;
                }
            }
        }

        return result;
    }
}
