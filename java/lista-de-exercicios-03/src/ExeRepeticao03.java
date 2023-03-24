/*
 * Crie um programa em Java que receba do usuário um número inteiro
 * positivo e determine se ele é um “número perfeito”. Um número perfeito é aquele que é igual
 * à soma dos seus divisores, exceto dele mesmo (ou seja, 0 e 1 não são números perfeitos).
 */

import java.util.Scanner;

public class ExeRepeticao03 {

	public static void main(String[] args) {
		
		Scanner inputUser = new Scanner(System.in);
		
		int positiveInteger,
			loopCounter,
			sumOfDivisors = 0;
		
		// ENTRADA DE DADOS
		do {
			
			System.out.println("Digite um número inteiro positivo.");
			positiveInteger = inputUser.nextInt();
			
		} while (positiveInteger < 0);
		
		inputUser.close();
		
		// PROCESSAMENTO
		
		// encontrar os divisores
		for (loopCounter = positiveInteger; loopCounter >= 1; loopCounter--) {
			
			
			int division = positiveInteger % loopCounter;
			
			if (division == 0 && positiveInteger != loopCounter) {
				
				sumOfDivisors += loopCounter;			
			}
			
			
		}
		
		if (sumOfDivisors == positiveInteger) {
			
			System.out.println(positiveInteger + " é um número perfeito.");
		}
		else {
			
			System.out.println(positiveInteger + " NÃO é um número perfeito.");
		}
				
	} //fim main
	
} //fim class
