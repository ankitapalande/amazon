package demo;

public class mwithparameter1 

{
	public static void main(String[] args)
	{
		System.out.println("main method started");
		mwithparameter2 mul = new mwithparameter2();
		// calling non static method with parameter from different class
		mul.multiplication(10,10);
		mwithparameter2.addition(20,20);
		mwithparameter2.studentgrade('B');
		mwithparameter2.studentname("Palande");
	
	
	}

}
