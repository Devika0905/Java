package polymorphism;

public class Child extends Parent{

	public static void main(String[] args) {
		Child obj=new Child();
		obj.add();
		
	}
	public void add(){
		{
			//super keyword-to access parent method
			super.add();
			c=a-b;
			System.out.println("c="+c);
		}
	}

}
