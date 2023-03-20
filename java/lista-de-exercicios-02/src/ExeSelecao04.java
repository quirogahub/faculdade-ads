/*
 * Construa um programa para ler dois valores e mostrar o menor deles.
 */

// importar Scanner
import java.util.Scanner;

public class ExeSelecao04 {

	public static void main(String[] args) {
		
		// refrência ao Scanner
		Scanner entrada = new Scanner(System.in);
		// declaração
		int valorUm, valorDois;
		
		System.out.println("Digite dois números inteiros.");
		valorUm = entrada.nextInt();
		valorDois = entrada.nextInt();
		
		entrada.close();
		
		if(valorUm < valorDois){
			System.out.printf("%d é o menor dos números digitados.", valorUm);
		}
		else{
			System.out.printf("%d é o menor dos números digitados.", valorDois);
		}
		
	}
	
}
