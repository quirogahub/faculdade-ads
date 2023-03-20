/*
	Construa um programa para ler um valor, verificar se é maior do que
	100 e mostrar essa informação.
 */

// importar objeto Scanner
import java.util.Scanner;

public class ExeSelecao01 {

	public static void main(String[] args) {
		
		// referência ao Scanner
		Scanner entrada = new Scanner(System.in);
		
		// declaração da variável valor
		int valor;
		
		// imprimir instrução para o usuário
		System.out.println("Digite um número inteiro no console.");
		
		// a variável valor recebe valor lido via teclado
		valor = entrada.nextInt();
		entrada.close();
		
		// testa se valor é maior que 100
		if (valor > 100) {
			System.out.println("O número lido é maior que 100.");
		}
		else {
			System.out.println("O número lido não é maior que 100");
		}						
		
	}
	
}