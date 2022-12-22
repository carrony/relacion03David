package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		/*
		 * 14. Algoritmo que pida el alto y el ancho de un rectángulo (números 
		 * enteros) e imprima un rectángulo de asteriscos. Por ejemplo, si
		 *  introducen 7 de ancho y 4 de alto el resultado será:
		 *  *******
		 *  *     *
		 *  *     *
		 *  *******
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que escribe rectángulos de asteriscos");
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
	  	
		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				if (i==1 || i==alto || j==1 || j== ancho) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
//		for (int i = 1; i <= alto; i++) {
//			if (i == 1 || i==alto) {
//				for (int j = 1; j <= ancho; j++) {
//					System.out.print("*");
//				}
//			} else {
//				System.out.print("*");
//				for (int j=2; j<ancho;j++) {
//					System.out.print(" ");
//				}
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

	}

}
