package com.text;

public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        *关于equals()与“==” 的情况
        *Integer有个静态内部类IntegerCache,里面有个cache[],也就是Integer常量池
        * 该常量池的大小为一个字节（-128~127）
        */
	  String s1="abc";
	  String s2="abc"; 
	  Integer a=27;
	  Integer b=27;
	  System.out.println(a==b);
	  System.out.println(s1==s2);
	  System.out.println(s1.equals(s2));
	  System.out.println(a.equals(b));
	}

}
