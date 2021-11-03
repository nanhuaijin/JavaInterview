package com.code.design_pattern.singleton;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 单例模式 - 饿汉式
 *  单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。
 */
public class HungrySingleton {

    //使用volatile原因，防止指令重排
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    //私有化构造方法
    private HungrySingleton(){System.out.println("HungrySingleton init");}

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
