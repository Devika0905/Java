package exceptionhandling;

public class CustomE {
	int age=12;
	

	public static void main(String[] args) throws VoteException {
		CustomE obj=new CustomE();
		obj.voting();
	}
	public void voting() throws VoteException
	{
		if(age>=18)
		{
			System.out.println("is eligible");
		}
		else
		{
			throw new VoteException("is not eligible");
		}
	}

}
