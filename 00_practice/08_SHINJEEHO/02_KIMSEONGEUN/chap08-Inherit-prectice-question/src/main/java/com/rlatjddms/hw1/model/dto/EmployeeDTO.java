package com.rlatjddms.hw1.model.dto;

public class EmployeeDTO extends PersonDTO {

    PersonDTO personDTO =  new PersonDTO();

    private int salary;
    private String dept;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);
        super.setName(name);
        this.salary = salary;
        this.dept = dept;
    }

    @Override
    public String information() {
        return super.information() +
                "급여 = " + salary +
                ", 부서 = " + dept;
    }
}
