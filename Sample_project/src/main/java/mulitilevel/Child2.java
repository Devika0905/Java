package mulitilevel;



public class Child2 extends Child1 {
	public static void main(String []args)
	{
		Child2 obj2=new Child2();
		obj2.test2();
		obj2.test1();
		obj2.test();
	}
	public void test2()
	{
		System.out.println("child2 inherit child 1 and parent1");
	}

}
