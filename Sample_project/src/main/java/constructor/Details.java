package constructor;

public class Details {
	static String s="obsqura";
	static String x;
	int y;
	String z;
	
	public static void main(String[]args)
	{
		Details obj =new Details("Devika",20,"Tvm");
		obj.display();
		Details obj1 =new Details("Salma",21,"Attingal");
		obj1.display();
		Details obj2= new Details("Fousiya",22,"tvm");
		obj2.display();
		Details obj3 =new Details("Nandana",23,"tvm");
		obj3.display();
		Details obj4 =new Details("Harsha",24,"tvm");
		obj4.display();
	}

public Details(String n,int id,String p)
{
	 x=n;
	 y=id;
	 z=p;
}
public void display()
{
	System.out.println("Name:="+x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(s);
	System.out.println();
}




	}
