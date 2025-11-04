package com.rlatjddms.level02.normal.book.run;

import com.rlatjddms.level02.normal.book.model.dto.BookDTO;
import com.rlatjddms.level02.normal.student.model.vo.StudentVO;

public class Application {

    public static void main(String[] args) {

        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();

        bookDTO = new BookDTO("자바의 정석", "남궁성", "도우출판");
        bookDTO.printInformation();

        bookDTO = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookDTO.printInformation();
    }
}
