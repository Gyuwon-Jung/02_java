package com.ohgiraffers.section01.list.run;

//import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDto;

import javax.xml.transform.Source;
import java.awt.print.Book;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        // 리스트계열에 데이터를 추가 : add()
        //            데이터를 조회 : get(index)
        //            데이터를 수정 : set(index, value)
        //            데이터를 삭제 : remove(index)

        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDto(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDto(3, "동의보감", "허준", 40000));
        bookList.add(new BookDto(4, "삼국사기", "김부식", 40000));
        bookList.add(new BookDto(5, "삼국유사", "일연", 50000));

        System.out.println("bookList : " + bookList);
        System.out.println("bookList : " + bookList.size()); // 요소의 수

        // 향상된 for 문을 이용해서 출력
        for (BookDto book : bookList) {
            System.out.println(book);
        }


        // Collections.sort(bookList); // 이건 안 된다.
        // Collections.sort(bookList);
//        bookList.sort(new AscendingPrice(){});
        System.out.println("가격 오름차순 정렬 =====");
        for (BookDto book : bookList) {
            System.out.println(book);
        }

        // 익명 클래스
        bookList.sort(new Comparator<BookDto>() { // 여기서부터
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getPrice() >= o2.getPrice() ? -1 : 1;
            }
        }); // 여기까지가 익명 클래스이다.

        System.out.println("가격 내림차순 정렬 =====");
        for (BookDto book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        // bookList.sort((BookDto o1, BookDto o2)-> o1.getTitle().compareTo(o2.getTitle());) 이거는 람다사용 표현
        // 양수일때만 바꿔줘 이다. 예를 들어, 70 - 80 일때 -10 음수 80 - 70 은 10 양수다.
        System.out.println("책 제목 오름차순 정렬 =====");
        for (BookDto book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDto>() {
            @Override
            public int compare(BookDto o1, BookDto o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        System.out.println("책 제목 내림차순 정렬 =====");
        for (BookDto book : bookList) {
            System.out.println(book);
        }
    }
}
