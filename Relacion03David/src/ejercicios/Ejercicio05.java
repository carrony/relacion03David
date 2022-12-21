package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que sume los n primeros números enteros, 
		 * siendo n un número introducido por el usuario. 1+2+3+...+n
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.println("Programa que suma los primero números naturales");
		int num;
//		do {
//			System.out.println("Introduce un número positivo: ");
//			num = teclado.nextInt();
//		} while (num<0);
		
		System.out.println("Introduce un número positivo: ");
		num = teclado.nextInt();
		while(num<0) {
			System.out.println("TE HE DICHO POSITIVO");
			System.out.println("Introduce un número positivo: ");
			num = teclado.nextInt();
		}
		
		
		int suma=0;
		for (int i = 1; i <= num; i++) {
			suma = suma+i;
		}
		System.out.println("La suma es "+suma);
	}

}
