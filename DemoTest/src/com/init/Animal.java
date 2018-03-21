package com.init;
/**
 * 2018.03.04
 * 类实例化过程：
 * 父类的类构造器<clinit>-->子类的类构造器<clinit>-->父类的成员变量和实例代码块-->
 * 父类的构造函数-->子类的成员变量和实例代码块-->子类的构造函数
 * 测试类----TestInit
 *
 */
public class Animal {
	
	int i = 1;

	public Animal() {
        System.out.println(i);           
        int x = getValue();
        System.out.println(x);            
    }

    {
        i = 2;
    }

    public int getValue() {
        return i;
    }

}
