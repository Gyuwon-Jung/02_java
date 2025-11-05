package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class DescBoardNo implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        if (o1.getBoardNo() > o2.getBoardNo()) {
            return -1;
        } else if (o1.getBoardNo() < o2.getBoardNo()) {
            return 1;
        } else
            return 0;

    }
}
