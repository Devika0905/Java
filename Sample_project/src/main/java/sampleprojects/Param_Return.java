package sampleprojects;

public class Param_Return {
	public static void main(String[]args)
	{
		int d=Param_Return.sum(10,20);
		System.out.print("sum="+d);
		//Param_Return.sum();
		
	}
	public static int sum(int a,int b)
	//public static void sum()
	{
		//int a=1;
		//int b=2;
		int c=a+b;
		return c;
		//System.out.print(c);
		 }

}
