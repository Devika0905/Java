package sampleprojects;
//value pass in main method
//add in default method-non parameterized
public class Default {
	static int c;
	static int x;
	public static void main(String[]args)
	{
		Default.test(1,2);
		Default.add();
	}
	public static void add()
	{
	    int d=c+x;
		System.out.print(d);
		
	}
	public static void test( int a,int b)
	{
		 x=a;
		 c=b;
	}

}
