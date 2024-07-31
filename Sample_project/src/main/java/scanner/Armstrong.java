package scanner;
import java.util.Scanner;
import java.lang.Math;

public class Armstrong { 
	public static void main(String []args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the input:");
		int num=obj.nextInt();
		System.out.println("number="+num);
		int org=num;
		int digits=String.valueOf(num).length();
		 double arm=0;
	
		while(num>0) {
			 int temp=num%10;
			 arm=arm+Math.pow(num,digits);
			 num=num/10;
			 
			 
		}
		if(org==arm)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not rm");
		}
		obj.close();
		
	}

}
