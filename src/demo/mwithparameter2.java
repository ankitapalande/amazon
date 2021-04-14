package demo;

public class mwithparameter2
{
	//static method
	public static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("addition of two numbers is : "+c);
	}

	public static void studentname(String sname) 
	{
		System.out.println("student name is "+sname);
	}
	public static void studentgrade(char grade) 
	{
		System.out.println("student grade is "+grade);
	}
	//non static method 
	public void multiplication(int a, int b) 
	{
		int c=a*b;
		System.out.println("multiplication of two numbers is: " +c);
	}

	}


