package com.test;

 class Fuo
{
	Fuo()
	{
		super();
		show();
		return;
	}

	void show()
	{
		System.out.println("fu show");
	}
}
class Zoi extends Fuo
{
	int num = 8;
	Zoi()
	{
		super();
		//-->通过super初始化父类内容时，子类的成员变量并未显示初始化。等super()父类初始化完毕后，
		//才进行子类的成员变量显示初始化。

		System.out.println("zi cons run...."+num);
		return;
	}
	void show()
	{
		System.out.println("zi show..."+num);
	}
}
class ExtendsDemo5 
{
	public static void main(String[] args) 
	{
		Zoi z = new Zoi();
		z.show();
	}
}

/*
一个对象实例化过程：
Person p = new Person();
1，JVM会读取指定的路径下的Person.class文件，并加载进内存，
	并会先加载Person的父类(如果有直接的父类的情况下).
2，在堆内存中的开辟空间，分配地址。
3，并在对象空间中，对对象中的属性进行默认初始化。
4，调用对应的构造函数进行初始化。
5，在构造函数中，第一行会先到调用父类中构造函数进行初始化。
6，父类初始化完毕后，在对子类的属性进行显示初始化。
7，在进行子类构造函数的特定初始化。
8，初始化完毕后，将地址值赋值给引用变量.




*/

//继承弊端：打破了封装性。
/*
final关键字：
1，final是一个修饰符，可以修饰类，方法，变量。
2，final修饰的类不可以被继承。
3，final修饰的方法不可以被覆盖。
4，final修饰的变量是一个常量，只能赋值一次。
	为什么要用final修饰变量。其实在程序如果一个数据是固定的，
	那么直接使用这个数据就可以了，但是这样阅读性差，所以它该数据起个名称。
	而且这个变量名称的值不能变化，所以加上final固定。

	写法规范：常量所有字母都大写，多个单词，中间用_连接。



*/

