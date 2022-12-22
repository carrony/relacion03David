package ejercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que pida un número natural y determine si es primo o no.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que calcula si un numero es primo o no");
		System.out.println("Introduce el número a comprobar: ");
		int num = teclado.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i <= Math.sqrt(num) && primo; i++) {
			if (num%i == 0 ) {
				primo = false;
			} 
		}
		if (primo) {
			System.out.println("EL numero es primo");
		}
		else {
			System.out.println("EL numero NO es primo");
		}

	}

}
