package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio13bis {

	public static void main(String[] args) {
		/*
		 * 13. Algoritmo que pida el alto y el ancho de un rectángulo (números 
		 * enteros) e imprima un rectángulo de asteriscos. Por ejemplo, si
		 *  introducen 7 de ancho y 4 de alto el resultado será:
		 *  *******
		 *  *******
		 *  *******
		 *  *******
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que escribe rectángulos de asteriscos");
		System.out.println("Introduce el ancho:");
		int ancho = teclado.nextInt();
		System.out.println("Introduce el alto:");
		int alto = teclado.nextInt();
		
		for (int i = 0; i < alto*ancho; i++) {
			if (i%ancho==0) {
				System.out.println();
			}
			System.out.print("*");
			
		}
		
		

	}

}
