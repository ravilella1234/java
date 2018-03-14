package com.hdfcbank.loans.carloans;

public class HDFC implements RBI
{

	@Override
	public void withdrawl() 
	{
		System.out.println("Hi iam overridden withdrawl method in HDFC");
	}
	
	public static void main(String[] args) 
	{
		HDFC h=new HDFC();
		h.withdrawl();
	}

}
