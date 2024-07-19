package yashPackage;

class Vehical 
{
	String brand="Maruti";

	public void honk() 
	{
		System.out.println("beep beep!....");

	}

}
public class Car extends Vehical {
	String modelName = "800";
	
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.honk();
		System.out.println(myCar.brand + " "+ myCar.modelName);
	}
}