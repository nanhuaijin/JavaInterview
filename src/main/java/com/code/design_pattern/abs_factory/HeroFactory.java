package com.code.design_pattern.abs_factory;


/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 英雄工厂
 */
public class HeroFactory extends AbstractFactory{
    @Override
    public Hero getHero(String name) {
        switch (name) {
            case "Riven":
                return new Riven();
            case "Yasuo":
                return new Yasuo();
            default:
                throw new RuntimeException("该英雄还未上架");
        }
    }

    @Override
    public Camp getCamp(String name) {
        return null;
    }
}
