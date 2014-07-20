package com.singleton;

public class Singleton {

	 private static Singleton singleton; //1 :- create private class level reference of that class. 
	 
	 int x;
	 static  {
		
		 singleton=new Singleton();   //2 create static block assing a new object to crated reference in point one.  
	 
	 }
	 
	  private Singleton(){ // 3 : create private contructor of that class so that no one use new keyword to create object
		  
	  }
	  
	  
	  public static Singleton getSingletonObject(){
		  return singleton;   // 4:-- create a public static getter that returns the create object
	  }
	  
	   
	
}
