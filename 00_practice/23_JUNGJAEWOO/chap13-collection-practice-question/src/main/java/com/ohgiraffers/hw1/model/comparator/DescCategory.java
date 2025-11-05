package com.ohgiraffers.hw1.model.comparator;

import java.util.Comparator;
import com.ohgiraffers.hw1.model.dto.BookDTO;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return Integer.compare(o2.getCategory(), o1.getCategory());
    }
}
