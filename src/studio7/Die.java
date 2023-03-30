package studio7;

public class Die {
	private int numSides;
	public  Die (int n) {
		this.numSides = n;
	}
	public int roll() {
		int sides = this.numSides;
		return (int)((Math.random()* sides)+1);
	}

}
