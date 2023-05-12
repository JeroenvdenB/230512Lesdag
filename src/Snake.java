
public class Snake extends Animal{
	private double noodleLevel = 0.0;

	public double getNoodleLevel() {
		return noodleLevel;
	}

	public void setNoodleLevel(double noodleLevel) {
		this.noodleLevel = noodleLevel;
	}

	@Override //Gaat een error geven als de parent method verdwijnt
	public void makeSound() {
		System.out.println("Hissssss");
		
	}
	
}
