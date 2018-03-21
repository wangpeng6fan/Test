package com.gouzaoo;

import com.gouzao.SubClass;

/**
 * 2018.02.27
 * 子类构造方法（缺省包）
 * 如果父类的构造方法是缺省包权限，子类构造方法中不能使用super跨包访问父类构造方法，出现编译错误；
 *
 */
public class SupClass extends SubClass{
	
	public SupClass(){
		
		super();
	}

}
