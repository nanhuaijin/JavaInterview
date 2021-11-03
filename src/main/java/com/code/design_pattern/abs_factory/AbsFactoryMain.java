package com.code.design_pattern.abs_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 抽象工厂主方法
 */
public class AbsFactoryMain {
    public static void main(String[] args) {
        AbstractFactory heroFactory = FactoryProvider.getFactory("Hero");
        heroFactory.getHero("Riven").skill();
        heroFactory.getHero("Yasuo").skill();

        System.out.println("========================");

        AbstractFactory campFactory = FactoryProvider.getFactory("Camp");
        campFactory.getCamp("阿狸").belong();
        campFactory.getCamp("剑姬").belong();
    }
}
