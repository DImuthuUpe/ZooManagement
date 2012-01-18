
public class Dog extends Animal{

	@Override
	public void walk() {
		System.out.println("Dog is walking");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping");
		
	}
	
	public Dog(int noOfLegs, String type){
		super(noOfLegs, type);
	}
	
}
