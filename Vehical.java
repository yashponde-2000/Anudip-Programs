package lab15;

class Car extends vehicle
	{
		@Override
		public void startEngine() {
			System.out.println("the car engine is started ");	
		}
		@Override
		public void stopEngine() {
			System.out.println("the car engine is stop");
		}
	}

	//sub class access all the properties by extending parent class
	class Motorcycle extends vehicle 
	{
		@Override
		public void startEngine() {
			System.out.println("the Motorcycle engine is started");
		}
		@Override
		public void stopEngine() {
			System.out.println("the motorcycle engine is stop");
		}
	}

	//create a abstract class which contain abstract method 
	abstract class vehicle{
		
		public abstract void startEngine();
		public abstract void stopEngine();

		public static void main(String[] args) {
			
			//make a instance of sub classes 
			Car c=new Car();
			Motorcycle m=new Motorcycle();
			
			//call the start stop method for car class
			c.startEngine();
			c.stopEngine();
			
			//call the start stop method for Motorcycle class
			m.startEngine();
			m.stopEngine();

		

	}
}
