package createEnums;


public class SwitchCase {

	
	public static void main(String[] args) {
		
		Days day=Days.SUNDAY;
		switch(day)
		{
			case MONDAY:
				System.out.println("Monday ");
				break;
				
			case TUESDAY:
				System.out.println("Tuesday ");
				break;
			case WEDNESDAY:
				System.out.println("Wednesday");
				break;
			case THURSDAY:
				System.out.println("Thursday ");
				break;
			case FRIDAY:
				System.out.println("Friday");
				break;
			case SATURDAY:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid ");
				break;
		}
		

	}

}
