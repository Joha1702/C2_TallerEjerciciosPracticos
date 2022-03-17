package Array;

import java.util.Scanner;

/**
 * Esta clase es la principal del proyecto y en ella se implementa la interaccón
 * con el usuario donde se le muestra el array generado de forma automatica y se le da la opción de 
 * ordenarlo por el método burbuja o método quicksort
 *
 * @version 1.0.0 2022-02-27
 *
 * @author Leidy Johana Moreno López - leidymoreno17@gmail.com.
 *
 * @since versión 1
 */
public class MainArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayImplementation arrayL = new ArrayImplementation();
		int size = arrayL.getArraySize();

		double[] arrayExample = arrayL.generateArray(size);
		arrayL.showArray(arrayExample);
		System.out.println();
		
		System.out.println("Elija la opción de ordenamiento: \n"
				+ "1. Método Burbuja\n"
				+ "2. Método QuickSort \n"
				+ "3. Terminar \n");
		int option = input.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Array ordenado mediante método Burbuja: \n");
			double[] ordererArray = arrayL.orderBubbleMethod(arrayExample);
			arrayL.showArray(ordererArray);
			break;
		case 2:
			System.out.println("Array ordenado mediante método QuickSort: \n");
			arrayL.orderQuickSort(arrayExample, 0, arrayExample.length - 1);
			arrayL.showArray(arrayExample);
			break;

		default:
			break;
		}
		input.close();
	}
}
