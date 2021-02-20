package org.itstack.demo.design;

public class Singleton_01 {

  /*  private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance(){
        if (null != instance) return instance;
        return new Singleton_01();
    }*/

  /**
   * @description: lan han mo shi
   * xian cheng bu an quan ,单例模式外部不允许直接创建
   * @param null 1
   * @return
   */
  private static Singleton_01 instance;
  private Singleton_01(){

  }
  public static Singleton_01 getInstance(){
      if (null != instance){
          return instance;
      }
      return new Singleton_01();
  }

}
