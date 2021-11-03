package com.code.design_pattern.abs_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 工厂提供者
 */
public class FactoryProvider {

    public static AbstractFactory getFactory(String name) {
        switch (name) {
            case "Hero":
                return new HeroFactory();
            case "Camp":
                return new CampFactory();
            default:
                throw new RuntimeException("没有该工厂");
        }
    }
}
