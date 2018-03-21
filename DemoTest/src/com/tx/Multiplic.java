package com.tx;

import java.util.Scanner;

/**
 * 2018.03.05
 * 实现各种基础功能(乘法表的形状)
 *
 */
public class Multiplic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multiplica();
		System.out.println("*************************");
		//multiplicb();
		System.out.println("********判断闰年的条件*****************");
		//leap();
		System.out.println("*******回文数*********");
		palindrome();
		System.out.println("****满足最大n的值*******");
		range();
	}

	private static void range() {
		// TODO Auto-generated method stub
		/*
		 * 满足条件n的最大值
		 * 1×2+2×3+3×4+…+n×(n+1)＜1000 的最大的n值
		 */
		int sum = 0;
		int n = 1;
		while(sum<1000) {
			sum = sum + n * ( n + 1 );
			n++;
		}
		System.out.println("满足条件n的值为"+(n-2));
	}

	private static void palindrome() {
		// TODO Auto-generated method stub
		/*
		 * 正读倒读一样，所以这个数字就是回文数(字符串实现StringBuffer)
		 * 实现回文数的功能
		 * 比如123,321就是回文数(判断一个五位数，回文数，并统计数量 -->for循环实现)
		 */
		Scanner s=new Scanner(System.in);
		int dorm=s.nextInt();
		int count = 0;//统计个数的变量  
        
        //执行for循环 --->依次取出每位的数字 
        for(int i=10000;i<100000;i++){  
            int ge = i%10;//得到个位  
            int shi = i/10%10;//得到十位  
            int bai = i/100%10;//得到百位  
            int qian = i/1000%10;//得到千位  
            int wan = i/10000%10;//得到万位  
            if(ge==wan&&shi==qian){  
                System.out.println(i);  
                count++;  
            }  
              
        }  
        System.out.println("五位数中回文数共有："+count+"个");  
      
		
		
	}

	public static void leap() {
		// TODO Auto-generated method stub
		/*
		 * 控制台输入年份，判断该年是否为闰年
		 * 4、100、400、3200
		 */
		 int years;
		 System.out.println("请输入年份：");
		Scanner s=new Scanner(System.in);
		years=s.nextInt();
		if(years%4==0 && years %100!=0 ||years%400==0){
			
			System.out.println("输入的年份是闰年");
		}else{
			
			System.out.println("输入的年份是平年");
		}
		
		
	}

	public static void multiplicb() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++){
			for(int j=i;j<=9;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t"); 
			}
			System.out.println();
		}
	}
	

	public static void multiplica() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"\t"); 
			}
			System.out.println();
		}
	}

}
