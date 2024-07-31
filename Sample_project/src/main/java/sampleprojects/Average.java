package sampleprojects;

public class Average {
	static int a=2;
	static int b=4;
	public static void main(String[]args)
	{
		Average.add();
		Average.average();
	}
	public static void add()
	{
		int c;
		c=a+b;
		System.out.println("sum="+c);
	}
	public static void average()
	{
		int avg;
		avg=(a+b)/2;
		System.out.print("average="+avg);
	}
	 

}
