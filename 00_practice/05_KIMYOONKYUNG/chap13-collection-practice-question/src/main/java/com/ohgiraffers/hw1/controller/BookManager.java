package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import java.util.*;



import java.util.ArrayList;

public class BookManager {

    private ArrayList<BookDTO> bookList;

     public BookManager() {
        bookList = new ArrayList<>();
    }
    public void addBook(BookDTO book) {
         bookList.add(book);
        System.out.println("도서 추가");
    }
    public void deleteBook(int index) {
        if (index >= 0 && index < bookList.size()) { //전달받은 인덱스로 삭제
            bookList.remove(index);
            System.out.println("도서 삭제");
        } else {
            System.out.println("삭제할 도서가 존재하지 않음");
        }
    }

    public int searchBook(String title) {
         for (int i = 0; i <bookList.size(); i++) {
             if (bookList.get(i).getTitle().equals(title)) { // getTitle??
                 return i;
             }
         }
         return -1;
        }

    public void printBooke(int index) {
         if(index >= 0 && index < bookList.size()) {
             System.out.println(bookList.get(index));
         }
         else{
             System.out.println("조회한 도서가 존재하지 않음");
         }
    }

    public void displayAll() {
         if (bookList.isEmpty()) {
             System.out.println("출력할 도서가 없습니다");
         } else {
             for (BookDTO book : bookList) {
                 System.out.println(book);
             }
         }
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
         ArrayList<BookDTO> list = new ArrayList<>();
         if(select == 1) {
             sortedList.sort(new AscCategory()); //왜?

         } else if (select == 2) {
             sortedList.sort(new DescCategory());  //왜?

         } else {
             System.out.println("잘못되 번호입니다.");
         }
         return list;

    }
    public void printBookList(ArrayList<BookDTO> list) {
         for (BookDTO book : list) {
             System.out.println();
         }
    }

    }



    /*

    public ArrayList<BookDTO> sortedBookList(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookList);
        if (select == 1) {
            sortedList.sort(new AscCategory());
        } else if (select == 2) {
            sortedList.sort(new DescCategory());
        } else {
            System.out.println("번호를 잘못 입력하였습니다.");
        }
        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO b : br) {
            System.out.println(b);
        }
    }
}*/


/*public void deleteBook(int index) {
        if (index >= 0 && index < bookList.size()) {
            bookList.remove(index);
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 도서가 존재하지 않습니다.");
        }
    }
*/