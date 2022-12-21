package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		/*
		 * Programa que pide un número del 1 al 10 
		 * hasta que el usuario acierte el número definido en el programa
		 */
		//final int ACIERTO = 6;
		Random generador = new Random();
		int acierto = generador.nextInt(1, 10);
		
		Scanner teclado =new Scanner(System.in);
		System.out.println("Adivina un numero entre 1 y 10");
		int num=0;
		System.out.println("Introduce tu número (1-10)");
		num = teclado.nextInt();
		while (num!=acierto) {
			System.err.println("Has fallado, vuelve a intentarlo");
			System.out.println("Introduce tu número (1-10)");
			num = teclado.nextInt();
		}
		System.out.println("Has acertado");
		

	}

}
