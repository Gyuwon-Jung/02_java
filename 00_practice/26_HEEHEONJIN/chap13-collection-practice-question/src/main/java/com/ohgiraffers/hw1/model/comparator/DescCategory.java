package com.ohgiraffers.hw1.model.comparator;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO c1, BookDTO c2) {
        int result = 0;
        if (c2.getCategory() > c1.getCategory()) {
            result = 1;
        }  else if (c2.getCategory() < c1.getCategory()) {
            result = -1;
        } else result = 0;
        return result;
    }
}
