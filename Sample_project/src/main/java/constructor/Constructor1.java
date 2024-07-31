package constructor;

public class Constructor1 {
	int c;
public static void main(String args[])
{
	Constructor1 obj = new Constructor1();
	Constructor1 obj1= new Constructor1(1,2);
	
}
public Constructor1()
{
	System.out.println("Hello");
}
public Constructor1(int a,int b)
{
	c=a+b;
	System.out.println(c);
}
}