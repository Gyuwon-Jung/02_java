package com.ohgiraffers.api.object;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String type, String color, int i) {
        this.carName = type;
        this.carColor = color;
        this.engineCC = i;
    }
    public boolean equals(Car yourCar) {
        if (carName.equals(yourCar.carName) && carColor.equals(yourCar.carColor)) {
            return true;
        } else {
            return false;
        }
    }

    public void hashCode(Car hisCar) {
        //if(car.hash);
    }
}
