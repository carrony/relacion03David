package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		/**
		 * Algoritmo que cuente cuántos múltiplos de 7 hay entre dos enteros dados por
		 * el usuario.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuenta de múltiplos entre dos números\n");
		System.out.println("Introduce el primero");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo");
		int num2 = teclado.nextInt();

		int menor = num1, mayor = num2;
		if (num2 < num1) {
			menor = num2;
			mayor = num1;
		}

		int contador = 0;
		

		while (menor <= mayor) {
			if (menor % 7 == 0) {
				contador++;
			}
			menor++;
		}

		System.out.printf("Hay %d múltiplos de 7", contador);

	}

}
