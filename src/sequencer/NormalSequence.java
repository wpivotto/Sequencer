package sequencer;

import java.util.Random;

public class NormalSequence implements Sequence<Double> {
	
	private double avg;
	private double stdDeviation;
	private long seed;

	public NormalSequence(long seed, double avg, double stdDeviation) {
		this.seed = seed;
		this.avg = avg;
		this.stdDeviation = stdDeviation;
	}
	
	public NormalSequence(double avg, double stdDeviation) {
		this(System.nanoTime(), avg, stdDeviation);
	}
	

	@Override
	public Double next() {
		double random = new Random(seed).nextDouble();
		double value = (double) (Math.sqrt(Math.log(random) * -2) * (Math.sin(random * Math.PI * 2)));	 
		return  avg + stdDeviation * value;
	}
	
	
	
	

}
