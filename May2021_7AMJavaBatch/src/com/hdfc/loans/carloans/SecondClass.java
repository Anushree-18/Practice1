package com.hdfc.loans.carloans;

public class SecondClass {
	
	
	int a=10,b=20,result;
	
	public void add() {
		
		result=a+b;
		System.out.println("Add of A & B is :" +result);
	}
	
	
     public void sub() {
		
		result=a-b;
		System.out.println("Add of A & B is :" +result);
	}
     
     
	public static void main(String[] args) {
		System.out.println("HI Crazy Person! Are You from Jubhigharaland");
		
		SecondClass obj1=new SecondClass();
		obj1.add();
		obj1.sub();

		

		SecondClass obj2=new SecondClass();
		obj2.add();
		obj2.sub();
	}


}
