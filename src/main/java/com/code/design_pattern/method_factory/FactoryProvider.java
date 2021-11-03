package com.code.design_pattern.method_factory;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 工厂提供接口
 */
public interface FactoryProvider {
    /**
     * 生产的方法
     */
    Lines produce();
}
