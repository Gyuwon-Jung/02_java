package com.ohgiraffers.hw1.model.dto;

public class BookDTO {
    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {
    }

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
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
        String categoryStr;
        switch (category) {
            case 1 -> categoryStr = "인문";
            case 2 -> categoryStr = "자연과학";
            case 3 -> categoryStr = "의료";
            case 4 -> categoryStr = "기타";
            default -> categoryStr = "미지정";
        }
        return "[" +
                "bNo=" + bNo +
                ", category=" + categoryStr +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ']';
    }
}
