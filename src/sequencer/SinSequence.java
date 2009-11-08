package sequencer;

import java.util.Random;

public class SinSequence implements Sequence<Double> {

	private double min;
	private double max;
	private double aux;
	private double noise;
	private long seed;
	
	public SinSequence(double min, double max, double noise) {
		this(System.nanoTime(), min, max, noise);
	}
	
	public SinSequence(long seed, double min, double max, double noise) {
		this.seed = seed;
		this.min = min;
		this.max = max;
		this.noise = noise;
	}

	@Override
	public Double next() {
		double value = (max - min) / 2 + 2 * Math.sin(aux) * 180 / Math.PI + new Random(seed).nextDouble() * noise / 100 * (max - min) * 2;
		aux += 0.1d;
		return value;
	}
	

}
