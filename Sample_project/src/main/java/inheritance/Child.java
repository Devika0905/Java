package inheritance;

//single inheretinace
public class Child extends Parent //extend keyword-inherit variables and methods of parent

{
	public static void main(String[] args) {
		
		Child obj=new Child();
		obj.diff();
		obj.add();
	

	}
	public void diff()
	{
		c=a-b;//c,a,b instance variables of parent
		System.out.println("difference="+c);
	}

}
