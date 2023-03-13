/*
 * O mesmo do exercício 3 só que agora usando números do tipo float
 * com duas casas decimais depois da vírgula
 */

import java.util.Scanner;

public class Lista1_03_1 {

	public static void main(String[] args) {
		
		// referência ao objeto Scanner
		Scanner entradaTeclado = new Scanner(System.in);
		
		// declaração
		float numeroUm, numeroDois, numeroTres, numeroQuatro, media;
		
		// entrada
		System.out.println("Digite o primeiro número.");
		numeroUm = entradaTeclado.nextFloat();
		
		System.out.println("Digite o segundo número.");
		numeroDois = entradaTeclado.nextFloat();
		
		System.out.println("Digite o terceiro número.");
		numeroTres = entradaTeclado.nextFloat();
		
		System.out.println("Digite o quarto número.");
		numeroQuatro = entradaTeclado.nextFloat();
		
		// processamento
		media = (numeroUm + numeroDois + numeroTres + numeroQuatro) / 4;
		
		// saída
		System.out.printf("A média entre os números é %.2f", media);
		
		entradaTeclado.close();
	}
}
