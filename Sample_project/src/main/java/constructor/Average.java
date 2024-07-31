package constructor;

public class Average {
	//static int x;
	//static float y;
	public static void main(String[]args)
	{
		Average.avg(2,2,2);
		Average.avg(0.1f,2.2f,3.1f);
	}
	public static void avg(int a,int b,int c)
	{
		 int x=(a+b+c)/3;
		System.out.println("Average="+x);
	}
	public static void avg(float a,float b,float c)
	{
		float y=(a+b+c)/3;
		System.out.print("Average="+y);
		
	}

}
