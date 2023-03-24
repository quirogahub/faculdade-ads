/*
 * Escreva um algoritmo que receba um número inteiro positivo.
 * Fazer a multiplicação + a impressão do número recebido iniciando em 1 até chegar ao número
 * recebido (incluindo o número recebido). Parar o algoritmo quando o usuário digitar 0.
 */

import java.util.Scanner;

public class ExeRepeticao08 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int currentNumber = 1;
		
		
		while(currentNumber != 0) {
		
			System.out.println("Digite um número inteiro.");
			currentNumber = userInput.nextInt();
			
			for(int controller = 1; controller <= currentNumber; controller++) {
				System.out.printf("%d * %d = %d\n", controller, currentNumber, controller * currentNumber);
			} // fim for
		
		} // fim while
		System.out.println("Programa encerrado.");
		userInput.close();
		
	} // fim main
} // fim class
