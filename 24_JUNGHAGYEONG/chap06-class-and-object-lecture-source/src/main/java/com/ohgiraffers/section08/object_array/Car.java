package com.ohgiraffers.section08.object_array;

public class Car {

    private String modelNmae;
    private double maxSpeed;

    public Car() {

    }

    public Car(String modelNmae, double maxSpeed) {
        this.modelNmae = modelNmae;
        this.maxSpeed = maxSpeed;
    }

    public void driveMaxSpeed() {
        System.out.println(modelNmae + "차량이 최고 시속 " + maxSpeed + "(km/h)으로 달립니다.");
    }
}
