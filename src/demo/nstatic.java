package demo;

public class nstatic {

	public static void main(String[] args)
	
	{
		nstatic cat = new nstatic();
		
		
		System.out.println("main method started here");
		cat.m1();
		System.out.println("main method ended here");
		cat.m2();
		
	}
	public void m1()
	{
		System.out.println("non static method started here");
	}
	
	public void m2()
	{
		System.out.println("non static method started here");
	}
}
