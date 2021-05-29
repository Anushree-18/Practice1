package com.hdfc.loans.carloans;

public class HDFC implements Rbi {

   public void withdrawal() {
		System.out.println("I am a overidden withdrawal method");
		
	}

	public void deposit() {
		System.out.println("I am a overidden Deposit method");
		
	}
	public static void main(String[] args) {
		
            HDFC h= new HDFC();
            h.deposit();
            h.withdrawal();
            
		}
		
	}


