package encapsulation;

public class ClassA {
	private int pin;
	public void setter(int pin)
	{
		this.pin=pin;
	}
	public void getter()
	{
		if(pin==1001)
		{
			System.out.println("pin number match");
		}
		 else if(pin==1234)
		{
			 System.out.println("pin number match");
		}
		 else if(pin==1212)
		 {
			 System.out.println("pin number match");
		 }
		 else
		 {
			 System.out.println("wrong pin number");
			 }
		
	}

}
