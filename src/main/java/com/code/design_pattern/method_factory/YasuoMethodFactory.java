package com.code.design_pattern.method_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 工厂方法模式：简单工厂模式有一个问题就是，类的创建依赖工厂类，
 *  也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，
 *  所以，从设计角度考虑，有一定的问题，如何解决？就用到工厂方法模式，
 *  创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。
 */
public class YasuoMethodFactory implements FactoryProvider {

    @Override
    public Lines produce() {
        return new Yasuo();
    }
}
