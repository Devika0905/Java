package sampleprojects;

public class Continue {
	public static void maion(String[]args)
	{
		for(int b=0;b<=10;b++)
		{
			if(b==6)
			{
				continue;
			}
			System.out.print(b);
		}
	}

}
