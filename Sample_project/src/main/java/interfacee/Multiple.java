package interfacee;

public class Multiple implements Class1,Class2 {

	public static void main(String[] args) {
		Multiple obj=new Multiple();
		obj.test1();
		obj.test2();
		obj.add();

	}
	public void add()
	{
		int c=a+b;
		System.out.println("c="+c);
	}

	@Override
	public void test2() {
		System.out.println("b="+b);
		
	}

	@Override
	public void test1() 
	{System.out.println("a="+a);// TODO Auto-generated method stub
		
	}

}
