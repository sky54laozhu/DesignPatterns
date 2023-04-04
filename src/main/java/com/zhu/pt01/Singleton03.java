package com.zhu.pt01;

/**
 * 懒汉式初始化，在第一次使用的时候初始化
 *
 */
public class Singleton03 {
    private static Singleton03 singleton ;
    private Singleton03(){

    }

    /**
     * 存在线程不安全的问题,加synchronized可以解决并发问题，但是效率会降低
     * @return
     */
    public  static synchronized Singleton03 getInstance(){
        if(null == singleton){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            singleton = new Singleton03();
        }
        return singleton;
    }

    public static void main(String[] args) {
//        Singleton02 s1 = getInstance();
//        Singleton02 s2 = getInstance();
//        System.out.println(s1 == s2);
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                System.out.println(getInstance().hashCode())
            ).start();
        }
    }
    public void f1(){
        System.out.println("Singleton02.f1()");
    }
}
