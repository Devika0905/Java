package inheritanceprob;

public class ClassB extends ClassA {
	int tot;
	public static void main(String[]args)
	{
		
	}
	public void total()
	{
		tot=basicpay+hra-pf-deduction+bonus;
		System.out.println("total salary="+tot);
	}
	public void salaryslip() {
		
		System.out.println("basic pay="+basicpay);
		System.out.println("deduction"+deduction);
		System.out.println("hra="+hra);
		System.out.println("pf="+pf);
		System.out.println("bonus="+bonus);
		System.out.println("total salary="+tot);
	}

}
