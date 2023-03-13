/*
 * Construa um algoritmo para ler (via teclado) quatro números do tipo inteiro,
 * calcular e mostrar a média aritmética entre eles.
 */

// importar objeto Scanner 
import java.util.Scanner;

public class Lista1_03 {

	
	public static void main(String[] args) {
		
		// referência ao objeto Scanner
		Scanner entradaTeclado = new Scanner(System.in);
		
		// declaração
		int numeroUm, numeroDois, numeroTres, numeroQuatro, media;
		
		// entrada
		System.out.println("Digite o primeiro número.");
		numeroUm = entradaTeclado.nextInt();
		
		System.out.println("Digite o segundo número.");
		numeroDois = entradaTeclado.nextInt();
		
		System.out.println("Digite o terceiro número.");
		numeroTres = entradaTeclado.nextInt();
		
		System.out.println("Digite o quarto número.");
		numeroQuatro = entradaTeclado.nextInt();
		entradaTeclado.close();
		
		// processamento
		media = (numeroUm + numeroDois + numeroTres + numeroQuatro) / 4;
		
		// saída
		System.out.printf("A média entre os números é %d.", media);
		
		
	}
	
}
