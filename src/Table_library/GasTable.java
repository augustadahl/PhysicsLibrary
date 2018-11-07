package Table_library;

public enum GasTable {

	AIR(1.29, 1.01), 
	OXYGEN(1.43, 0.92),
	HELIUM(0.18, 5.1),
	HYDROGEN(0.090, 14.2),
	NEON(0.90, 1.03)
	;

	public double density;
	public double heatCapacity;

	GasTable(double d, double hc) {
		density = d;
		heatCapacity = hc * 1E3; // 1E3 = 1*10^3
	}
	
}
