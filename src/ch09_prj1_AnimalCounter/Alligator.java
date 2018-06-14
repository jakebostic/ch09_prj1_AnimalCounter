package ch09_prj1_AnimalCounter;

public class Alligator extends Animal {
	
	private String alligator;

	
	public void incrementCount() {
		
	}

	public void resetCount() {
		
	}

	public int getCount() {
		return 0;
	}

	@Override
	public String getCountString() {
		return count + " " + alligator;
	}

}
