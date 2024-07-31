package sampleprojects;

public class Return_Default {
	//static method:Default with return type
	public static void main(String[]args)
	{
		String x=Return_Default.display();
		System.out.print(x);
		//System.out.print(Return_Default.display());
		
	}
	public static String display()
	{
		String s="Hello";
		return s;
	}

}
