package exceptionhandling;

public class ClassThrow {
	 int age=15;

	public static void main(String[] args) {
		ClassThrow obj=new ClassThrow();
		obj.test();

	}
	public void test()
	{
		if(age>=18)
		{
			System.out.println("is eligible to vote");
		}
		else
		{
			try
			{
				throw new ArithmeticException("is not eligible");
			}
			catch(ArithmeticException a)
			{
				System.out.print("exception handled"+a);
			}
			
		}
	}

}
