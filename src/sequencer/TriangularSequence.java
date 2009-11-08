package sequencer;

import java.util.Random;

public class TriangularSequence implements Sequence<Double> {
	
	private double min;
	private double max;
	private double moda;
	private long seed;
	
	public TriangularSequence(double min, double max, double moda) {
		this(System.nanoTime(), min, max, moda);
	}

	public TriangularSequence(long seed, double min, double max, double moda) {
		this.seed = seed;
		this.min = min;
		this.max = max;
		this.moda = moda;
	}

	@Override
	public Double next() {
		
		double number = new Random(seed).nextDouble();	 
		 
		if (number < ((max - min)/(moda - min))){
			return (double) (min + (Math.sqrt(number*(max - min)*(moda - min))));
		}
		else if (number > ((max-min) / (moda - min))){
			return (double) (moda - (Math.sqrt((1 - number)*(moda - max)*(moda - min))));
		}	
		else return Double.MIN_VALUE;  
	}

}
