package com.sekong.section01.list.comparator;

import com.sekong.section01.list.dto.BookDto;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDto> {

    /*

비교 대상 두 인스턴스의 price가 오름차순 정렬 되기 위해서는 o1의 가격이
더 작은 가격이어야 한다. 만약 o2의 가격이 더 작으면 두 인스턴스의 순서를 변경해야한다.
두 인스턴스를 교환하라는 신호로 양수를 반환하면 정렬 시 순서를 변경하는 조건으로 사용한다.
*/
    @Override
    public int compare(BookDto o1, BookDto o2) {

        int result = 0;

        if(o1.getPrice() > o2.getPrice()) {
            result = 1;
        } else if(o1.getPrice() < o2.getPrice()) {
            result = -1;
        } else {
            result = 0;
        }

        return result;
    }
}