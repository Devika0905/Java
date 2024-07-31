package sampleprojects;

public class Details {
	static String s ;
	static int a;
	public static void main(String []args)
	{
		Details.student();
		Details.display();
	}
	public static void student()
	{
		s="Devika";
		a=22;
	}
	public static void display()
	{
		System.out.println("name="+s);
		System.out.print("age="+a);
	}

}
