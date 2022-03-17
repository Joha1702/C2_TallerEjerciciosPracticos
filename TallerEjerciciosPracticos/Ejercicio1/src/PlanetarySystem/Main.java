package PlanetarySystem;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Esta clase es la principal del proyecto y en ella se implementa la interacc�n
 * con el usuario.
 *
 * @version 1.0.0 2022-02-19
 *
 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
 *
 * @since versi�n 1
 */
public class Main {

	private static Scanner input;

	/**
	 * M�todo principal donde se incializa la informaci�n de los planetas y mediante
	 * un switch case, se le da varias opciones al usuario para consultar
	 * informaci�n sobre los planetas.
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public static void main(String[] args) {
		input = new Scanner(System.in);
		PlanetImplementation planet = new PlanetImplementation();
		ArrayList<Planet> planets = planet.initPlanet();

		int option = Integer.parseInt(JOptionPane.showInputDialog("--- Sistema Solar -----\n" + "Que desea realizar?\n"
				+ "1. Ver la informaci�n de un planeta\n" + "2. Calcular la atracci�n gravitacional entre dos cuerpos\n"
				+ "3. Ver listado de todos los planetas del sistema\n" + "4. Salir"));

		switch (option) {
		case 1:
			String planetOption = JOptionPane.showInputDialog("Ingrese el nombre del planeta a mostrar: ");
			boolean flat = false;
			int count = 0;
			while (flat == false && count < planets.size()) {
				if (planets.get(count).getName().equalsIgnoreCase(planetOption)) {
					System.out.println("Planeta: " + planets.get(count).getName());
					System.out.println("Masa: " + planets.get(count).getMass());
					System.out.println("Densidad: " + planets.get(count).getDensity());
					System.out.println("Diametro: " + planets.get(count).getDiameter());
					System.out.println("Distancia al sol: " + planets.get(count).getDistanceToSun());
					System.out.println("# Satelites: " + planets.get(count).getSatelliteNumber());
					flat = true;
				} else {
					flat = false;
					count = count + 1;
				}
			}

			break;
		case 2:
			planet.showPlanet(planets);
			boolean flatplanet = false;
			do {

				System.out.println("Ingrese el n�mero para el primer planeta");
				int numplanet1 = input.nextInt();
				System.out.println("Ingrese el n�mero del segundo planeta");
				int numplanet2 = input.nextInt();

				if ((numplanet1 < 0 || numplanet1 > planets.size())
						|| (numplanet2 < 0 || numplanet2 > planets.size())) {
					System.out.println("Ingrese las posiciones v�lidas de los planetas");
					flatplanet = true;
				} else {
					Planet planet1 = planets.get(numplanet1 - 1);
					Planet planet2 = planets.get(numplanet2 - 1);

					System.out.println("La atracci�n gravitacional entre el planeta " + planet1.getName()
							+ " y el planeta " + planet2.getName() + " es: "
							+ planet.calculateGravitationalAttraction(planet1, planet2));
					flatplanet = false;
				}
			} while (flatplanet);
			break;
		case 3:
			System.out.println("Planetas:");
			for (int i = 0; i < planets.size(); i++) {
				System.out.println(planets.get(i).getName() + " - ");
			}
			break;

		default:
			break;
		}

	}

}
