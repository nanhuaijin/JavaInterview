package com.code.design_pattern.prototype;

/**
 * @author : breeze
 * @date : 2021/11/3
 * @desc : 原型（Prototype）模式：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
 * 浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 * 深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 * Object类中的clone属于浅克隆
 */
public class PrototypePattern implements Cloneable{

    PrototypePattern() {
        System.out.println("原型模式PrototypePattern构造器");
    }

    @Override
    public PrototypePattern clone() throws CloneNotSupportedException {
        System.out.println("原型模式复制成功");
        return (PrototypePattern) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypePattern prototype = new PrototypePattern();
        PrototypePattern clone = prototype.clone();
        System.out.println("prototype == clone ? " + (prototype == clone));
    }
}
