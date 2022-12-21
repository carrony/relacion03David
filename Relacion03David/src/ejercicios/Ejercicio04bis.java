package ejercicios;

import java.util.Scanner;

public class Ejercicio04bis {

	public static void main(String[] args) {
		// Algoritmo que escriba los números impares comprendidos 
		//entre dos enteros introducidos por el usuario.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que muestra los impares entre dos números.");
		System.out.println("Introduce el primero: ");
		int num1 = teclado.nextInt();
		System.out.println("Introduce el segundo: ");
		int num2 = teclado.nextInt();
		
		// suponemos que el menor es el num1
		int menor= num1, mayor = num2;
		if (num1>num2) {
			// si el menor es el num2 lo cambiamos
			menor=num2;
			mayor=num1;
		}
		
//		int menor = Math.min(menor, mayor);
//		int mayor = Math.max(menor, mayor);
		
		for (int i = menor; i <=mayor; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
