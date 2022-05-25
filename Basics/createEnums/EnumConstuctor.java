package createEnums;

enum Fruit
{
	Apple(545),Banana,Mango(34),Grapes(30);
	
	int price;
	
	void setPrice(int price)
	{
		this.price=price;
	}
	Fruit(int price)
	{
		this.price=price;
	}
	Fruit()
	{
		price=90;
		System.out.println("Const");
	}
	
}

public class EnumConstuctor {

	public static void main(String[] args) {
		
		Fruit.Banana.setPrice(45);
		Fruit[]array=Fruit.values();
		for(Fruit f:array)
		{
			System.out.println(f.price);
		}
		
		Fruit apple=Fruit.Apple;
		Fruit banana=Fruit.Banana;
		Fruit mango=Fruit.Mango;
		Fruit banana1=Fruit.Banana;
		
		if(apple.compareTo(mango)<0)
		{
			System.out.println("Apple comes first ");
		}
		else
		{
			System.out.println("Mango comes first" );
		}
		
		if(apple.compareTo(banana)>0)
		{
			System.out.println("Banana Comes first ");
		}
		else
		{
			System.out.println("Apple comes first" );
		}
		
		if(banana.equals(banana1))
		{
			System.out.println("EQual");
		}
		else
		{
			System.out.println("Not Equals");
		}
		
		if(banana==banana1)
		{
			System.out.println("banana==banana");
		}
		
		

	}

}
