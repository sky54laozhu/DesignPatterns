package com.zhu.pt03.factorymethod;


import com.zhu.pt03.factorymethod.BroomFactory;
import com.zhu.pt03.factorymethod.CarFactory;
import com.zhu.pt03.factorymethod.Moveable;
import com.zhu.pt03.factorymethod.PlaneFactory;

public class Test {
    public static void main(String[] args) {
        Moveable broom = new BroomFactory().create();
        broom.go();
        Moveable car = new CarFactory().create();
        car.go();
        Moveable plane = new PlaneFactory().create();
        plane.go();
    }
}
