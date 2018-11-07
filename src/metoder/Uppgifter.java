package metoder;

import com.sun.swing.internal.plaf.metal.resources.metal;

import Table_library.FluidTable;
import Table_library.SolidTable;

public class Uppgifter {
	
	public static void main(String[] args) {
//Hur mycket v�ger 80 dm^3 j�rn?
		System.out.println("Uppgift. 1 = " + MethodLibrary.volumeToMass(SolidTable.IRON, 0.080) + " Kg");
		
//Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?
		System.out.println("Uppgift. 2 = " + (MethodLibrary.svtDistance(2.8, 60 * 60) / 1000) + " Km");
		
//Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten?
		System.out.println("Uppgift. 3 = " + MethodLibrary.heat(FluidTable.WATER, 0.005, 1) + " Joule f�r 1 grad K");

//Hur stort �r det totala trycket 100 meter under havsytan?
		System.out.println("Uppgift. 4 = " + MethodLibrary.pressureUnderWater(100) + " Pascal");
		
//Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?
		System.out.println("Uppgift. 5 = " + (MethodLibrary.velocityToHeight(50 * 3.6) + 1.8) + " Meter");
		
//En bil med massan 740kg accelererar med konstant acceleration fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?
		System.out.println("Uppgift. 6 = " + MethodLibrary.power(MethodLibrary.work(740 * ((100 * 3.6) / 4.4), 100), 4.4) + " W");
		
//En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?
		
		double velocity = 14.01427843308388;
		
		int i = 0;
		
		for(double height = 10; height >= 0.5;) {
			
			height = MethodLibrary.velocityToHeight(velocity);
			velocity = MethodLibrary.fallSpeed(height) * 0.99;
			
			i++;
		}
		
		System.out.println("Uppgift. 7 = " + i + " ggr");
		
		
	}

}
