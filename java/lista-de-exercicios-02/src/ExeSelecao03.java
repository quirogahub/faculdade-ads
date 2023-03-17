/*
 *	 Construa um programa para ler dois valores e mostrar o maior deles.
 */

import java.util.Scanner;

public class ExeSelecao03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int valorUm, valorDois;
		
		System.out.println("Digite dois números inteiros.");
		valorUm = entrada.nextInt();
		valorDois = entrada.nextInt();
		
		if(valorUm > valorDois) {
			System.out.printf("%d é o maior dos números digitados.", valorUm);
		}
		else {
			System.out.printf("%d é o maior dos números digitados.", valorDois);
		}
	}
}
