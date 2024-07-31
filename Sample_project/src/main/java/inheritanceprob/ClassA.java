package inheritanceprob;

public class ClassA extends Parent {
	int hra;
	int pf;

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.test1();
		obj.test();
		

	}
	public void test1()
	{
		hra=basicpay*5/100;
		System.out.println("hra="+hra);
		pf=basicpay*20/100;
		System.out.println("pf="+pf);
		
	}

}
