package org.itstack.demo.design;

public class Singleton_05 {

   /* private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance(){
       if(null != instance) return instance;
       synchronized (Singleton_05.class){
           if (null == instance){
               instance = new Singleton_05();
           }
       }
       return instance;
    }*/
    /**
     * @description: 双重锁校验，方法级锁
     * @param null 1
     * @return
     */
    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance() {
        if (null != instance) {
            return instance;
        }
        synchronized (Singleton_05.class) {
            instance = new Singleton_05();
        }
        return instance;
    }
}


