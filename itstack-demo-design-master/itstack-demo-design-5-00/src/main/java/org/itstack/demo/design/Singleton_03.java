package org.itstack.demo.design;

public class Singleton_03 {

    /*private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {
    }

    public static Singleton_03 getInstance() {
        return instance;
    }*/

    /**
     * @description: 饿汉模式
     * @param null 1
     * @return
     */
    private static Singleton_03 instance = new Singleton_03();
    private Singleton_03(){}
    private static Singleton_03 getInstance(){
        return instance;
    }
}
