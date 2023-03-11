/*
 * Construa um algoritmo que leia (via teclado) três números do tipo inteiro,
 * calcule e mostre a soma entre eles.
 */

// Importar biblioteca
import java.util.Scanner;

public class Lista1_02 {

	public static void main(String[] args) {
		
		// referência de objeto
		Scanner entradaDoUsuario = new Scanner(System.in);
		
		// declaração de variáveis
		int primeiroNumero, segundoNumero, terceiroNumero, soma;
		
		// entrada
		System.out.println("Digite o primeiro número inteiro.");
		primeiroNumero = entradaDoUsuario.nextInt();
		
		System.out.println("Digite o segundo número inteiro.");
		segundoNumero = entradaDoUsuario.nextInt();
		
		System.out.println("Digite o terceiro número inteiro.");
		terceiroNumero = entradaDoUsuario.nextInt();
		entradaDoUsuario.close();
		
		// processamento
		soma = primeiroNumero + segundoNumero + terceiroNumero;
		
		// saída
		System.out.printf("A soma dos números é %d.", soma);
		
	}
	
}
