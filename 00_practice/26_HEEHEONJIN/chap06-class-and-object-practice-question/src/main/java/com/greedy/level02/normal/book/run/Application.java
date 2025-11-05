package main.java.com.greedy.level02.normal.book.run;

import main.java.com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {
    public static void main(String[] args) {
        BookDTO bookDTO = new BookDTO();

        bookDTO.printInformation();
        System.out.println();


        bookDTO.setTitle("자바의 정석");
        bookDTO.setPublisher("도우출판");
        bookDTO.setAuthor("남궁서");
        bookDTO.printInformation();
        System.out.println();


        bookDTO.setTitle("홍길동전");
        bookDTO.setPublisher("활빈당");
        bookDTO.setAuthor("허균");
        bookDTO.setPrice(50000000);
        bookDTO.setDiscountRate(0.5);
        bookDTO.printInformation();


    }
}
