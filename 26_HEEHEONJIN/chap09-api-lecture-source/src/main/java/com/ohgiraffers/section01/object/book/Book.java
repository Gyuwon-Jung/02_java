package main.java.com.ohgiraffers.section01.object.book;

public class Book {
    /*필드 선언*/
    private int number;
    private String title;
    private String author;
    private int price;
    
    /*기본생성자*/

    public Book() {
        super();
    }
    /*모든필드를 초기화하는 생성자*/
    /*getter & setter*/
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /*1. toString 오버라이딩*/

    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';

    }

    /*2.equals() 오버라이딩*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        Book other = (Book) obj;
        if (number != other.number) {
            return false;
        }

        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }

        if (author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!author.equals(other.author)) {
            return false;
        }
        return true;
    }

    /*3. hashCode() 오버라이딩*/
    @Override
    public int hashCode() {
        /*곱샘 연산을 누적시켜애하기 때문에 0이 아닌 값으로 초기화*/
        int result = 1;
        /*
        * 필드마다 곱해줄 소수값을 선언
        * 31운 소수이기 때문에 연산시 동잃한 hashCode값이 나오지 않을 확률이 증가시킨다.*/
        final int PRIME = 31;

        result = PRIME * result + number;
        result = PRIME * result + title.hashCode();
        result = PRIME * result + author.hashCode();
        result = PRIME * result + price;

        return result;
    }

}
