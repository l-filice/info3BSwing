package it.unibg.sommaMVC;

/**
 * 
 * The model of the system
 * @author Luka8
 *
 */

public class Model {
	
	int a;
	int b;
	int somma;
	
	public Model(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int getSomma() {
		return somma;
	}
	
	public void computeSum(int a, int b) {
		this.a = a;
		this.b = b;
		computeSum();
	}
	
	public void computeSum() {
		somma = a + b;
	}
}
