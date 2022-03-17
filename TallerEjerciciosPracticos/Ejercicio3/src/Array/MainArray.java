package Array;

import java.util.Scanner;

/**
 * Esta clase es la principal del proyecto y en ella se implementa la interacc�n
 * con el usuario donde se le muestra el array generado de forma automatica y se le da la opci�n de 
 * ordenarlo por el m�todo burbuja o m�todo quicksort
 *
 * @version 1.0.0 2022-02-27
 *
 * @author Leidy Johana Moreno L�pez - leidymoreno17@gmail.com.
 *
 * @since versi�n 1
 */
public class MainArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayImplementation arrayL = new ArrayImplementation();
		int size = arrayL.getArraySize();

		double[] arrayExample = arrayL.generateArray(size);
		arrayL.showArray(arrayExample);
		System.out.println();
		
		System.out.println("Elija la opci�n de ordenamiento: \n"
				+ "1. M�todo Burbuja\n"
				+ "2. M�todo QuickSort \n"
				+ "3. Terminar \n");
		int option = input.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Array ordenado mediante m�todo Burbuja: \n");
			double[] ordererArray = arrayL.orderBubbleMethod(arrayExample);
			arrayL.showArray(ordererArray);
			break;
		case 2:
			System.out.println("Array ordenado mediante m�todo QuickSort: \n");
			arrayL.orderQuickSort(arrayExample, 0, arrayExample.length - 1);
			arrayL.showArray(arrayExample);
			break;

		default:
			break;
		}
		input.close();
	}
}
