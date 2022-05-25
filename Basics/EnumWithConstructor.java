
enum Beer
{
	KF(90),RC,KO(80,"kowlu");
	int price;
	String brand;
	
	
	Beer(int price)
	{
		this.price=price;
		this.brand="Drink";
	}
	
	Beer(int price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	Beer() 
	{
		this.price=60;
		this.brand="Drink";
	}

	public String toString()
	{
		return price+" : "+brand;
	}
	
}
	
public class EnumWithConstructor 
{
	public static void main(String args[])
	{
		Beer b[]=Beer.values();
		for(Beer n:b)
		{
			System.out.println(n);
		}
	}
}
