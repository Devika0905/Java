package sampleprojects;

public class Test {
	static int a=6;
	static int b=2;
	static int c;
	public static void add()
	{
		c=a+b;
		System.out.println("sum="+c);
	}
	public static void diff()
	{
		c=a-b;
		System.out.println("Difference="+c);
	}
	public static void product() 
	{
		c=a*b;
		System.out.println("product="+c);
	}
	public static void division()
	{
		c=a/b;
		System.out.print("quotient="+c);
		
	}
	public static void main(String[]args)
	{
		Test.add();
		Test.diff();
		Test.product();
		Test.division();
	}
	

}
