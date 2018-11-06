package metoder;

import Table_library.FluidTable;

public class MethodLibrary {

	static double G = 9.82;
	static double ATM = 101.3E3; // 101.3 kPa

	public static void main(String[] args) {

		System.out.println(fahrenheitToCelsius(30));

		System.out.println(kelvinToCelsius(0));

		System.out.println(fluidPressure(FluidTable.WATER, 10));

		System.out.println(pressureUnderWater(10));

		System.out.println(kineticEnergy(2, 2));
		
		System.out.println(potentialEnergy(2, 5));
		
		
		
		System.out.println(delta(5, 1));

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
	
//	/**
//	 * 
//	 * @param height
//	 * @return
//	 */
//	public static double fallSpeed(double height) {
//		for(int i = height; i <= 0; i--) {
//			
//		}
//	}
//	//fallSpeed(2.5) => 7,00713922
	
	public static double delta(double first, double last) {
		return last - first;
	}
//	delta(1,10) => 9
//	delta(5,1) => -4

}
