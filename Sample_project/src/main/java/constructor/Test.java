package constructor;
public class Test {
	int a=2;
	int b=3;
	int c;
public void add()
{
	c=a+b;
	System.out.print(c);
}
public static void main(String[]args)
{
	Test obj=new Test();
	obj.add();
	}
}
