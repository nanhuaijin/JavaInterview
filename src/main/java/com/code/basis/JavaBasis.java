package com.code.basis;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author : breeze
 * @date : 2021/3/9
 * @description :
 */
public class JavaBasis {
    public static void main(String[] args) {
        //int和Integer区别
        // compareIntAndInteger();

        //测试HashTable存储null键null值 编译可以，执行报错
        checkHashTable();
    }

    /**
     * int和Integer区别
     */
    public static void compareIntAndInteger() {
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

    /**
     * 测试HashTable存储null键null值
     */
    public static void checkHashTable() {
        Map<Object, Object> map = new Hashtable<>();
        map.put(null, 1);
        System.out.println(map);

        Map<Object, Object> map1= new HashMap<>();
        map1.put(null, null);
        System.out.println(map1);
    }
}
