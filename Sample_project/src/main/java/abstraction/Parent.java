package abstraction;

public abstract class Parent {
	static int a=10;
	static int b=5;
   static int c;
	public void add()
	{
		 c=a+b;
		System.out.println("sum="+c);
	}
	public abstract void sub();
	
}
