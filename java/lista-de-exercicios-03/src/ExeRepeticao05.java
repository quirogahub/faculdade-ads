/*
 * Escreva um programa em Java que receba um número e faça a tabuada
 * desse número de 1 a 10. Parar o algoritmo quando o usuário digitar um número negativo.
 */

import java.util.Scanner;

public class ExeRepeticao05 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int positiveNumber;
	
		do {
			
			System.out.println("Digite um número inteiro.");
			positiveNumber = userInput.nextInt();
			
			for (int contador = 1; contador <= 10; contador++) {
				System.out.printf("%d x %d = %d\n", positiveNumber, contador, contador * positiveNumber);
			}
			
		} while (positiveNumber >= 0);
			
		userInput.close();
		System.out.println("Número negativo. Programa encerrado.");
		
	}	
}
