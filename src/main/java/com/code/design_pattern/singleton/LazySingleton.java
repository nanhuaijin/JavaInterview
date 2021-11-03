package com.code.design_pattern.singleton;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 单例模式 - 懒汉式
 *  单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 */
public class LazySingleton {
    //使用volatile原因，防止指令重排
    private static volatile LazySingleton instance = null;

    //私有化构造方法
    private LazySingleton(){
        System.out.println("LazySingleton init");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
