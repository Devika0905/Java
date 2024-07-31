package constructor;

public class Vote {
	static int a =23;
	//static boolean v;
	public static boolean eligible()
	{
		if(a>=18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		boolean v =Vote.eligible();
		System.out.print(v);
	}

}
