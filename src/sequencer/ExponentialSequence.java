package sequencer;

import java.util.Random;

public class ExponentialSequence implements Sequence<Double> {
	
	private double media;
	private long seed;

	public ExponentialSequence(double media) {
		this(System.nanoTime(), media);
	}
	
	public ExponentialSequence(Long seed, double media) {
		this.seed = seed;
		this.media = media;
	}
	

	@Override
	public Double next() {
		double R = new Random(seed).nextDouble();
		return (double) (-1 * (Math.log(R) / media));
	}

	
	

}
