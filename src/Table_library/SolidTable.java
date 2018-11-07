package Table_library;

public enum SolidTable {
	
	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	CONCREATE(2, 0.92, 99999, 99999),
	ALUMINIUM(2.70, 0.90, 660, 397),
	PLATINUM(21.5, 0.133, 1768, 113)
	;

	public double density;
	public double heatCapacity;
	public double meltPoint;
	public double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

}
