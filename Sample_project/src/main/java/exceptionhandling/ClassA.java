package exceptionhandling;

public class ClassA {
	int a=10;
	int b=0;
	int c;
	public static void main (String args[])
	{
		ClassA obj=new ClassA();
		obj.div();
	}
	public void div() {
		try
		{
			
			System.out.println("c="+c);	
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
			System.out.println("Exception handled"+e);//print with exception name
		}
			}

}
