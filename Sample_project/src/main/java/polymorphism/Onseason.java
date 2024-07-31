package polymorphism;

public class Onseason {
	int discount;
	int c1=150;
	int c2=200;
	int c3=400;
	int tot;
	float d;
	public void total() 
	{
		tot=c1+c2+c3;
		System.out.println("total="+tot);
	}
	public void discount()
	{
		d=tot*15/100f;
		System.out.println("Discount of Onseason="+d);
	}

}
