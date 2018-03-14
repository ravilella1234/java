package com.hdfcbank.loans.carloans;

public class FirstClass 
{
	int a=10,b=20,result;
	
	public void addition()
	{
		result=a+b;
		System.out.println(result);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hi !");
		FirstClass obj=new FirstClass();
		obj.addition();
		
		FirstClass obj1=new FirstClass();
		obj1.addition();

	}

}
