package constructor;
public class Operations {
	int c;
	int d;
	public static void main(String[]args)
	{
	Operations obj=new Operations();
	obj.sum(2,2);
	obj.avg();
}
public void sum(int a,int b)
{
	c=a+b;
	System.out.println("sum="+c);
}
public void avg()
{
	d=c/2;
	System.out.print("average="+d);
}
}
