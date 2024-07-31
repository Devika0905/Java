package practise;
import java.util.Scanner;
public class Scanner1 {
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is your name?");
		String name=scanner.nextLine();
		//System.out.println("My name is "+name);
		System.out.println("What is your age?");
		int age=scanner.nextInt();
		scanner.nextLine();
		//System.out.println("iam "+age+" years old");
		System.out.println("what is your fav food?");
		String f=scanner.nextLine();
		System.out.println("what is food prize?");
		float ft=scanner.nextFloat();
		scanner.nextLine();
		System.out.println("what is ur dogs name?");
		String n=scanner.nextLine();
		System.out.println("hello "+name);
		System.out.println("iam "+age+" years old");
		System.out.println("my favourite food is "+f);
		System.out.println("price is "+ft);
		System.out.println("name is "+n);
		
	}
	

}
