package org.itstack.demo.design;

import sun.print.PSPrinterJob;

public class Singleton_04 {

    /*private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {
    }

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }*/
/**
 * @description: 内部类线程安全
 * @param null 1
 * @return
 */
    private static class SingletonHolder{
        private static Singleton_04 instance = new Singleton_04();
    }
    private Singleton_04(){

    }
    public static Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }
}
