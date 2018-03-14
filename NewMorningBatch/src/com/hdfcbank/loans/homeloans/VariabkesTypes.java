package com.hdfcbank.loans.homeloans;

public class VariabkesTypes 
{
	static VariabkesTypes obj;
	int eno=100;
	static String cname="vmware";
	
	public void m1()
	{
		
		System.out.println("Hi aim m1 instance method..."+ eno
				);
	}
	
	public void m2()
	{
		
		System.out.println("Hi aim m2 instance method..." );
	}
	
	public static void  m3()
	{
		System.out.println("Hi iam m3 static method");
		obj=new VariabkesTypes();
		obj.m1();
		obj.m2();
		System.out.println(VariabkesTypes.cname);
	}
	
	
	
	public static void main(String[] args) 
	{
		obj=new VariabkesTypes();
		obj.m1();
		obj.m2();
		VariabkesTypes.m3();
		
		
		System.out.println(obj.eno);
		System.out.println(VariabkesTypes.cname);

	}

}
