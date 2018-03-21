package com.text;

public class ReturnTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("throwReturn:" + throwReturn());
		 System.out.println("**********************************************************");
	     System.out.println("finallyReturn:" + finallyReturn());  
	}
	
	/*
	 * 该方法中finally语句块中没有return语句(执行流程)
	 * 从输出结果中可以看出程序在int ret = 10/0;这一行抛出异常，直接进入catch块，首先输出打印catch block...，
	 * 继续往下执行时碰到return语句，由于程序存在finally语句，在程序返回之前需要执行finally语句。那么此时程序会将return的结果值暂时存起来(栈)，
	 * 继续执行finally语句，从输出上可以看出finally执行后ret的值变成了1，
	 * 而整个方法最终的返回结果是0，说明return的是之前暂存的值。
     * 
     * */
	 
	 public static int throwReturn(){
		          int ret = 0;
		          try{
		              ret = 10/0 ;
		              ret++;
		             return ret;
		         }catch(Exception e){
		              System.out.println("catch block " + e.getMessage());
		              //ret++;
		             return ret;
		         }finally{
		             System.out.println("finally block invoked!!!");
		             ret++;
		             System.out.println("finally block invoked, ret is " + ret);
		         }
		         
		     }  
	 
	 /************************************************************************************/
	    /*
		 *从输出结果中可以看出程序在int ret = 10/0;这一行抛出异常，直接进入catch块，首先输出打印catch block...，继续往下执行时碰到return语句，
		 *由于程序存在finally语句，在程序返回之前需要执行finally语句。那么此时程序会将return的结果值暂时存起来，
		 *继续执行finally语句，从输出上可以看出finally执行后ret的值变为了1，
		 *在finally块中碰到了return语句，方法就直接返回了，所以方法结果返回的值为1。
	     * 
	     * */
	  @SuppressWarnings("finally")
	public static int finallyReturn(){
		          int ret = 0;
		          try{
		              ret = 10/0 ;
		              ret++;
		             return ret;
		          }catch(Exception e){
		              System.out.println("catch block " + e.getMessage());
		             //ret++;
		             return ret;
		         }finally{
		             System.out.println("finally block invoked!!!");
		             ret++;
		             System.out.println("finally block invoked, ret is " + ret);
		             return ret;
		         }
		         
		     }

}
