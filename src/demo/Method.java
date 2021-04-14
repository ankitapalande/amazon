package demo;

public class Method
{

	static  int i=10;
    static  int j=20;
	public static void main(String[] args)
	
	{
	System.out.println("start of calculation: ");
	System.out.print("addtion of two numbers is: " );
	add();
	System.out.print("subtraction of two numbers is :");
	sub();
	System.out.print("multiplication of two numbers is :");
	mul();
	System.out.print("division of two numbers is :");
	div();
	 
	demo1.end();
	
	}
	 public static void add()
     {

	    System.out.println(i+j);
     }

    public static void sub() 
      {
System.out.println(j-i);
      }
    public static void mul() 
    {
    	System.out.println(i*j);
    }
    public static void div() 
    {
    	System.out.println(j/i);
    }
}