package com.text;

public class ReturnAndThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			       System.out.println("throwException:" + throwException());
//			} catch (Exception e) {
//			       System.out.println("捕获到throwException方法抛出的异常," + e.getMessage());
//			} 
			  
	   try {
			        System.out.println("finallyThrowException:" + finallyThrowException());
			 } catch (Exception e) {
			        System.out.println("捕获到finallyThrowException方法抛出的异常," + e.getMessage());
			 }     
	   }
	
	
	/*
	 * 从输出结果中可以看出在调用throwException方法时出现异常，程序进入该方法的catch块中，输出：catch block / by zero
     *由于存在finally，程序会先执行完finally语句输出：finally block invoked!!! 和 finally block invoked, ret is 1
     *然后将捕获到的异常抛向上层。上层的main方法catch到这个异常之后会输出：捕获到throwException方法抛出的异常,/ by zero
     *《注意throwException：那句打印是不会输出的》
     * 
	 */
	public static int throwException() throws Exception{
        int ret = 0;
        try{
            ret = 10/0 ;
            System.out.println("ret:" + ret);
            return ret;
        }catch(Exception e){
            System.out.println("catch block " + e.getMessage());
            throw e;
        }finally{
            System.out.println("finally block invoked!!!");
            ret++;
            System.out.println("finally block invoked, ret is " + ret);
        }
        
    }
	
	
   /*
	*从输出结果中可以看出在调用finallyThrowException方法时出现异常，程序进入该方法的catch块中，输出：catch block / by zero
    *由于存在finally，程序会先执行完finally语句输出：finally block invoked!!! 和 finally block invoked, ret is 1
    *之后程序执行到finally块中return语句，直接返回了ret的值，主方法接受到这个返回值后输出：finallyThrowException:1
    *该方法调用者捕获不到异常，异常被无端的“吃掉”啦。
    *《注意主方法中catch块代码并没有被执行，这就说明了finallyThrowException方法中异常被丢失了》
    * */
	@SuppressWarnings("finally")
	public static int finallyThrowException() throws Exception{
        int ret = 0;
        try{
            ret = 10/0 ;
            System.out.println("ret:" + ret);
            return ret;
        }catch(Exception e){
            System.out.println("catch block " + e.getMessage());
            throw e;
        }finally{
            System.out.println("finally block invoked!!!");
            ret++;
            System.out.println("finally block invoked, ret is " + ret);
            return ret;
        }
        
    }
	

}
