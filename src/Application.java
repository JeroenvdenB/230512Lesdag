
public class Application {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		Gecko gecko1 = new Gecko();
		Snake noodle = new Snake();
		
		noodle.setLegs(0);
		noodle.setName("Danger noodle");
		noodle.setType("Reptile");
		
		cat1.setLegs(3);
		cat1.setName("Boris");
		cat1.setType("Mammal");
		
		gecko1.setName("Sam");
		gecko1.setLegs(4);
		gecko1.setType("Sticky");
		gecko1.name = "Tricko"; //Dit mag voor encapsulation niet...
		//maar protected geeft toegang in dezelfde map.

		noodle.setNoodleLevel(12.2);
		System.out.println(noodle.getNoodleLevel());
		
		Animal cat2 = new Snake();
		cat2.makeSound();
		
	}
	
	

}
