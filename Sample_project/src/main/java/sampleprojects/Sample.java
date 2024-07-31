package sampleprojects;
// passing value through main method and it should be static variable
public class Sample {
	static String x;
	public static void main(String[]args)
	{
		Sample.display("Hello");
	}
	public static void display(String s)
	{
		x=s;
		System.out.print(x);
		}

}
