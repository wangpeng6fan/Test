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
	
	public void drink(){
		
	
	System.out.println("喝的快");
	
}
	
	public void shut(){
		


		System.out.println("喊得响");
	
}	

	
private String name;
	



	
	
	


	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
       
   Farmer f=new Farmer();
        
  f.eatt();
	
}


}

