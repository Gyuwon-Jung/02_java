package chap13_collection.section01;

import chap13_collection.section01.List.AscendingPrice;
import chap13_collection.section01.List.BookDTO;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 40000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        System.out.println("=================================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new AscendingPrice());

        System.out.println("=================================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO lhs, BookDTO rhs) {
                return lhs.getPrice() >=  rhs.getPrice() ? 1 : -1;
            }
        });

        System.out.println("=================================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        bookList.sort((BookDTO o1, BookDTO o2) -> o1.getTitle().compareTo(o2.getTitle()));
        System.out.println("=================================");
        for (BookDTO book : bookList) {
            System.out.println(book);
        }

        LinkedList<String> linkedList = new LinkedList<>();
    }
}
