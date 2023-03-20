/*
 * Construa um programa para ler três valores que representam três segmentos de reta.
 * Verificar se com esses segmentos é possível compor um triângulo e
 * mostrar uma mensagem dizendo se é ou não possível.
 */

// importar Scanner
import java.util.Scanner;

public class ExeSelecao06 {

	public static void main(String[] args) {
		
		// referenciar Scanner
		Scanner entrada = new Scanner(System.in);
		
		// declaração de variáveis
		int valorUm, valorDois, valorTres;
		
		// imprimir CTA
		System.out.println("Digite os três lados do triângulo.");
		
		// armazenar inputs
		valorUm = entrada.nextInt();
		valorDois = entrada.nextInt();
		valorTres = entrada.nextInt();
		
		// encerrar scanner
		entrada.close();
		
		// testar valores
		if ( (valorUm < (valorDois + valorTres)) && (valorDois < (valorUm + valorTres)) && (valorTres < (valorUm + valorDois)) ) {
			System.out.println("Os lados formam um triângulo.");
		}
		else {
			System.out.println("Os lados não formam um triângulo.");
		}
	}
}
