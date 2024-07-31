package constructor;

public class Figures {
	
	public static void main(String[]args)
	{
		Figures.area(1);
		Figures.area(2,3);
		Figures.area(1.1f);
	}
	public static void area(int r)
	{
		 double x=3.14*r*r;
		 System.out.println("area of circle="+x);
	}
	public static void area(int l,int b)
	{
		int y=l*b;
		 System.out.println("area of rectangle="+y);
	}
	public static void area(float l)
	{
		 float z=l*l;
		 System.out.println("area of square="+z);
	}

}
