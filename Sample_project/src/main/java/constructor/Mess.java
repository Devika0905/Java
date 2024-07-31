package constructor;
public class Mess {
	static int x,y,z; 
	static int t;
	public static void main(String[]args)
	{
		Mess s1 = new Mess(1,20,30); 
		Mess s2 = new Mess(40,35,45); 
		int a= s1.total();
		System.out.println(t);
		System.out.println("total mark of S1="+s1.total());
		int b=s2.total();
		System.out.println("total mark of S2="+b);
	}
	public Mess(int m1,int m2,int m3 )
	{
		x=m1;
		y=m2;
		z=m3;
		t=m1+m2+m3;
	}
	public int total()
	{
		return t;
		
	}
	
	}
	
	


