package com.zhu.pt01;

public enum Singleton7 {
    INSTANCE;
    public Singleton7 getInstance(){
        return INSTANCE;
    }
    public void f1(){
        System.out.println("enum Singleton7.f1()");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(INSTANCE.hashCode())
            ).start();
        }
    }
}
