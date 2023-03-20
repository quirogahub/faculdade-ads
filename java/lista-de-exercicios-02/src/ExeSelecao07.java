/*
 * Construa um programa para ler três valores e os mostrar em ordem crescente.
 */

import java.util.Scanner;

public class ExeSelecao07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros.");
		
		int valorUm = entrada.nextInt();
		int valorDois = entrada.nextInt();
		int valorTres = entrada.nextInt();
		
		String mensagem = "Números em ordem crescente:";
		
		entrada.close();
		
		if( valorUm < valorDois && valorUm < valorTres && valorDois < valorTres) {
			System.out.printf("%s %d, %d e %d.", mensagem, valorUm, valorDois, valorTres);
		}
		else {
			if( valorUm < valorDois && valorTres < valorDois && valorUm < valorTres ) {
				System.out.printf("%s %d, %d e %d.", mensagem, valorUm, valorTres, valorDois);
			}
			else {
				if( valorDois < valorUm && valorUm < valorTres && valorDois < valorTres) {
					System.out.printf("%s %d, %d e %d.", mensagem, valorDois, valorUm, valorTres);
				}
				else {
					if( valorDois < valorTres && valorTres < valorUm && valorDois < valorUm) {
						System.out.printf("%s %d, %d e %d.", mensagem, valorDois, valorTres, valorUm);
					}
					else {
						if( valorTres < valorUm && valorUm < valorDois && valorTres < valorDois) {
							System.out.printf("%s %d, %d e %d.", mensagem, valorTres, valorUm, valorDois);
						}
						else {
							System.out.printf("%s %d, %d e %d.", mensagem, valorTres, valorDois, valorUm);
						}
					}
				}
			}	
		}
	}
}
