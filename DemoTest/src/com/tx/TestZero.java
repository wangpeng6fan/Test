package com.tx;
/**
 * 2018.02.26
 * 浮点型的相除与求余运算：
 *  当除数为0时不会产生异常；NAN(Not a Number)、INFINITY(无限)
 *  除了乘以0外，对无限值做运算所得的值还是无限，无限乘以0得到的值为NAN，即非数字。
 *  要判断一个浮点数是否为INFINITY，可用isInfinite方法，要判断一个数是否为NAN要用isNAN方法。
 *  正无穷大：POSITIVE_INFINITY   负无穷大：NEGATIVE_INFINITY
 *
 */
public class TestZero {

	public static void main(String[] args) {
		//float类型除数为0的运算
		float f1= 1f;
		float f2= -1f;
		float f3= 0f;
		float a= f1/f3;
		float b= f2/f3;
		float c= f3/f3;
		System.out.println("a的值为"+a);
		System.out.println("b的值为"+b);
		System.out.println("c的值为"+c);
		

	}

}
