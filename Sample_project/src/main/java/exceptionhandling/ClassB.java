package exceptionhandling;

public class ClassB {
	int a=3;
	int b=0;
	int c;

	public static void main(String[] args) {
		ClassB obj  =new  ClassB();
		obj.div();
		

	}
	public void div() {
		try {
		c=a/b;
		System.out.println("C="+c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("exception handled"+a);
		}
		
		finally {
			System.out.println("statement execute");
		}
	}

}
