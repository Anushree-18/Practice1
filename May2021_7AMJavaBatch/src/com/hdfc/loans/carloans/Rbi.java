package com.hdfc.loans.carloans;

public interface Rbi {
	
	int x=100;
	public void withdrawal();
	public void deposit();



public static void main(String[] args) {
	
Rbi i;
i=new HDFC();
i.deposit();
i.withdrawal();

}

}