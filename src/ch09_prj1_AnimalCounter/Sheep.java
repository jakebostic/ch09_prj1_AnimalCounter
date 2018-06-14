package ch09_prj1_AnimalCounter;

public class Sheep extends Animal implements Cloneable {
	
	private String name;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void incrementCount() {
		
	}

	@Override
	public void resetCount() {
		
	}

	@Override
	public int getCount() {
		return 0;
	}
	
	
	@Override
	public String getCountString() {
		return name;
	}


}
