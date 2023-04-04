package com.zhu.pt02;

public class Cat{
    int hight;
    int weight;

    public Cat(int weight){
        this.weight = weight;
    }
//    @Override
//    public int compareTo(Object o) {
//        Cat c = (Cat) o;
//        return this.weight - c.weight;
//    }

    @Override
    public String toString() {
        return "Cat(" + weight + ")";
    }
}
