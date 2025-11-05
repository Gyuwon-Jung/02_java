package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;
import java.util.Date;

public class AscBoardDate implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
            Date d1 = b1.getBoardDate();
            Date d2 = b2.getBoardDate();
            if (d1 == null && d2 == null) return 0;
            if (d1 == null) return -1;
            if (d2 == null) return 1;
            return d1.compareTo(d2);
    }
}
