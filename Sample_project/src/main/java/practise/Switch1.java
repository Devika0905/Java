package practise;

public class Switch1 {
	

	
		public static void main (String args[]) {
			String d="wednesday";
			switch(d)//statement that allows a variable to be tested for equality aganist list of values
			{
			case"monday":
			System.out.print("Monday");
			break;
			case"tuesday":
				System.out.print("tuesday");
				break;
			case"wednesday":
				System.out.print("wednesday");
				break;
			case"thursday":
				System.out.print("thursday");
				break;
			case"friday":
				System.out.print("friday");
				break;
			case"saturday":
				System.out.print("saturday");
				break;
			case"sunday":
				System.out.print("sunday");
				break;
				default:
					System.out.print("not a day");
					break;
			}
			
		}

	}



