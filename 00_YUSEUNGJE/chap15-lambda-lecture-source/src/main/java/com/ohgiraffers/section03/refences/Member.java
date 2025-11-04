package com.ohgiraffers.section03.refences;

public class Member {

    private String memberId;

    public Member(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                '}';
    }
}
