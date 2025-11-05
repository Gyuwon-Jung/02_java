package com.seding.hw1.dto;

public class BookDTO {
    private int bNO;
    private int category;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(int bNO, int category, String title, String author) {
        this.bNO = bNO;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNO() {
        return bNO;
    }

    public void setbNO(int bNO) {
        this.bNO = bNO;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    @Override
    public String toString() {
//        필드 값 문자열 합친 후 리턴
//        category 분류 별로 출력
//        >> 1 : 인문 / 2 : 자연과학
//        3 : 의료 / 4 : 기타
        return String.format(
                "[번호:%d] [분류:%d] [제목:%s] [저자:%s]",
                bNO, category, title, author
        );
    }


}
