package com.init;

public class Dog extends Animal{
	
	 int j = 1;

	 public Dog() {
	        j = 2;
	    }

	    {
	        j = 3;
	    }

	    @Override
	    public int getValue() {
	        return j;
	    }

}
