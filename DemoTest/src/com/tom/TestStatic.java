package com.tom;
/**
 * 2018.02.25
 *	方法/成员变量隐藏------>(资源共享，类名访问)静态绑定，根据编译时引用的静态类型来决定调用相关类的成员；
 *	方法重写----------->动态绑定，根据运行时引用所指向对象的实际类型决定调用相关类的成员。
 *
 */
public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat();
		System.out.println(a.name);
		a.voice();
        Animal.method();
        //向下转型，子类对象指向父类引用
        Cat c=(Cat)a;
        c.method();
       /**************子类继承父类的成员变量是不同还是共享******************/
        //两种情况：子类没有隐藏父类变量（共享）/子类隐藏了父类变量（不同）
        Cat c1=new Cat();
        Cat c2=new Cat();
        c1.eat();
        System.out.println(c1.fu==c2.fu);
        c2.print("对象c2的fu:");
	}

}
