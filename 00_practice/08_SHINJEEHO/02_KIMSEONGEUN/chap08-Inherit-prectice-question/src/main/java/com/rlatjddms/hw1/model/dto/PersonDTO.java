package com.rlatjddms.hw1.model.dto;

public class PersonDTO {

    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {
    }

    public PersonDTO(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String information() {
        return "이름 = " + name +
                ", 나이 = " + age +
                ", 신장 = " + height +
                ", 몸무게 = " + weight;
    }

    public void setName(String name) {
        this.name = name;
    }
}
