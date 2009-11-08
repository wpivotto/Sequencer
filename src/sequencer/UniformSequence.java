package sequencer;

import java.util.Random;

public class UniformSequence implements Sequence<Double> {
	
	private double min;
	private double max;
	private long seed;
	
	public UniformSequence(double min, double max) {
		this(System.nanoTime(), min, max);
	}

	public UniformSequence(long seed, double min, double max) {
		this.seed = seed;
		this.min = min;
		this.max = max;
	}

	@Override
	public Double next() {
		return (float) min + ((max - min) * new Random(seed).nextDouble());  
	}

}
