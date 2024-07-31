package polymorphism;

public class Offseason extends Onseason {

	public static void main(String[] args) {
	Offseason obj=new Offseason();
	obj.total();
	obj.discount();

	}
	public void discount()
	{
		super.discount();
		d=tot*40/100f;
		System.out.println("Discount of Offseason="+d);
	}

}
