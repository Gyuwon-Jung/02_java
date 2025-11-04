package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList = new ArrayList<>();

    public void addBook(BookDTO book) {
        bookList.add(book);
        System.out.println("도서가 추가되었습니다.");
    }

    public void deleteBook(int index) {
        for (int i =0; i < bookList.size(); i++) {
            if(bookList.get(i).getbNo() == index) {
                bookList.remove(i);
                System.out.println("도서가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("삭제할 도서를 찾을 수 없습니다.");

    }

    public int searchBook(String bTitle) {

        if (bookList.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equals(bTitle)) {
                return i;
            }
        }
        return -1;
    }

    public void printBook(int index) {
        if (index < 0 || index >= bookList.size()) {
            System.out.println("조회한 도서가 존재하지 않음");
        } else {
            System.out.println(bookList.get(index));
        }
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

        if (bookList.isEmpty()) {
            System.out.println("출력할 도서가 없습니다.");
            return bookList;
        }

        ArrayList<BookDTO> sorted = new ArrayList<>(bookList);
        if (select == 1) {
            sorted.sort(new AscCategory());
        } else if (select == 2) {
            sorted.sort(new DescCategory());
        } else {
            System.out.println("번호를 잘못입력하였습니다");
        }
        printBookList(sorted);
        return sorted;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }
}
