package constructor;

public class CarDetails {
	int bmarks=5;
	int totalmark;
	static int bsalary=50;
	static int FebI=50;
public static void main(String[]args)
{
	CarDetails obj=new CarDetails("Swift",3000);
	obj.student_details("Devika",22,40,'A');
	obj.employee_details("Devu",18,2000);
	
}
public void student_details(String s,int a,int m,char g)
{
	 totalmark=m+bmarks;
	System.out.println("total marks="+totalmark);
	
}
public static void employee_details(String n,int id,int janS)
{
	int totalsalary=janS+bsalary;
	System.out.println("total salary="+totalsalary);
}
public CarDetails(String n,int JanI)
{
	int totalinsurence=JanI+FebI;
	System.out.println("total insurence="+totalinsurence);
}
}
