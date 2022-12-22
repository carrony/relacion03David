package ejercicios;

public class Ejercicio18 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Programa que muestra un reloj durante 24 horas en formato 
		 * 00:00:00 a 23:59:59
		 */

		do {
			for (int horas = 0; horas < 24; horas++) {
				for (int minutos = 0; minutos < 60; minutos++) {
					for (int segundos = 0; segundos < 60; segundos++) {
						System.out.printf("%02d:%02d:%02d", 
								horas,minutos, segundos);
						Thread.sleep(100);
						System.out.print("\b\b\b\b\b\b\b\b\b");
					}
				}
				
			}
		} while(true);
		
	}

}
