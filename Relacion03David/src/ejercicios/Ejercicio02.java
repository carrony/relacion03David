package ejercicios;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		/*
		 * Algoritmo que imprima la tabla de multiplicar de un número pasado
		 * como parámetro con bucle while
		 */
		int tabla=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("¿que tabla de multiplicar quieres (1-10)?");
			tabla = teclado.nextInt();
		}while(tabla<1 || tabla >10);
		
		
		//for (int i = 0; i <=10 ; i++) {
		int i = 0;
		while (i<=10) {
			System.out.printf("%d x %d = %d\n",tabla, i, tabla*i );
			i++;
		}

	}

}
