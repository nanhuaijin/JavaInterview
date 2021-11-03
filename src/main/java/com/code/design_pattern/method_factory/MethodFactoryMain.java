package com.code.design_pattern.method_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 主方法
 */
public class MethodFactoryMain {
    public static void main(String[] args) {
        RivenMethodFactory rivenMethodFactory = new RivenMethodFactory();
        rivenMethodFactory.produce().desc();
        System.out.println("---------------------");
        YasuoMethodFactory yasuoMethodFactory = new YasuoMethodFactory();
        yasuoMethodFactory.produce().desc();
    }
}
