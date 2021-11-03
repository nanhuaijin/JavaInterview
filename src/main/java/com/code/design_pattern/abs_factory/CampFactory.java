package com.code.design_pattern.abs_factory;


/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 英雄工厂
 */
public class CampFactory extends AbstractFactory{
    @Override
    public Hero getHero(String name) {
        return null;
    }

    @Override
    public Camp getCamp(String name) {
        switch (name) {
            case "阿狸":
                return new NineTailedFox();
            case "剑姬":
                return new Solo();
            default:
                throw new RuntimeException("没有该阵营");
        }
    }
}
