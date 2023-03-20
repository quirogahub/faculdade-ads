/*
 * Construa um programa para ler três valores e os mostrar em ordem decrescente.
 */

import java.util.Scanner;

public class ExeSelecao08 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String mensagem = "Números em ordem decrescente:";
		int valorUm, valorDois, valorTres;
	
		System.out.println("Digite três números inteiros.");
	
		valorUm = entrada.nextInt();
		valorDois = entrada.nextInt();
		valorTres = entrada.nextInt();
		
		entrada.close();
		
		if(valorUm > valorDois && valorUm > valorTres && valorDois > valorTres) {
			System.out.printf("%s %d, %d e %d.", mensagem, valorUm, valorDois, valorTres);
		}
		else {
			if(valorUm > valorDois && valorUm > valorTres && valorTres > valorDois) {
				System.out.printf("%s %d, %d e %d.", mensagem, valorUm, valorTres, valorDois);
			}
			else {
				if(valorDois > valorUm && valorDois > valorTres && valorUm > valorTres) {
					System.out.printf("%s %d, %d e %d.", mensagem, valorDois, valorUm, valorTres);
				}
				else {
					if(valorDois > valorUm && valorDois > valorTres && valorTres > valorUm) {
						System.out.printf("%s %d, %d e %d.", mensagem, valorDois, valorTres, valorUm);
					}
					else {
						if(valorTres > valorUm && valorTres > valorDois && valorUm > valorDois) {
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
