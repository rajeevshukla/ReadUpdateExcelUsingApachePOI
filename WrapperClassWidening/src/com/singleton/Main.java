package com.singleton;

public class Main {

	  public static void main(String[] args) {
		
		  Singleton singleton=Singleton.getSingletonObject();
		  
		   singleton.x=30;
		   System.out.println(singleton.x);//
		   
		   Singleton singleton2=Singleton.getSingletonObject();
		   singleton2.x=40;
		   
		   
		   
		   
		   System.out.println(singleton.x); //
		   System.out.println(singleton==singleton2);
	}
}
