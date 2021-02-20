package org.itstack.demo.design;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton_06 {

    /*  private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();

      private static Singleton_06 instance;

      private Singleton_06() {
      }

      public static final Singleton_06 getInstance() {
          for (; ; ) {
              Singleton_06 instance = INSTANCE.get();
              if (null != instance) return instance;
              INSTANCE.compareAndSet(null, new Singleton_06());
              return INSTANCE.get();
          }
      }

      public static void main(String[] args) {
          System.out.println(Singleton_06.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
          System.out.println(Singleton_06.getInstance()); // org.itstack.demo.design.Singleton_06@2b193f2d
      }*/
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<Singleton_06>();
    private static Singleton_06 instance;

    private Singleton_06() {
    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 singleton = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        //在内存中有一块区域专门存放静态方法和变量，可以直接使用，调用多次返回同一对象
        System.out.println(Singleton_06.getInstance());
        System.out.println(Singleton_06.getInstance());
    }
}
