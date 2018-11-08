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
	static double LY = 9.46055 * 1E15;
	

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
		double pressure = fluid.density * G_SWE * deep;
		return pressure;
	}

	/**
	 * Denna metod räknar ut trycket i vatten på ett visst djup.
	 * 
	 * @param deep Djupet i meter
	 * @return Tryck på det bestämda djupet pascal??
	 */
	public static double pressureUnderWater(double deep) {
		return deep * G_SWE * 0.998 * 1E3;
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
		return mass * height * G_SWE;
	}
	
	/**
	 * Denna metod räknar ut hastigheten för ett fallande objekt
	 * @param height
	 * @return Hastigheten
	 */
	public static double fallSpeed(double height) {
		return Math.sqrt(2*G_SWE*height);
			
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
	 * @param velocity m/s
	 * @return Höjd M
	 */
	public static double velocityToHeight(double velocity) {
		return Math.pow(velocity, 2) / (2 * G_SWE);
	}
	
	//egna metoder nedanför
	
	
	/**
	 * Denna metod räknar ut tryck 
	 * @param tryckkraft N
	 * @param area m2
	 * @return tryck N/m2 / Pascal Pa
	 */
	public static double tryck(double tryckkraft, double area) {
		return tryckkraft / area;
	}
	
	/**
	 * Denna metod beräknar tryckkraft
	 * @param mass Kg
	 * @return tyngdkraft N
	 */
	public static double Tyngdkraft(double mass) {
		return mass * G_SWE;
	}
	
	/**
	 * Denna metod räknar ut lyftkraften på ett föremål som befinner sig i en vätska
	 * @param fluid 
	 * @param volume Volymen på den undanträngda vätskan. Liter
	 * @return Lyftkraften N
	 */
	public static double ArkimedesPrincip(FluidTable fluid, double volume) {
		return fluid.density * (volume/1000) * G_SWE;
	}

	/**
	 * Denna metod räknar ut friktionen på ett föremål
	 * @param Ftal friktionstalet
	 * @param Mass kg
	 * @return Friktionskraften N
	 */
	public static double Friction(double Ftal, double Mass) {
		return Ftal * Mass * G_SWE;
	}
	
	/**
	 * Denna metod räknar ut luftmotståndet på ett föremål
	 * @param C Luftmotståndskoefficient (bil ca 0.25 till 0.45)
	 * @param area Tvärsnittsarea m2
	 * @param velocity m/s
	 * @return Luftmotstånd N
	 */
	public static double Luftmotstånd(double C, double area, double velocity) {
		return (C * GasTable.AIR.density * area * Math.pow(velocity, 2)) / 2;
	}
	
	/**
	 * Denna metod beräknar en ungefärlig bromssträcka på en vanilg personbil (grovt förenklat)
	 * @param velocity Km/h
	 * @return Bromssträcka Meter
	 */
	public static double BrakeDistance(double velocity) {
		return Math.pow(velocity / 3.6, 2) / (2 * 2.5);
	}
	
	/**
	 * Denna metod räknar ut hur långt bort från ett blixtnedslag man befinner sig
	 * @param DeltaT sekunder mellan ljuset och ljudet
	 * @return Distance Km
	 */
	public static double LightningDistance(double DeltaT) {
		return (330 * DeltaT) / 1000;
	}
	
	/**
	 * Denna metod räknar ut Gravitationskraften mellan partiklar
	 * @param mass_1 KG
	 * @param mass_2 KG
	 * @param distance Meter (mellan kropparnas tyngdpunkt)
	 * @return Force N
	 */
	public static double Gravity(double mass_1, double mass_2, double distance) {
		return G * ((mass_1 * mass_2) / Math.pow(distance, 2));
	}
	
	/**
	 * Denna metod beräknar hur långt ljus färdas under en viss tid
	 * @param deltaT Sekunder
	 * @return Distance Ljusår
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
