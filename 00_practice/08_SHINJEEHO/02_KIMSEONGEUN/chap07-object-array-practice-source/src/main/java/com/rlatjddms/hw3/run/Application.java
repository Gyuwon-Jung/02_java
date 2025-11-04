package com.rlatjddms.hw3.run;

import com.rlatjddms.hw3.controller.ProductController;

public class Application {

    public static void main(String[] args) {

        ProductController pc = new ProductController();
        pc.mainMenu();
    }
}
