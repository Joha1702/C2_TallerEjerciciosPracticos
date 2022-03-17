package PlanetarySystem;

import java.util.UUID;

/**
 * Esta clase representa los atributos principales de un Planeta y sus m�todos necesarios para acceder a los atributos.
 * 
 * @version 1.0.0 2022-02-19
 *
 * @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com.
 *
 * @since versi�n 1
 *
 */
public class Planet {
	
	/**
	 * name representa el nombre de un planeta.
	 */
	private String name;
	/**
	 * mass representa la masa de un planeta en Kg
	 */
	private double mass;
	/**
	 * representa la desidad de un planeta en g/cm^3
	 */
	private double density;
	/**
	 * representa el diametro de un planeta en Km
	 */
	private double diameter;
	/**
	 * Representa la distancia al sol de un planeta en millones de Km
	 */
	private double distanceToSun;
	/**
	 * Identificador �nico de cada planeta
	 */
	private UUID Id;
	/**
	 * N�mero de satelites de un planeta
	 */
	private int satelliteNumber;
	
	
	/**
	 * M�todo constructor para inicilizar un objeto Planet.
	 *
	 * @param name: nombre del planeta
	 * @param mass: masa del planeta
	 * @param density: densidad del planeta
	 * @param diameter: diametro del planeta
	 * @param distanceToSun: distancia al sol de un planeta
	 * @param stalliteNumber: n�mero de satelites de un planeta
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public Planet(String name, double mass, double density, double diameter, double distanceToSun, int satelliteNumber) {
		this.name = name;
		this.mass = mass;
		this.density = density;
		this.diameter = diameter;
		this.distanceToSun = distanceToSun;
		Id = UUID.randomUUID();
		this.satelliteNumber = satelliteNumber;
	}
	
	/**
	 * M�todo constructor vacio de un objeto Planet.
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public Planet() {
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the mass
	 */
	public double getMass() {
		return mass;
	}

	/**
	 * @return the density
	 */
	public double getDensity() {
		return density;
	}


	/**
	 * @return the diameter
	 */
	public double getDiameter() {
		return diameter;
	}

	/**
	 * @return the distanceToSun
	 */
	public double getDistanceToSun() {
		return distanceToSun;
	}

	/**
	 * @return the id
	 */
	public UUID getId() {
		return Id;
	}
	
	/**
	 * @return the satelliteNumber
	 */
	public int getSatelliteNumber() {
		return satelliteNumber;
	}

}
