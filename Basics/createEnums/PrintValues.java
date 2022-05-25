package createEnums;

public class PrintValues {

	public static void main(String[] args) {
		
	
		Days[]array=Days.values();
		System.out.println("All constants in enum: ");
		for(Days day:array)
		{
			System.out.println(day);
		}
		
		System.out.println("Value of : "+Days.valueOf("SATURDAY"));
		
		System.out.println("Index of Friday: "+Days.FRIDAY.ordinal());

	}

}
