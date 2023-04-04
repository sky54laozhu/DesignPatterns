package com.zhu.pt03.factorymethod;

public class PlaneFactory {
    public Moveable create(){
        System.out.println("Plane created!");
        return new Plane();
    }
}
