
public abstract class Animal {
	private int noOfLegs;
	private String type;
	public abstract void walk();
	public abstract void sleep();
	
	public int getNoOfLegs(){
		return noOfLegs;
	}
	public String getType(){
		return type;
	}
	
	public void setNoOfLegs(int noOfLegs){
		this.noOfLegs  = noOfLegs;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public Animal(int noOfLegs,String type){
		this.noOfLegs = noOfLegs;
		this.type = type;
	}
}
