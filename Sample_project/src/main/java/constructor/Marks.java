package constructor;

public class Marks {
	static int x,y,z; 
	static int t;
	static int a;
	public static void main(String[]args)
	{
		Marks s1 = new Marks(15,20,30); 
		 a= s1.total();
		System.out.println("total mark of S1="+a);
		s1.grade();
		Marks s2 = new Marks(40,35,45); 
		 a=s2.total();
		System.out.println("total mark of S2="+a);
		s2.grade();
		
	}
	public Marks(int m1,int m2,int m3 )
	{
		x=m1;
		y=m2;
		z=m3;
		
	}
	public int total()
	{
		t=x+y+z;
		return t;
		
	}
	public void grade()
	{
		if(a>=30 && a<40) {
			System.out.println("has Grade D");
		}
		else if(a<=50 && a>60)
			{
			System.out.println("has lGrade C");
			}
		else if(a<=60 && a>70)
		{
		System.out.println("has Grade B");
		}
		else if(a<=70 && a>80)
		{
		System.out.println("has Grade A");
		}
		else if(a>=80)
		{
		System.out.println("has Grade S");
		}
		else
		{
			System.out.println("Failed");
		}
		}
			
	}
	
	
	
	


