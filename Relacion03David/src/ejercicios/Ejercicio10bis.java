package ejercicios;

public class Ejercicio10bis {

	public static void main(String[] args) {
		/* 
		 * Programa que escribe las tablas de multiplicar del 1 al 10
		 */
		
		System.out.println("TAblas de multiplicar");
		int tabla=0;
		int num=1;
		for (int i = 0; i < 100; i++) {
			if ( i%10==0) {
				tabla++;
				System.out.println("TAbla del "+tabla);
				num=1;
			}
			System.out.printf("%d x %d = %d\n", tabla,num, tabla*num);
			num++;
		}

	}

}
