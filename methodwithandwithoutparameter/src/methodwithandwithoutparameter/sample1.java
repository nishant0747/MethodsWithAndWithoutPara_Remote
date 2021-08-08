package 
methodwithandwithoutparameter;

public class sample1 

{
	public static void main(String[] args) 
	{
		System.out.println("main method start");
		
		addition(30,10); //static method call from same class with parameter
		
		sample2 s1 = new sample2();
		s1.admin("Nishant4040","xyz4040"); //non static method call from different class with parameter
		
		
		
		sample2.guest(); // static method call from different class
		
		sample1 s2 = new sample1();
		s2.multiplication();
	
	}
	
	public static void addition(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of integers = "+c);

	}
	public void multiplication() 
	{
		int x = 3;
		int y = 4;
		int c;
		c = x*y;
		
		System.out.println("multiplication: "+c);
		
	}

}
