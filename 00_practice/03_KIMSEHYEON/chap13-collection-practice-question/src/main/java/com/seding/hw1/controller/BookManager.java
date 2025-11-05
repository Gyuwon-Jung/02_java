package com.seding.hw1.controller;

import com.seding.hw1.dto.BookDTO;
import com.seding.hw1.model.comparator.AscCategory;
import com.seding.hw1.model.comparator.DescCategory;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private final List<BookDTO> bookList;
    public BookManager() {
        // ArrayList<BookDTO> 인스턴스 생성
        this.bookList = new ArrayList<>();
    }

    public void addBook(BookDTO book) {
//        전달받은 BookDTO객체를 생성자 시 선언한 ArrayList객체에 추가
        bookList.add(book);
    }

    public void deleteBook(int index){
//        전달받은 도서 번호로 ArryaList 안에있는 정보 삭제
        for(BookDTO book : bookList){
            if(book.getbNO() == index){
                bookList.remove(book);
            }
            else{
                System.out.println("도서가 삭제되었습니다.");
            }
        }
    }

    public int searchBook(String bTitle){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getTitle().equalsIgnoreCase(bTitle)) {
                return i;
            }
        }
        return -1; // 못 찾으면 -1

    }

    public void printBook(int index){
//        전달받은 인덱스에 있는 도서정보 출력
        if (index >= 0 && index < bookList.size()) {
            System.out.println(bookList.get(index));
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    public void displayAll(){
//        도서목록 전체 출력
        if (bookList.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        for (BookDTO b : bookList) {
            System.out.println(b);
        }
    }

    public ArrayList<BookDTO> sortBookList(int select){
//        전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴
        ArrayList<BookDTO> copy = new ArrayList<>(bookList); // 원본 보호
        if (select == 1) {
            // 오름차순
            copy.sort(new AscCategory());
        } else if (select == 2) {
            // 내림차순
            copy.sort(new DescCategory().reversed());
        } else {
            System.out.println("정렬 옵션이 올바르지 않아 정렬하지 않습니다.");
        }
        return copy;
    }

    public void printBookList(ArrayList<BookDTO> br){
//        전달 받은 ArrayList<BookDTO> 를 향상된for문을 이용하여 출력
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }
}
