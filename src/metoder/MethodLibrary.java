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
		
		System.out.println(kineticEnergy(2,2));

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
	 * @param deep Djupet i meter
	 * @return Tryck på det bestämda djupet
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = fluid.density * G * deep;
		return pressure;
	}
	
	/**
	 * Denna metod räknar ut trycket i vatten på ett visst djup.
	 * 
	 * @param deep Djupet i meter
	 * @return Tryck på det bestämda djupet
	 */
	public static double pressureUnderWater(double deep) {
		return deep * G * 0.998 * 1E3;
	}

	/**
	 * Denna metod beräknar Kinetisk energi på ett föremål 
	 * @param mass Föremålets massa
	 * @param velocity Hastigheten på föremålet
	 * @return Kinetisk energi för föremålet
	 */
	public static double kineticEnergy(double mass, double velocity) {
		return (mass * velocity * velocity) / 2;
	}
	
	public static double potentialEnergy(double mass, double height) {
		
	
	}
	//potentialEnergy(2,5) => 98.2

	
	
	
}
