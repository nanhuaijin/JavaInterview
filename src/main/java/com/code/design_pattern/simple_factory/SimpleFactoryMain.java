package com.code.design_pattern.simple_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 主方法
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        //简单工厂
        SimpleFactory simpleFactory = new SimpleFactory();
        Hero riven = simpleFactory.getHero("Riven");
        riven.skill();
        Hero yasuo = simpleFactory.getHero("Yasuo");
        yasuo.skill();
        try {
            Hero yg = simpleFactory.getHero("永恩");
            yg.skill();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------");
        //多方法
        simpleFactory.getRiven().skill();
        simpleFactory.getYasuo().skill();
        System.out.println("----------------------------");
        //多个静态方法，无需创建工厂对象
        SimpleFactory.getStaticRiven().skill();
        SimpleFactory.getStaticYasuo().skill();

    }
}
