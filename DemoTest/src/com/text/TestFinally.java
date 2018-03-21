package com.text;

public class TestFinally {

	public static void main(String[] args) {
//		 System.out.println(test1(0));
//	     System.out.println(test2(0));
//	     System.out.println(test3(0));
	     System.out.println(test4(0));

	}
	
//	 @SuppressWarnings("finally")
//	public static int test1(int b){
//	        try {
//	            b+=10;
//	            return b;
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            b=-1;
//	            return b;
//	        } finally {
//	            b+=100;
//	            return b;
//	        }
//	    }
//	    public static int test2(int b){
//	        try {
//	            b+=10;
//	            return b;
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            b=-1;
//	            return b;
//	        } finally {
//	            b+=100;
//	        }
//	    }
//	    @SuppressWarnings("finally")
//		public static int test3(int b){
//	        try {
//	            b/=0;
//	            return b;
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	            b=-1;
//	            return b;
//	        } finally {
//	            b+=100;
//	            return b;
//	        }
//	    }
	    public static int test4(int b){
	        try {
	            b/=0;
	            return b;
	        } catch (Exception e) {
	           
	            System.out.println( e.getMessage());
	            b=-1;
	            return b;
	        } finally {
	            b+=100;
	            
	        }
	    }

}
