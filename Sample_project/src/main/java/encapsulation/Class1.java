package encapsulation;

public class Class1 {
	private int a;
	private int b;
	public void setter(int a,int b)//parameters 
	{
		//this keyword: distinguish instance variable and parameters with same name
		this.a=a;//this.a- instance variable
		this.b=b;//
		
		}
	public void getter()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
