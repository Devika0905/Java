package interfacee;

public class ClassA  implements Interface{

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		obj.display();

	}

	@Override
	public void display() {
		 int c=a+b;
		System.out.print("c="+c);}

}
