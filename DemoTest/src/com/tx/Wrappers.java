package com.tx;
/**
 * 2018.03.05
 * 包装器类与基本数据类型(valueOf-->装箱)、(***Value-->拆箱)
 * 包装器类或String类重写了equals方法，则是比较的是值<内容>，若没重写则比较的是地址；
 * 两个操作数都是包装器类型的引用，是比较指向的是否是同一个对象，
 * 而如果其中有一个操作数是表达式（即包含算术运算）则比较的是数值（即会触发自动拆箱的过程）.
 * 如果运算符"=="或"!="两侧的操作数一个是基本数据类型，一个是包装器类型，编译器如何处理？
 * 结果是会将包装器类型拆箱转换成基本数据类型，然后比较两个基本数据类型的值
 *
 */
public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		Integer y=2;
		System.out.println(y == x);
		Integer a=122;
		Integer b=6;
		Integer c=128;
		//Long d=3L;
		//System.out.println(d == (a+b));
		System.out.println(c == (a+b));
		System.out.println(c.equals((a+b)));
		//System.out.println(d.equals((a+b)));

	}

}
