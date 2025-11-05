package com.swcamp.section03.reference;

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
