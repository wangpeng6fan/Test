package com.test;
/*
������ͽӿڵ���ͬ�㣺

��ͬ�㣺
	���ǲ������ϳ�ȡ�����ġ�
��ͬ�㣺
	1����������Ҫ���̳У�����ֻ�ܵ��̳С�
	   �ӿ���Ҫ��ʵ�֣����ҿ��Զ�ʵ�֡� 
	2���������п��Զ�����󷽷��ͷǳ��󷽷�������̳к󣬿���ֱ��ʹ�÷ǳ��󷽷���
	   �ӿ���ֻ�ܶ�����󷽷�������������ȥʵ�֡� 
	3��������ļ̳У���is a��ϵ���ڶ������ϵ�Ļ����������ݡ�
	   �ӿڵ�ʵ���� like a ��ϵ���ڶ�����ϵ���⹦�ܡ�

Ȯ�����ܷ֣��е�äȮ���ѱ�Ȯ��

abstract class dog
{
	abstract void shout();
}

//abstract class guidedog
interface guidedog
{
	abstract void guide();
}


class guidedog extends dog implements guidedog
{
	public void shout()
	{
	}
	public void guide(){}
}

//�ڲ�ͬ�����������У��в�ͬ�ķ�����ʽ��
ѧԱ��
	ѧϰ��
	����ѧԱ
����
	
*/

class InterfaceDemoTest 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
