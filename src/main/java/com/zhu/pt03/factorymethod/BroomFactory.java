package com.zhu.pt03.factorymethod;

public class BroomFactory {
    public Moveable create(){
        System.out.println("Broom created!");
        return new Broom();
    }
}
