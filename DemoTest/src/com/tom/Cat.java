package com.tom;

public class Cat extends Animal{
	
	public String name = "222";

	public static void method(){
        System.out.println("猫");
    }
    public void voice() {
        System.out.println("猫叫");
    }
    
    public void eat(){
    	
    	System.out.println(super.fu==this.fu);
    	print("修改之前.......");
    	this.fu="modify this.fu";
    	print("修改this.fu...");
    	super.fu="modify super.fu";
    	print("修改super.fu...");
    }
    
    public void print(String msg){
    	System.out.println(msg);
    	System.out.println("super.fu::"+super.fu);
    	System.out.println("this.fu::"+this.fu);
    }

}
