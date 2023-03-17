/*
 *    Construa um programa para ler um valor, verificar se é par ou ímpar
 *    e mostrar essa informação.
 */

// importar objeto Scanner
import java.util.Scanner;

public class ExeSelecao02 {

	public static void main(String[] args) {
		
		// referência ao objeto Scanner
		Scanner entrada = new Scanner(System.in);
		
		// declaração das variáveis valor e resto
		int valor, resto;
		
		// instrução para digitar número e atribuir entrada à variável valor
		System.out.println("Digite um número inteiro.");
		valor = entrada.nextInt();
		
		// calcula o módulo do valor
		resto = valor % 2;
		
		// testa se o resto da divisão do valor por 2 é 0
		if (resto == 0) {
			System.out.println("O valor lido é par.");
		}
		else {
			System.out.println("O valor lido é ímpar.");
		}
	}
	
}
