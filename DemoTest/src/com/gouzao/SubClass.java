package com.gouzao;
/**
 * 2018.02.27
 * 构造方法是在创建对象的时候初始化类的实例成员，并不是创建了对象；
 * 默认的无参构造方法---->若类中没有声明构造方法，编译器就会自动生成一个，它会首先调用父类的构造器；
 * 构造方法的使用之访问权限问题
 *
 */
public class SubClass {
	
	protected SubClass(){
		System.out.println("protected访问权限的构造方法");
	}

}
