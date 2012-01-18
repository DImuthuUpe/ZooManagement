
public class Cat extends Animal{

	public Cat(int noOfLegs, String type) {
		super(noOfLegs, type);
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping");
	}

}
