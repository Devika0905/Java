package sampleprojects;

public class Parametrized {
	public static void main(String[]args)
	{
		 Parametrized.sum(10, 20); 
	}
	//parameterized static method
	public static void sum(int a,int b)
	{
		int c=a+b;
		System.out.print("sum="+c);
	}

}
