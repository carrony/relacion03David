package ejercicios;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		/**
		 * Pide 10 números por teclado y calcular cuantos son negativos, 
		 * positivos o cero
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que cuenta el numero de positivos, "
				+ "negativos o cero de 10 números introducidos por teclado.");
		
		int positivos =0, negativos = 0, ceros =0;
		int num;
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("Introduce el numero %d", i);
			num = teclado.nextInt();
			
			if (num == 0 ) {
				ceros++;
 			} else if (num<0 ) {
 				negativos++;
 			} else {
 				positivos++;
 			}
		}
		
		System.out.printf("Hay %d ceros, %d números positivos y %d "
				+ "números negativos", ceros, positivos, negativos);
		
	}

}
