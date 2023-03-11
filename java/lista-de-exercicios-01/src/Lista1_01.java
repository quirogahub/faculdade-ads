/* Construa um algoritmo que leia (via teclado) dois números
* do tipo inteiro, calcule o produto entre eles e mostre o resultado.
*/

import java.util.Scanner;

public class Lista1_01 {

	public static void main(String[] args) {
		
		// Declaração
		Scanner entrada = new Scanner(System.in);
		int primeiroNumero, segundoNumero, produto;
		
		// Entrada
		System.out.println("Digite o primeiro número:");
		primeiroNumero = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		segundoNumero = entrada.nextInt();
		
		// Processamento
		produto = primeiroNumero * segundoNumero;
		
		// Saída
		System.out.printf("O produto de %d e %d é %d.", primeiroNumero, segundoNumero, produto);
		
		entrada.close();
		
	}
	
}
