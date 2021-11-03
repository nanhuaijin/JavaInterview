package com.code.design_pattern.simple_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 简单工厂模式：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。
 *          这满足创建型模式中所要求的“创建与使用相分离”的特点。
 *          在简单工厂模式中创建实例的方法通常为静态（static）方法，
 *          因此简单工厂模式（Simple Factory Pattern）又叫作静态工厂方法模式（Static Factory Method Pattern）。
 */
public class SimpleFactory {

    /**
     * 如果字符串错误，则不能创建对象
     * @param name
     * @return
     */
    public Hero getHero(String name) {
        System.out.println("普通");
        switch (name) {
            case "Riven":
                return new Riven();
            case "Yasuo":
                return new Yasuo();
            default:
                throw new RuntimeException("该英雄还未上架");
        }
    }

    public Hero getRiven() {
        System.out.println("多方法");
        return new Riven();
    }

    public Hero getYasuo() {
        System.out.println("多方法");
        return new Yasuo();
    }

    public static Hero getStaticRiven() {
        System.out.println("多静态方法");
        return new Riven();
    }

    public static Hero getStaticYasuo() {
        System.out.println("多静态方法");
        return new Yasuo();
    }
}
