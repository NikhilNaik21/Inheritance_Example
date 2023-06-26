package com.Inheritance;

import java.util.Scanner;

class A{
	public int num1,num2,sum;
	
	public A() {
		// TODO Auto-generated constructor stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter num1");
		num1=in.nextInt();
		System.out.println("Enter num2");
		num2=in.nextInt();
	}
	
	public void sum()                    //int num1, int num2
	{
		 sum = num1+num2;
		 System.out.println("sum="+sum);
	}
}
class B extends A{
	
	private int mult;
	public void mult()
	{
		
		mult = num1*num2;
		System.out.println(mult);
	}
}
public class Inheritance_Example {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.sum();
		obj.mult();
	}

}
