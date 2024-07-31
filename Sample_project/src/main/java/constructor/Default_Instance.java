package constructor;

public class Default_Instance {
	
	public static void main(String[]args)
	{
		// Object creation-className object= new className();
		Default_Instance obj=new Default_Instance();
		//call instance method
		obj.display();	
	}
	
	public void display()
     //instance method/non static
	{
		String s="Hello";
		System.out.print(s);
	}

}
