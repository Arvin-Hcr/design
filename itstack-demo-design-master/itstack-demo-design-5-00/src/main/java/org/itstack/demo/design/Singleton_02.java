package org.itstack.demo.design;
/**
 * @description: 线程安全
 * @return
 */
public class Singleton_02 {

   /* private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if (null != instance) return instance;
        return new Singleton_02();
    }*/
   /**
    * @description: 懒汉模式线程安全（枷锁）
    * @param null 1
    * @return
    */
   private static Singleton_02 instance;
   private Singleton_02(){}
   public static synchronized Singleton_02 getInstance(){
       if (null != instance){
           return instance;
       }
       return new Singleton_02();
   }

}
