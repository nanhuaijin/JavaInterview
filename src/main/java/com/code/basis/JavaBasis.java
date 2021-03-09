package com.code.basis;

/**
 * @author : breeze
 * @date : 2021/3/9
 * @description :
 */
public class JavaBasis {
    public static void main(String[] args) {
        Integer a = new Integer(100);
        Integer b = new Integer(100);
        int c = 100;
        Integer d = new Integer(150);
        int e = 150;
        Integer f = 100;
        Integer g = 100;
        Integer h = 128;
        Integer i = 128;


        System.out.println(a == b); //false
        System.out.println(a == c); //自动拆箱为int进行比较 true
        System.out.println(d == e); //自动拆箱为int进行比较  true
        System.out.println(f == g); //true 常量池
        System.out.println(h == i); //false
    }
}
