package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;

public class BookManager {
    private ArrayList<BookDTO> bookList;

    public BookManager() {
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
        bookList.add(book);
    }

    public void deleteBook(int index) {
        if (index < 0 || index >= bookList.size()) {
            System.out.println("해당 인덱스의 도서가 존재하지 않습니다.");
            return;
        }
        bookList.remove(index);
    }

    public int searchBook(String title) {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        if (index < 0 || index >= bookList.size()) {
            System.out.println("조회한 도서가 존재하지 않음");
            return;
        }
        System.out.println(bookList.get(index));
    }

    public void displayAll() {
        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return;
        }
        for (BookDTO b : bookList) {
            System.out.println(b);
        }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        if (select == 1) {
            Collections.sort(bookList, new AscCategory());
        } else if (select == 2) {
            Collections.sort(bookList, new DescCategory());
        }
        return bookList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        if (br == null || br.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return;
        }
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }
}

