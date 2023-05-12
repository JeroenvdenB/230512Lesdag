
public abstract class Animal {
	//Declarations
	protected String name;
	
	protected String type;
	
	protected int legs;
	
	public abstract void makeSound(); //abstract method to inherit

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	//Niet alle dieren springen
	//Ik ook niet.
	
}
