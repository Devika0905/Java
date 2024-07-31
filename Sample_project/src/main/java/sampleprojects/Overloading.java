package sampleprojects;
//Method overloading-same method name:diff parameters/datatype
//compile tym error/""polymorphism
public class Overloading {
	static int c;
	static int d;
	static float f;
	static float e;
	public static void main(String[]args)
	{
		Overloading.add(1,2);
		Overloading.add(1, 2,3);
		Overloading.add(0.1f, 1);
		float s=Overloading.add(0.1f, 1.1f);
		System.out.print("s="+ s);
	}
	public static void add(int a,int b)
	{
		c=a+b;
		System.out.println("c="+c);
	}
	public static void add(int a,int b,int c)
	{
		d=a+c;
		System.out.println("d="+d);
	}
	public static void add(float a,int b)
	{
		f=a+b;
		System.out.println("f="+f);
	}
	public static float add(float a,float b)
	{
		e=a+b;
		return e;
	}
}
