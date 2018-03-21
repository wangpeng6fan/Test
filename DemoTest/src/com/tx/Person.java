package com.tx;
//import com.edu.cake.*;
import com.text.*;
/*
 * protected访问修饰符的注意情况：
 * 1.当前类
 * 2.同一包中的类
 * 3.不同包/不同工程中的类且两个类之间具有继承关系(子类对象可以访问父类中定义的protected方法)。
 *   父类中的protected方法对于不同包子类来说是不可见的，所以在子类中调用父类对象的该方法会出现编译错误；
 * 
*/
public class Person extends InheritTest{
	
	
	public static void main(String[] args) {
		
		Person p=new Person();
		InheritTest a=new InheritTest();
		System.out.println(p.getName());
		//System.out.println(a.getName());
	}

}
