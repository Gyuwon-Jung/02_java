package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import java.util.Comparator;

public class DescBoardTitle implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO b1, BoardDTO b2) {
        String t1 = b1.getBoardTitle() == null ? "" : b1.getBoardTitle();
        String t2 = b2.getBoardTitle() == null ? "" : b2.getBoardTitle();
        return t2.compareToIgnoreCase(t1);
    }
}
