package com.tom;
/**
 * 2018.02.25
 * 关于static修饰成员方法的使用(子类与父类方法名相同)
 * 当父类引用指向子类时，结果显示父类方法的结果
 * 测试类TestStatic
 *
 */
public class Animal {
	
	protected String fu="父类";
	
	public String name = "111";
	
	public static void method(){
        System.out.println("动物");
    }
    public void voice() {
        System.out.println("动物叫");
    }

}
