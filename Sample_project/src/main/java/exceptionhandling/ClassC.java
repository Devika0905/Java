package exceptionhandling;

public class ClassC {
	int a[]= {1,2,3,4};
	int b=100;
	int c=0;
	//int a[]=new int[5];

	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.display();
		

	}
	public void display()
	{
		//a[6]=10;
		//System.out.println(a[5]);
		try{
			//[5]=10;
			int d=b/c;
			System.out.println("d="+d);
			System.out.println(a[5]);
		}
		catch(ArithmeticException a)
		{
			System.out.println("ArithmeticException handled"+a);
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.print("ArrayIndexOutOfBoundsException handled"+b);
		}
	}

}
