package com.hdfcbank.loans.carloans;

public class KOTAK implements RBI
{

	@Override
	public void withdrawl() 
	{
		System.out.println("Hi iam overridden withdrawl method in KOTAK");
	}
	public static void main(String[] args) {
		KOTAK k=new KOTAK();
		k.withdrawl();
	}
}
