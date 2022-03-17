package Vehicles;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Esta clase es la principal del proyecto y en ella se implementa la interaccón
 * con el usuario se le permitirá crear 10 vehiculos y al final se le muestra la información de estos.
 *
 * @version 1.0.0 2022-03-04
 *
 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
 *
 * @since versión 1
 */
public class MainVehicle {

	public static void main(String[] args) throws ParseException {

		Vehicle[] vehicles = new Vehicle[10];
		Scanner input = new Scanner(System.in);

		System.out.println("Registro de vehiculos, por favor diligencie los siguientes datos: \n");

		for (int i = 0; i < vehicles.length; i++) {
			System.out.print("Tipo: ");
			String type = input.next();
			System.out.print("Número de pasajeros: ");
			int numPassenger = input.nextInt();
			System.out.print("¿El vehiculo tiene tripulación? digite 1 para si y 0 para no");
			boolean crew;
			if (input.nextInt() >= 1) {
				crew = true;
			} else {
				crew = false;
			}
			;
			System.out.print("Medio por el que se desplaza el vehiculo: ");
			String meansOfTravel = input.next();
			System.out.print("Número de ruedas: ");
			int numWheels = input.nextInt();
			System.out.print("Fecha matricula (dd/mm/AAAA");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Date dateRegistration = format.parse(input.next());
			vehicles[i] = new Vehicle(type, numPassenger, crew, meansOfTravel, numWheels, dateRegistration);

		}

		System.out.println("Listado de vehiculos ingresados: \n");

		for (int i = 0; i < vehicles.length; i++) {
			System.out.println((i + 1) + ". Tipo: " + vehicles[i].getType() + " - Número Pasajeros: "
					+ vehicles[i].getNumberPassengers() + " - ¿Crew?: " + vehicles[i].isCrew()
					+ " - Medio de transporte: " + vehicles[i].getMeansOfTravel() + " - Número de ruedas: "
					+ vehicles[i].getNumberWheels() + " - Fecha matricula: "+ vehicles[i].getDateRegistration()
					+ " - ¿Encendido?: "+ vehicles[i].isVehicleOn() + "\n");
		}
		
		input.close();

	}

}
