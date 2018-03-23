package com.tom;

import com.tx.People;

public class Farmer extends People{

	public void eatt(){
		
		super.eat();
		System.out.println("子类1吃得快");
	}
	
	public void eat(){
		
		
		System.out.println("吃得慢");
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Farmer f=new Farmer();
          f.eatt();
	}

}
