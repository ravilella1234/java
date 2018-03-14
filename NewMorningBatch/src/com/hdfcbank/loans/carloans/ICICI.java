package com.hdfcbank.loans.carloans;

public class ICICI implements RBI
{

	@Override
	public void withdrawl() 
	{
		System.out.println("Hi iam overridden withdrawl method in ICICI");
	}
	
	public static void main(String[] args) 
	{
		ICICI i=new ICICI();
		i.withdrawl();
	}
}
