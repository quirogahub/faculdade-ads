/*
 * Crie um programa em Java que receba do usuário dois números inteiros
 * positivos A e B (e garantindo que A < B), encontre e imprima os números divisíveis por 5 no
 * intervalo de números entre A e B (incluindo A e B) e a soma dos números encontrados.
 */

import java.util.Scanner;

public class ExeRepeticao02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroMenor,
			numeroMaior,
			numeroTemporario,
			soma = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Digite o primeiro número inteiro.");
		numeroMenor = entrada.nextInt();
		
		System.out.println("Digite o segundo número inteiro.");
		numeroMaior = entrada.nextInt();
		
		entrada.close();
		
		
		// PROCESSAMENTO
		if(numeroMenor > numeroMaior) {
			numeroTemporario = numeroMaior;
			numeroMaior = numeroMenor;
			numeroMenor = numeroTemporario;
		}
		
		while(numeroMaior != numeroMenor) {
			
			int divisaoPorCinco = numeroMaior % 5;
			
			if(divisaoPorCinco == 0) {
				
				System.out.println(numeroMaior);
				soma += numeroMaior;
			}
			
			numeroMaior--;
			
		}
		
		System.out.println("A soma dos números divisíveis por 5 é " + soma);
	}
	
}
