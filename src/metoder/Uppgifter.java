package metoder;

import Table_library.FluidTable;
import Table_library.SolidTable;

public class Uppgifter {
	
	public static void main(String[] args) {
//Hur mycket väger 80 dm^3 järn?
		System.out.println("Uppgift. 1 = " + MethodLibrary.volumeToMass(SolidTable.IRON, 0.080) + " Kg");
		
//Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?
		System.out.println("Uppgift. 2 = " + (MethodLibrary.svtDistance(2.8, 60 * 60) / 1000) + " Km");
		
//Hur mycket energi krävs för att värma upp 5 liter vatten?
		System.out.println("Uppgift. 3 = " + MethodLibrary.heat(FluidTable.WATER, 0.005, 1) + " Joule för 1 grad K");

//Hur stort är det totala trycket 100 meter under havsytan?
		System.out.println("Uppgift. 4 = " + MethodLibrary.pressureUnderWater(100) + " Pascal");
		
//Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?
		System.out.println("Uppgift. 5 = " + (MethodLibrary.velocityToHeight((50 * 1000) / 3600) + 1.8) + " Meter");
		
		
		
		
		
		
	}

}
