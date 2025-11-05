package com.ohgiraffers.hw1.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class AscCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO c1, BookDTO c2) {
        int result = 0;
        if (c1.getCategory() > c2.getCategory()) {
            result = 1;
        }  else if (c1.getCategory() < c2.getCategory()) {
            result = -1;
        } else result = 0;
        return result;
    }
}
