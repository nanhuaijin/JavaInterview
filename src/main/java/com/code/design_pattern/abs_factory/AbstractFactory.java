package com.code.design_pattern.abs_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 抽象工厂
 */
public abstract class AbstractFactory {
    public abstract Hero getHero(String name);
    public abstract Camp getCamp(String name);
}
