package demo;

public class mwithparameter
{
public static void main(String[] args) 
{
	
System.out.println("main method started ");	
addition(20,30);//calling static method with parameters from same class
studentname("Ankita");//calling static method with parameters from same class
studentgrade('A');//calling static method with parameters from same class
mwithparameter mul = new mwithparameter();
mul.multiplication(10, 20);//calling non static method with parameters from same class
System.out.println("main method ended ");	
}

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
	System.out.println("multiplication of two numbers is" +c);
}

}





