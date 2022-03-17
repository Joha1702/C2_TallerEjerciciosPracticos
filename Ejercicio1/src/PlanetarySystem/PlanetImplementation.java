package PlanetarySystem;

import java.util.ArrayList;

/**
 * Esta clase se utiliza para implementar los métodos declarados en la interfaz
 * IPlanet.
 * 
 *
 * @version 1.0.0 2022-02-19
 *
 * @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com.
 *
 * @since versión 1
 *
 */
public class PlanetImplementation implements IPlanet {

	/**
	 * Método para calcular la atracción gravitacional entre dos cuerpos.
	 *
	 * @param planet1: objeto de tipo Planet que representa un planeta
	 * @param planet2: objeto de tipo Planet que representa un planeta
	 * @return gravitationalAttraction: retorna el resultado de la atracción
	 *         gravitacional entre planet1 y planet2 de tipo double.
	 *
	 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	@Override
	public double calculateGravitationalAttraction(Planet planet1, Planet planet2) {

		double gravitationalConstant = 6.67 * Math.pow(10, -11);

		double distance = calculateDistanteBetweenPlanets(planet1.getDistanceToSun(), planet2.getDistanceToSun());

		double gravitationalAttraction = gravitationalConstant
				* ((planet1.getMass() * planet2.getMass()) / Math.pow(distance, 2));

		return gravitationalAttraction;

	}

	/**
	 * Método para inicializar el un arrayList de objetos tipo Planet, en este se
	 * crear la información de los 9 planetas del sistema solar.
	 *
	 * @return planets: retorna un listado con los objetos de tipo Planet
	 *
	 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	@Override
	public ArrayList<Planet> initPlanet() {

		ArrayList<Planet> planets = new ArrayList<Planet>();

		Planet planetMars = new Planet("Mars", 6.39 * Math.pow(10, 23), 3.93, 6779, 227.9, 2);
		planets.add(planetMars);

		Planet planetEarth = new Planet("Earth", 5.972 * Math.pow(10, 24), 5.51, 12742, 149.6, 1);
		planets.add(planetEarth);

		Planet planetMercury = new Planet("Mercury", 3.285 * Math.pow(10, 23), 5.53, 8879.4, 58, 0);
		planets.add(planetMercury);

		Planet planetVenus = new Planet("Venus", 4.867 * Math.pow(10, 24), 5.24, 12104, 108, 0);
		planets.add(planetVenus);

		Planet planetJupiter = new Planet("Jupiter", 1.898 * Math.pow(10, 27), 1.33, 139820, 750, 16);
		planets.add(planetJupiter);

		Planet planetSaturn = new Planet("Saturn", 5.683 * Math.pow(10, 26), 6.87, 116460, 1418, 17);
		planets.add(planetSaturn);

		Planet planetUranus = new Planet("Uranus", 8.681 * Math.pow(10, 25), 1.27, 50724, 3000, 5);
		planets.add(planetUranus);

		Planet planetNeptune = new Planet("Neptune", 1.024E26, 1.64, 49244, 4500, 2);
		planets.add(planetNeptune);

		Planet planetPluto = new Planet("Pluto", 1.25E22, 1.88, 2376.6, 5906, 2);
		planets.add(planetPluto);

		return planets;
	}

	/**
	 * Método para calcular la distancia entre dos planetas
	 *
	 * @param distancePlanet1: distancia al sol de un planeta
	 * @param distancePlanet2: distancia al sol de un planeta
	 * @return retorna el valor absoluto de la diferencia entre la distancia al sol
	 *         de planet1 y planet2.
	 *
	 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	@Override
	public double calculateDistanteBetweenPlanets(double distancePlanet1, double distancePlanet2) {

		return Math.abs(distancePlanet1 - distancePlanet2);
	}

	/**
	 * Método para mostrar un listado objetos de tipo Planet
	 *
	 * @param planets: ArrayList de objetos de tipo Planet
	 *
	 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	@Override
	public void showPlanet(ArrayList<Planet> planets) {

		for (int i = 0; i < planets.size(); i++) {
			System.out.println((i + 1) + "." + planets.get(i).getName());
		}

	}

}
