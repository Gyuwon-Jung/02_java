package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public BookManager() {
        // bookList 인스턴스 생성
        List<BookDTO> bookList= ArrayList<BookDTO>();
    }

    public void addBook(BookDTO book) {

//bookList에 도서 추가

    }

    public void deleteBook(int index) {
//전달받은 index로 삭제

    }

    public int searchBook(String bTitle) {
//도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
//도서명이 일치하는 객체가 리스트에 없으면 -1을 리턴
    }

    public void printBook(int index) {
// index에 해당하는 객체 출력
// 조회한 도서가 없을 경우 “조회한 도서가 존재하지 않음”출력

    }

    public void displayAll() {
// 도서 전체 리스트를 출력
// 출력할 도서가 없을 경우 “출력할 도서가 없습니다”라고 출력

    }

    public ArrayList<Book> sortedBookList(int select) {
        if(select == 0){

        } else if(select == 1){

        } else {

        }
    }

    public void printBookList(ArrayList<BookDTO> br) {
// 향상된 for문을 이용하여 전달받은 ArrayList<BookDTO> 전체 출력

    }
}
