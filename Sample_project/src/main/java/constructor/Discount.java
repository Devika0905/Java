package constructor;

public class Discount {
	static int total;
	static int x;
	static int d;
	public static void main(String []args)
	{
		 x=Discount.amount(1000,1500,450);
		System.out.println("total amount="+x);
		Discount.customer();
	}
	public static int amount(int t1,int t2,int t3)
	{
		total=t1+t2+t3;
		return total;
	}
	public static void customer()
	{
		
	 d=x*20/100;
	 System.out.println("discount="+d);
	if(x>=5000)
	{
		System.out.println("discount is"+d);
	}
	else
	{
		System.out.println("have no discount");
	}
	}
	}


