package constructor;

public class Construct_overload {
	public static void main(String[]args)
	{
		Construct_overload obj=new Construct_overload(2);
		Construct_overload obj1=new Construct_overload(5,5);
		Construct_overload obj2=new Construct_overload(1.1f);
	
	}
	public Construct_overload(int l)
	{
		int x=l*l;
		System.out.println("Area of square="+x);
	}
	public Construct_overload(int l,int b)
	{
		int y=l*b;
		System.out.println("area of rectangle="+y);
		
	}
	 public Construct_overload(float b)
	 {
		 double z=3.14*b*b;
		 System.out.print("area of circle="+z);
	 }

}
