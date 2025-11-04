package com.rlatjddms.hw1.model.dto;

public class StudentDTO extends PersonDTO {

    PersonDTO personDTO =  new PersonDTO();

    private int grade;
    private String major;

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        super.setName(name);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {

        return super.information() +
                "학년 = " + grade +
                ", 전공 = " + major;
    }
}
