package Table_library;

public enum FluidTable {
	
	ETANOL(0.789, 2.30, -117, 78.2, 841), 
	WATER(0.998, 4.19, 0, 100, 2260),
	SVAVELSYRA(1.84, 1.38, 10, 336, 511)
	;

	public double density;
	public double heatCapacity;
	public double meltPoint;
	public double boilPoint;
	public double steamEntalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}
	
}
