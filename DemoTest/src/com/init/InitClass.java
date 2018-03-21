package com.init;
/**
 * 创建对象的过程包括初始化与实例化；
 * 对实例变量进行赋值或者使用实例代码块对其进行赋值，如果我们以这两种方式为实例变量进行初始化；
 * 编译器会将其中(实例变量赋值)的代码放到类的构造函数中去，并且这些代码会被放在对超类(父类)构造函数的调用语句之后。
 * 
 *
 */
public class InitClass {

	private int i = 1;  
    private int j = i + 1;
    
    public InitClass(int var){
    	System.out.println("i的值为"+i);
    	System.out.println("j的值为"+j);
    	 this.i = var;
        System.out.println("i的值变为"+i);
        System.out.println("j的值变为"+j);
     }
 // 非静态实例代码块
     {               
         j += 3; 

     }
    	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitClass inc=new InitClass(8);
	}

}
