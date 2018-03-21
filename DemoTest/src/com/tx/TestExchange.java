package com.tx;

import java.util.Calendar;

import com.tom.YinYongClass;

/**
 * 2018.02.26
 * 交换变量的实现
 * 1.中间变量交换
 * 2.求和与求差交换(不可取)
 * 3.异或交换
 *	形参与实参：
 * .形参：用来接收调用该方法时传递的参数。只有在被调用的时候才分配内存空间，一旦调用结束，就释放内存空间。因此仅仅在方法内有效。
   .实参：传递给被调用方法的值，预先创建并赋予确定值。
   .(基本数据类型)传值调用：传值调用中传递的参数为基本数据类型，参数视为形参。
   .(引用数据类型)传引用调用：传引用调用中，如果传递的参数是引用数据类型，参数视为实参。在调用的过程中，将实参的地址传递给了形参，形参上的改变都发生在实参上。 
 * 
 */
public class TestExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YinYongClass yy=new YinYongClass();
		yy.count=6;
		yy.price=9;
		swap(yy);
		System.out.println("main方法内，count="+yy.count+";price="+yy.price);
		
	}

	public static void swap(YinYongClass yy) {
		// TODO Auto-generated method stub
		int temp = yy.count;  
        yy.count=yy.price;  
        yy.price=temp;   
        System.out.println("swap方法内，count="+yy.count+";price="+yy.price); 
        yy=null;
	}

}
