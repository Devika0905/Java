package sampleprojects;

public class Tests {
	//static int a;
	//static int b;
	static int c;
	static float avg;
	public static void main(String[]args)
	{
		Tests.add(1,2);
		float d=Tests.avg();
		System.out.print(d);
	}
	public static void add(int a, int b)
	{
		 c=a+b;
		System.out.println(c);
	}
	public static float avg()
	{
		avg=c/2f;
		return avg;
	}

}
