package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		/**
		 * Implementar el ejercicio 7 de la práctica 2, introduciendo un
		esquema do-while, de forma que el usuario decida cuando quiere salir
		   del programa.
		 */

		Scanner teclado = new Scanner(System.in);
		int opcion=0;
		do {
			
			System.out.println("=================================");
			System.out.println("1. Suma. ");
			System.out.println("2. resta. ");
			System.out.println("3. multiplicación");
			System.out.println("4. División");
			System.out.println("5. Raíz cuadrada del primer número.");
			System.out.println("6. Elevar el primer número al segundo");
			System.out.println("0. Salir");
			System.out.println("Introduce una opción (1-6)");
			opcion = teclado.nextInt();
			double num1=0,num2=0;
			if (opcion>=1 && opcion<=6) {
				System.out.println("Introduce el número 1: ");
				num1 = teclado.nextDouble();
				if (opcion!=5) {
					System.out.println("Introduce el número 2: ");
					num2 = teclado.nextDouble();
				}
				
			}
			
			
			switch(opcion) {
			case 0:break;
			case 1:
				System.out.printf("%.2f+%.2f=%.2f", num1, num2, num1+num2);
				break;
			case 2:
				System.out.printf("%.2f-%.2f=%.2f", num1, num2, num1-num2);
				break;
			case 3:
				System.out.printf("%.2f*%.2f=%.2f", num1, num2, num1*num2);
				break;
			case 4:
				System.out.printf("%.2f/%.2f=%.2f", num1, num2, num1/num2);
				break;
			case 5:
				System.out.printf("raíz cuadrada(%.2f)=%.2f", num1, 
						Math.sqrt(num1));
				break;
			case 6:
				System.out.printf("%.2f^%.2f=%.2f", num1, num2, 
						Math.pow(num1, num2));
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion!=0);
	}

}
