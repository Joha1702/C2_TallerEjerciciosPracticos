package PlanetarySystem;

import java.util.ArrayList;

/**
 * Esta Interfaz se utiliza para declarar los metodos que se pueden utilizar en un objeto tipo Planeta
 * 
 * @version 1.0.0 2022-02-19
 *
 * @author Leidy Johana Moreno Lopez - leidymoreno17@gmail.com.
 *
 * @since versión 1
 *
 */
public interface IPlanet {
	
	public double calculateGravitationalAttraction(Planet planet1, Planet planet2);
	public ArrayList<Planet> initPlanet();
	public double calculateDistanteBetweenPlanets(double distancePlanet1, double distancePlanet2);
	public void showPlanet(ArrayList<Planet> planets);

}
