package hierarchical;

public class Child2 extends Parent {
	public static void main(String[]args)
	{
		Child2 ob1=new Child2();
		ob1.add();
		ob1.product();
	}
	public void product()
	{
		c=a*b;
		System.out.println("produt="+c);
	}

}
