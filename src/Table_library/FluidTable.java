package Table_library;

public enum FluidTable {
	
	ETHANOL(0.789, 2.43, -117, 78.2, 841), 
	WATER(0.998, 4.19, 0, 100, 2260),
	SULFURIC_ACID(1.84, 1.38, 10, 336, 511),
	MERCURY(13.55, 0.14, -39, 357, 296),
	GLYCOL(1.113, 2.40, -16, 198, 800)
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
