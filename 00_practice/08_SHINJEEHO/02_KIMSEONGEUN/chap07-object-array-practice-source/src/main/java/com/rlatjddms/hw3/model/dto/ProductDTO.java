package com.rlatjddms.hw3.model.dto;

import com.rlatjddms.hw3.controller.ProductController;

public class ProductDTO {

    private int pLd;
    private String pName;
    private int price;
    private double tax;

    public ProductDTO() {
        ProductController.count++;
    }

    public ProductDTO(int pLd, String pName, int price, double tax) {
        this.pLd = pLd;
        this.pName = pName;
        this.price = price;
        this.tax = tax;
        ProductController.count++;
    }

    public String information() {
        return "제품 번호 = " + pLd +
                ", 제품명 = " + pName +
                ", 제품 가격 = " + price +
                ", 제품 세금 = " + tax;
    }
}
