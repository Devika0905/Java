package hierarchical;

public class Child1 extends Parent {

	public static void main(String[] args) {
		Child1 ob=new Child1();
		ob.add();
		ob.diff();
	}
	public void diff()
	{
		c=a-b;
		System.out.println("Difference="+c);
	}

}
