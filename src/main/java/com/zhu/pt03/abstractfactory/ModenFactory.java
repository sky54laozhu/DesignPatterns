package com.zhu.pt03.abstractfactory;

public class ModenFactory extends AbstractFactory{
    @Override
    Food createFood() {
        System.out.println("Create Bread");
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        System.out.println("Create Car");
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        System.out.println("Create AK47");
        return new AK47();
    }
}
