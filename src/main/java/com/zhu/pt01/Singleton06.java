package com.zhu.pt01;

public class Singleton06 {
    private Singleton06(){

    }
    private static class Singleton06_Static_Inner{
        private static final Singleton06 singleton06 = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return Singleton06_Static_Inner.singleton06;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(getInstance().hashCode())
            ).start();
        }
    }
}
