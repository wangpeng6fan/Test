package com.tx;

import java.util.Arrays;

/**
 * 操作数的计算顺序是从左到右的，首先会计算左侧的操作数，然后计算右侧操作数；
 * 2018.02.26
 * 测试i++与++i的区别：<两者都是先将变量的值加1，然后才进行运算>
 *  前者是先赋值后运算，后者是先运算后赋值
 *  真正的区别在于前者是首先将变量赋值给一个临时变量，接下来对变量的值加1，然后使用那个临时变量进行运算；
 *  		  后者是将变量的值加1后，使用增值后的变量进行运算。
 *  
 *
 */
public class TestZy {
	public static void Sort(){
		
		int i;
		int[] array = new int[8];
		for(i=0;i<5;i++){
			array[i++]=++i;
		}
		System.out.println(Arrays.toString(array));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int y=0;    
	        int i=0;
	        y= ++y;
	        y= ++y;
	       
	        System.out.println("y="+y);
	        i= i++;
	        i= i++;
	        
	        System.out.println("i="+i);
	        //Sort();
	        pd();
	}
	public static void pd() {
		// TODO Auto-generated method stub
		int i=1;
		int k=0;
		int z=0;
		//k=++i + ++i+ ++i;
		z=(i++) + (++i) + (i++);
		//System.out.println(k);
		System.out.println(z);
		
	}

}
