package abstraction;

public class Class2 extends Class1 {

	public static void main(String args[])
	{
		Class2 ob=new Class2();
		ob.display();
		ob.test();
	}

	@Override
	public void test() {
		System.out.println("abstract method");
		
	}
	
}
