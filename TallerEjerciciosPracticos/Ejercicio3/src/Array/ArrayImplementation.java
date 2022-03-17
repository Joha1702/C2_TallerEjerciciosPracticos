package Array;

import java.text.DecimalFormat;

/**
 * Esta clase se implementan los m�todos necesarios para tratar un array
 *
 * @version 1.0.0 2022-02-27
 *
 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
 *
 * @since versi�n 1
 */

public class ArrayImplementation {

	/**
	 * M�todo para generar un numero entre 2 y 10 que representar� el tama�o del vector a generar 
	 *
	 * @return n�mero entero entre 2 y 10.
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public int getArraySize() {
		return (int) (Math.random() * 10 + 1) + 2;
	}

	/**
	 * M�todo para generar un vector de con n�meros aleatorios.
	 *
	 * @param arraySize: tama�o del vector de tipo entero.
	 * @return array, retorna un vector generado con n�meros reales aleatorios entre -100 y 100.
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public double[] generateArray(int arraySize) {
		double[] array = new double[arraySize];
		int range = (100 - (-100)) + 1;
		for (int i = 0; i < arraySize; i++) {
			array[i] = (Math.random() * range) + (-100);
		}

		return array;

	}

	/**
	 * M�todo para mostrar un vector en consola.
	 *
	 * @param array: vector de tipo double
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public void showArray(double[] array) {
		DecimalFormat format = new DecimalFormat("0.00");
		for (int i = 0; i < array.length; i++) {

			System.out.println((i + 1) + ". " + format.format(array[i]));
		}
	}

	/**
	 * M�todo para ordenar un vector con el m�todo de la burbuja.
	 *
	 * @param array: vector de tipo double
	 * @return arrayCopy: vector ordenado
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public double[] orderBubbleMethod(double[] array) {
		double[] arrayCopy = array;
		double aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (arrayCopy[j] > arrayCopy[j + 1]) {
					aux = arrayCopy[j];
					arrayCopy[j] = arrayCopy[j + 1];
					arrayCopy[j + 1] = aux;
				}
			}

		}
		return arrayCopy;
	}

	/**
	 * M�todo para ordenar un vector mediante el m�todo quicksort
	 *
	 * @param array: vector de tipo double
	 *
	 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com
	 *
	 * @since version 1
	 *
	 */
	public void orderQuickSort(double[] array, int left, int right) {
		// double[] arrayCopy = array;
		double pivot = array[left];
		int i = left;
		int j = right;
		double aux;

		while (i < j) {
			while (array[i] <= pivot && i < j)
				i++;
			while (array[j] > pivot)
				j--;

			if (i < j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}

		}
		array[left] = array[j];
		array[j] = pivot;

		if (left < j - 1)
			orderQuickSort(array, left, j - 1);
		if (j + 1 < right)
			orderQuickSort(array, j + 1, right);

	}

}
