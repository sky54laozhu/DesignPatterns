package com.zhu.pt01;

public class Test {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        singleton.f1();
        Singleton7 singleton7 = Singleton7.INSTANCE;
        singleton7.f1();
    }
}
