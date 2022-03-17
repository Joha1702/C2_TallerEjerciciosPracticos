package Vehicles;

import java.util.Date;

/**
 * Clase que representa los atributos y métodos principales de un vehiculo.
 *
 * @version 1.0.0 2022-03-04
 *
 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
 *
 * @since versión 1
 */

public class Vehicle {
	
	private String type;
	private int numberPassengers;
	private boolean crew;
	private String meansOfTravel;
	private int numberWheels;
	private Date dateRegistration;
	private boolean vehicleOn;
	
	/**
	 * Método constructor que permite crear un nuevo vehiculo con sus atributos.
	 *
	 * @param type: tipo de vehiculo
	 * @param numberPassenger: número de pasajeros de tipo entero
	 * @param crew: atributo de tipo booleano que indica si el vehiculo tiene o no tripulación.
	 * @param meansOfTravel: medio por el que se transporta de tipo cadena
	 * @param numberWheels: número de ruedas de tipo entero.
	 * @param dateRegistration fecha de matricula de tipo Date
	 * @param vehicleOn de tipo booleano indica si el vehiculo esta encendido o no.
	 *
	 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public Vehicle(String type, int numberPassengers, boolean crew, String meansOfTravel, int numberWheels,
			Date dateRegistration) {
		this.type = type;
		this.numberPassengers = numberPassengers;
		this.crew = crew;
		this.meansOfTravel = meansOfTravel;
		this.numberWheels = numberWheels;
		this.dateRegistration = dateRegistration;
		this.vehicleOn = false;
	}


	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the numberPassengers
	 */
	public int getNumberPassengers() {
		return numberPassengers;
	}


	/**
	 * @param numberPassengers the numberPassengers to set
	 */
	public void setNumberPassengers(int numberPassengers) {
		this.numberPassengers = numberPassengers;
	}


	/**
	 * @return the crew
	 */
	public boolean isCrew() {
		return crew;
	}


	/**
	 * @param crew the crew to set
	 */
	public void setCrew(boolean crew) {
		this.crew = crew;
	}


	/**
	 * @return the meansOfTravel
	 */
	public String getMeansOfTravel() {
		return meansOfTravel;
	}


	/**
	 * @param meansOfTravel the meansOfTravel to set
	 */
	public void setMeansOfTravel(String meansOfTravel) {
		this.meansOfTravel = meansOfTravel;
	}


	/**
	 * @return the numberWheels
	 */
	public int getNumberWheels() {
		return numberWheels;
	}


	/**
	 * @param numberWheels the numberWheels to set
	 */
	public void setNumberWheels(int numberWheels) {
		this.numberWheels = numberWheels;
	}


	/**
	 * @return the dateRegistration
	 */
	public Date getDateRegistration() {
		return dateRegistration;
	}


	/**
	 * @param dateRegistration the dateRegistration to set
	 */
	public void setDateRegistration(Date dateRegistration) {
		this.dateRegistration = dateRegistration;
	}
	
	/**
	 * @return the vehicleOn
	 */
	public boolean isVehicleOn() {
		return vehicleOn;
	}
	
	/**
	 * Método que activa el estado de vehiculo a encendido
	 * @return un mensaje confirmando que el vehiculo ha sido encendido
	 */
	public String turnOnVehicle() {
		vehicleOn = true;
		return "Vehiculo encendido correctamente";
	}
	
	/**
	 * Método que activa el estado de vehiculo a apagado
	 * @return un mensaje confirmando que el vehiculo ha sido apagado
	 */
	public String turnOffVehicle() {
		vehicleOn = false;
		return "Vehiculo apagado correctamente";
	}
	
	

}
