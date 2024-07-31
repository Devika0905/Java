package acess_modifier;

public class Methods {
	public static void main(String[]args)
	{
		Methods obj=new Methods();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
	//instance method
	public  void method1()
	{
		System.out.println("public access modifier");
	}
	protected void method2()
	{
		System.out.println("Protected access modifier");
	}
	private void method3()
	{
		System.out.println("Private access modifier");
	}
	void method4()
	{
		System.out.print("default access modifier");
	}

}
