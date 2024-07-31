package mulitilevel;

public class Child1 extends Parent {

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.test1();
		obj.test();
	}
	public void test1()
	{
		System.out.println("child1 inherits parent1 class");
	}

	}


