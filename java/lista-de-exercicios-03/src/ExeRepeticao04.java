/*
 * Ler uma quantidade indeterminada de duplas de valores (2 valores de cada vez).
 * Escrever para cada dupla lida uma mensagem que indique se ela foi informada em
 * ordem crescente ou decrescente. A repetição será encerrada ao ser fornecido valores iguais
 * para os elementos da dupla.
 */

import java.util.Scanner;

public class ExeRepeticao04 {

	
	public static void main(String[] args) {
		
		
		Scanner userInput = new Scanner(System.in);
		
		int firstNumber, secondNumber;
		
		String ascendingOrderMessage = "Você informou os números em ordem crescente.",
			   descendingOrderMessage = "Você informou os números em ordem decrescente.";
		
		do {
			
			
			System.out.println("Digite dois valores inteiros.");
			firstNumber = userInput.nextInt();
			secondNumber = userInput.nextInt();
			
			if (firstNumber < secondNumber) {
				
				System.out.println(ascendingOrderMessage);
			}
			else {
				
				
				if (firstNumber == secondNumber) {
					System.out.println("Os números são iguais. Fim.");
				}
				else {
					System.out.println(descendingOrderMessage);
				}
				
			}
			
			
		} while (firstNumber != secondNumber);
		
		userInput.close();
	}
}
