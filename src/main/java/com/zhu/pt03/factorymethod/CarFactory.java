package com.zhu.pt03.factorymethod;

public class CarFactory {
    public Moveable create(){
        System.out.println("Car created!");
        return new Car();
    }
}
