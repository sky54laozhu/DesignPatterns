package com.zhu.pt03.abstractfactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new ModenFactory();
        Food food = abstractFactory.createFood();
        Weapon weapon = abstractFactory.createWeapon();
        Vehicle vehicle = abstractFactory.createVehicle();
        food.printName();
        weapon.shoot();
        vehicle.go();
    }
}
