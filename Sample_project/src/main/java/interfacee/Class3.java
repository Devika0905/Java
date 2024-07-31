package interfacee;

public class Class3 implements Class2 {

	public static void main(String[] args) {
	Class3 obj=new Class3();
	obj.test1();
	obj.test2();
	obj.test3();

	}
	public void test3()
	{
		int c=a+b;
		System.out.println("c="+c);
	}
	@Override
	public void test1() {
		System.out.println("a="+a);
	}
	@Override
	public void test2() {
		System.out.println("b="+b);
		
	}

}
