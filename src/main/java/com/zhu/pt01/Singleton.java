package com.zhu.pt01;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){

    }
    public  static Singleton getInstance(){
        return singleton;
    }

    public static void main(String[] args) {
        Singleton s1 = getInstance();
        Singleton s2 = getInstance();
        System.out.println(s1 == s2);
    }
    public void f1(){
        System.out.println("Singleton.f1()");
    }
}
