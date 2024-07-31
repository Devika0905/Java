package encapsulation;

public class ClassThis {
	int a;
	int b;
	//int c;
	public static void main(String []args) {
		ClassThis ob= new ClassThis(2,3);
		//ob.test();
	}
	
public ClassThis(int a,int b)
{
	//this.test();
	this(1.2f,2.0f);
	this.a=a;
	this.b=b;
	//this();
	this.test();//instance method using this keyword
}
public ClassThis(float a,float b)
{
	float c=a+b;
	System.out.println("c="+c);
}
public void test()
{
	System.out.println("a ="+a);
	System.out.println("b ="+b);
}
}
