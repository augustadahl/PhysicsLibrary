package metoder;

import Table_library.FluidTable;
import Table_library.GasTable;
import Table_library.SolidTable;

public class MethodLibrary {

	static double G_SWE = 9.82;
	static double P_0 = 101.3E3; // 101.3 kPa
	static double R = 8.3145;
	static double C = 2.99792458 * 1E8;
	static double G = 6.6726 * 1E-11;
	static double LY = 9.46055 * 1E15; //meter per ljus�r
	

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
	 * Denna metod r�knar ut trycket i en v�tska p� ett visst djup.
	 * 
	 * @param fluid V�tskans densitet
	 * @param deep  Djupet i meter
	 * @return Tryck p� det best�mda djupet Pascal??
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double pressure = fluid.density * G_SWE * deep;
		return pressure;
	}

	/**
	 * Denna metod r�knar ut trycket i vatten p� ett visst djup.
	 * 
	 * @param deep Djupet i meter
	 * @return Tryck p� det best�mda djupet pascal??
	 */
	public static double pressureUnderWater(double deep) {
		return deep * G_SWE * 0.998 * 1E3;
	}

	/**
	 * Denna metod ber�knar Kinetisk energi p� ett f�rem�l
	 * 
	 * @param mass     F�rem�lets massa kg
	 * @param velocity Hastigheten p� f�rem�let m/s
	 * @return Kinetisk energi f�r f�rem�let joule
	 */
	public static double kineticEnergy(double mass, double velocity) {
		return (mass * velocity * velocity) / 2;
	}

	/**
	 * Denna metod ber�knar L�gesenergin f�r ett f�rem�l
	 * 
	 * @param mass   F�rem�lets massa kg
	 * @param height H�jden f�rem�let befinner sig p� m
	 * @return L�gesenergin f�r f�rem�let vid denna h�jd joule
	 */
	public static double potentialEnergy(double mass, double height) {
		return mass * height * G_SWE;
	}
	
	/**
	 * Denna metod r�knar ut hastigheten f�r ett fallande objekt
	 * @param height
	 * @return Hastigheten
	 */
	public static double fallSpeed(double height) {
		return Math.sqrt(2*G_SWE*height);
			
	}
	
	//fallSpeed(2.5) => 7,00713922
	
	/**
	 * Denna metod ber�knar f�r�ndringen mellan 2 tal
	 * @param first Tal 1
	 * @param last Tal 2
	 * @return F�r�ndring fr�n tal 1 till 2
	 */
	public static double delta(double first, double last) {
		return last - first;
	}

	/**
	 * Denna metod ber�knar massan f�r en viss volym av en v�tska
	 * @param fluid v�tskan i fr�ga
	 * @param volume volymen man vill r�kna ut massan f�r
	 * @return Massan man precis r�knat ut
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		return volume * fluid.density;
	}
	
	/**
	 * Denna metod ber�knar massan f�r en viss volym av en gas
	 * @param gas gasen i fr�ga
	 * @param volume volymen man vill r�kna ut massan f�r
	 * @return Massan man precis r�knat ut
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		return volume * gas.density;
	}
	
	/**
	 * Denna metod ber�knar massan f�r en viss volym av en solid
	 * @param solid materialet i fr�ga
	 * @param volume volymen man vill r�kna ut massan f�r
	 * @return Massan man precis r�knat ut
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		return volume * solid.density;
	}
	
	/**
	 * Denna metod ber�knar medelhastighet
	 * @param distance str�ckan
	 * @param time tiden man f�rdades denna str�cka p�
	 * @return medelhastighet
	 */
	public static double svtVelocity(double distance, double time) {
		return distance / time;
	}
	
	/**
	 * Denna metod ber�knar hur l�ngt man kommer under en viss tid med en viss hastighet
	 * @param velocity hastigheten
	 * @param time tiden
	 * @return Str�ckan
	 */
	public static double svtDistance(double velocity, double time) {
		return velocity * time;
	}
	
	/**
	 * Denna metod r�knar ut hur l�ng tid en str�cka tar att �ka
	 * @param distance Str�ckans l�ngd
	 * @param velocity hastighten man �ker i
	 * @return Tiden det tar att �ka str�ckan
	 */
	public static double svtTime(double distance, double velocity) {
		return distance / velocity;
	}
	
	/**
	 * Denna metod r�knar ut arbete med hj�lp av kraft och str�cka.
	 * @param force 
	 * @param distance
	 * @return Arbete
	 */
	public static double work(double force, double distance) {
		return force * distance;
	}
	
	/**
	 * Denna metod r�knar ut effekt med hj�lp av arbete och tid.
	 * @param work
	 * @param time
	 * @return Effekt
	 */
	public static double power(double work, double time) {
		return work / time;
	}
	
	/**
	 * Denna metod r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet antal grader.
	 * @param solid
	 * @param mass
	 * @param deltaTemperatur
	 * @return Energin som kr�vs
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		return mass * solid.heatCapacity * deltaT;
	}

	/**
	 * Denna metod r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss m�ngd v�tska ett angivet antal grader.
	 * @param fluid
	 * @param volume
	 * @param deltaTemperatur
	 * @return Energin som kr�vs
	 */
	public static double heat(FluidTable fluid, double volume, double deltaT) {
		return volume * fluid.density * fluid.heatCapacity * deltaT;
	}
	
	/**
	 * denna metod r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss volym gas ett angivet antal grader.
	 * @param gas
	 * @param volume
	 * @param deltaT
	 * @return Energin som kr�vs
	 */
	public static double heat(GasTable gas, double volume, double deltaT) {
		return volume * gas.density * gas.heatCapacity * deltaT;
	}
	
	/**
	 * Denna metod r�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer.
	 * @param velocity m/s
	 * @return H�jd M
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G_SWE);
	}
	
	//egna metoder nedanf�r
	
	
	/**
	 * Denna metod r�knar ut tryck 
	 * @param tryckkraft N
	 * @param area m2
	 * @return tryck N/m2 / Pascal Pa
	 */
	public static double tryck(double tryckkraft, double area) {
		return tryckkraft / area;
	}
	
	/**
	 * Denna metod ber�knar tryckkraft
	 * @param mass Kg
	 * @return tyngdkraft N
	 */
	public static double Tyngdkraft(double mass) {
		return mass * G_SWE;
	}
	
	/**
	 * Denna metod r�knar ut lyftkraften p� ett f�rem�l som befinner sig i en v�tska
	 * @param fluid 
	 * @param volume Volymen p� den undantr�ngda v�tskan. Liter
	 * @return Lyftkraften N
	 */
	public static double ArkimedesPrincip(FluidTable fluid, double volume) {
		return fluid.density * (volume/1000) * G_SWE;
	}

	/**
	 * Denna metod r�knar ut friktionen p� ett f�rem�l
	 * @param Ftal friktionstalet
	 * @param Mass kg
	 * @return Friktionskraften N
	 */
	public static double Friction(double Ftal, double Mass) {
		return Ftal * Mass * G_SWE;
	}
	
	/**
	 * Denna metod r�knar ut luftmotst�ndet p� ett f�rem�l
	 * @param C Luftmotst�ndskoefficient (bil ca 0.25 till 0.45)
	 * @param area Tv�rsnittsarea m2
	 * @param velocity m/s
	 * @return Luftmotst�nd N
	 */
	public static double Luftmotst�nd(double C, double area, double velocity) {
		return (C * GasTable.AIR.density * area * Math.pow(velocity, 2)) / 2;
	}
	
	/**
	 * Denna metod ber�knar en ungef�rlig bromsstr�cka p� en vanilg personbil (grovt f�renklat)
	 * @param velocity Km/h
	 * @return Bromsstr�cka Meter
	 */
	public static double BrakeDistance(double velocity) {
		return Math.pow(velocity / 3.6, 2) / (2 * 2.5);
	}
	
	/**
	 * Denna metod r�knar ut hur l�ngt bort fr�n ett blixtnedslag man befinner sig
	 * @param DeltaT sekunder mellan ljuset och ljudet
	 * @return Distance Km
	 */
	public static double LightningDistance(double DeltaT) {
		return (330 * DeltaT) / 1000;
	}
	
	/**
	 * Denna metod r�knar ut Gravitationskraften mellan partiklar
	 * @param mass_1 KG
	 * @param mass_2 KG
	 * @param distance Meter (mellan kropparnas tyngdpunkt)
	 * @return Force N
	 */
	public static double Gravity(double mass_1, double mass_2, double distance) {
		return G * ((mass_1 * mass_2) / Math.pow(distance, 2));
	}
	
	/**
	 * Denna metod ber�knar hur l�ngt ljus f�rdas under en viss tid
	 * @param deltaT Sekunder
	 * @return Distance Ljus�r
	 */
	public static double Lightyear(double deltaT) {
		return (C * deltaT) / LY;
	}
	
	/**
	 * Denna metod omvandlar Brittiska Miles per gallon till Liter per 100 Km
	 * @param MpG 
	 * @return L/100km
	 */
	public static double MpGtoLper100Km(double MpG) {
		return (100 * 4.5461) / (1.609344 * MpG);
	}
	
	
	

	
	
	
	
	
	
	

	

	
	



}
