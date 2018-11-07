package metoder;

import Table_library.FluidTable;
import Table_library.GasTable;
import Table_library.SolidTable;

public class MethodLibrary {

	static double G = 9.82;
	static double p_0 = 101.3E3; // 101.3 kPa
	static double R = 8.3145;
	static double C = 2.99792458 * 1E8;
	
//	G - Gravitationskonstanten.
//	R - Almänna gaskonstanten.
//	p_0 - lufttrycket vid havsytan.
//	c - Ljusets hastighet i vakum.
//	g_swe - Tyngdaccelerationen för Sverige.

	public static void main(String[] args) {

		System.out.println(fahrenheitToCelsius(30));

		System.out.println(kelvinToCelsius(0));

		System.out.println(fluidPressure(FluidTable.WATER, 10));

		System.out.println(pressureUnderWater(10));

		System.out.println(kineticEnergy(2, 2));
		
		System.out.println(potentialEnergy(2, 5));
		
		System.out.println(fallSpeed(2.5));
		
		System.out.println(delta(5, 1));
		
		System.out.println(volumeToMass(FluidTable.WATER,1));
		
		System.out.println(volumeToMass(GasTable.AIR,1));
		
		System.out.println(volumeToMass(SolidTable.IRON, 1));
		
		System.out.println(svtVelocity(10, 5));

		System.out.println(svtDistance(10, 5));
		
		System.out.println(heat(SolidTable.IRON,1,2));
		
		System.out.println(heat(FluidTable.WATER,1,10));
		
		System.out.println(heat(GasTable.AIR,1,1));
		
		System.out.println(velocityToHeight(9.82));
		
		System.out.println(2 * 1E8);
	}

	/**
	 * Denna metod konverterar fahrenheit till celsius.
	 * 
	 * @param Double Temperatur fahrenheit
	 * @return Double Temperatur Celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8;
	}

	/**
	 * Denna metod konverterar kelvin till celsius.
	 * 
	 * @param kelvin Temperatur kelvin
	 * @return Temperatur Celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		return kelvin - 273.15;
	}

	/**
	 * Denna metod räknar ut trycket i en vätska på ett visst djup.
	 * 
	 * @param fluid Vätskans densitet
	 * @param deep  Djupet i meter
	 * @return Tryck på det bestämda djupet Pascal??
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = fluid.density * G * deep;
		return pressure;
	}

	/**
	 * Denna metod räknar ut trycket i vatten på ett visst djup.
	 * 
	 * @param deep Djupet i meter
	 * @return Tryck på det bestämda djupet pascal??
	 */
	public static double pressureUnderWater(double deep) {
		return deep * G * 0.998 * 1E3;
	}

	/**
	 * Denna metod beräknar Kinetisk energi på ett föremål
	 * 
	 * @param mass     Föremålets massa kg
	 * @param velocity Hastigheten på föremålet m/s
	 * @return Kinetisk energi för föremålet joule
	 */
	public static double kineticEnergy(double mass, double velocity) {
		return (mass * velocity * velocity) / 2;
	}

	/**
	 * Denna metod beräknar Lägesenergin för ett föremål
	 * 
	 * @param mass   Föremålets massa kg
	 * @param height Höjden föremålet befinner sig på m
	 * @return Lägesenergin för föremålet vid denna höjd joule
	 */
	public static double potentialEnergy(double mass, double height) {
		return mass * height * G;
	}
	
	/**
	 * 
	 * @param height
	 * @return
	 */
	public static double fallSpeed(double height) {
		return Math.sqrt(2*G*height);
			
	}
	
	//fallSpeed(2.5) => 7,00713922
	
	/**
	 * Denna metod beräknar förändringen mellan 2 tal
	 * @param first Tal 1
	 * @param last Tal 2
	 * @return Förändring från tal 1 till 2
	 */
	public static double delta(double first, double last) {
		return last - first;
	}

	/**
	 * Denna metod beräknar massan för en viss volym av en vätska
	 * @param fluid vätskan i fråga
	 * @param volume volymen man vill räkna ut massan för
	 * @return Massan man precis räknat ut
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		return volume * fluid.density;
	}
	
	/**
	 * Denna metod beräknar massan för en viss volym av en gas
	 * @param gas gasen i fråga
	 * @param volume volymen man vill räkna ut massan för
	 * @return Massan man precis räknat ut
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		return volume * gas.density;
	}
	
	/**
	 * Denna metod beräknar massan för en viss volym av en solid
	 * @param solid materialet i fråga
	 * @param volume volymen man vill räkna ut massan för
	 * @return Massan man precis räknat ut
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		return volume * solid.density;
	}
	
	/**
	 * Denna metod beräknar medelhastighet
	 * @param distance sträckan
	 * @param time tiden man färdades denna sträcka på
	 * @return medelhastighet
	 */
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	}
	
	/**
	 * Denna metod beräknar hur långt man kommer under en viss tid med en viss hastighet
	 * @param velocity hastigheten
	 * @param time tiden
	 * @return Sträckan
	 */
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	
	/**
	 * Denna metod räknar ut hur lång tid en sträcka tar att åka
	 * @param distance Sträckans längd
	 * @param velocity hastighten man åker i
	 * @return Tiden det tar att åka sträckan
	 */
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	}
	
	/**
	 * Denna metod räknar ut arbete med hjälp av kraft och sträcka.
	 * @param force 
	 * @param distance
	 * @return Arbete
	 */
	public static double work(double force, double distance) {
		return force * distance;
	}
	
	/**
	 * Denna metod räknar ut effekt med hjälp av arbete och tid.
	 * @param work
	 * @param time
	 * @return Effekt
	 */
	public static double power(double work, double time) {
		return work / time;
	}
	
	/**
	 * Denna metod räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet antal grader.
	 * @param solid
	 * @param mass
	 * @param deltaTemperatur
	 * @return Energin som krävs
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return mass * solid.heatCapacity * deltaT;
	}

	/**
	 * Denna metod räknar ut hur mycket energi som krävs för att värma en viss mängd vätska ett angivet antal grader.
	 * @param fluid
	 * @param volume
	 * @param deltaTemperatur
	 * @return Energin som krävs
	 */
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		return volume * fluid.density * fluid.heatCapacity * deltaT;
	}
	
	/**
	 * denna metod räknar ut hur mycket energi som krävs för att värma en viss volym gas ett angivet antal grader.
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return Energin som krävs
	 */
	public static double heat(GasTable gas, double volume, double deltaT) {
		return volume * gas.density * gas.heatCapacity * deltaT;
	}
	
	/**
	 * Denna metod räknar ut hur högt ett föremål med en viss hastighet uppåt kommer.
	 * @param velocity
	 * @return Höjd
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G);
	}
	
	

	

	
	



}
