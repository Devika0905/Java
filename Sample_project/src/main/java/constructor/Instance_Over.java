package constructor;

public class Instance_Over {
	public static void main(String[]args)
	{
		Instance_Over obj=new Instance_Over();
		obj.area(2, 3);
		double a = obj.area(1);
		System.out.println("area of circle="+a);
		obj.area(1.1f);
				
	}
	public void area (int l,int b) 
	{
		int x=l*b;
		System.out.println("Area of rectangle="+x);
	}
	public double area(int l)
	{
		double y=3.14*l*l;
		return y;
	}
	public void area(float l)
	{
		float z=l*l;
		System.out.print("area of square="+z);
	}

}
