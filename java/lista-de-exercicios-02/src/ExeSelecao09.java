/*
 * Escreva um algoritmo para ler o número de eleitores de um município, 
 * o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um
 * representa em relação ao total de eleitores.
 */

import java.util.Scanner;

public class ExeSelecao09 {

	public static void main(String[] args) {
		
		// instanciação
		Scanner entrada = new Scanner(System.in);
		
		// declaração
		int totalEleitores, votosBrancos, votosNulos, votosValidos;
		float porcentagemBrancos, porcentagemNulos, porcentagemValidos;
		
		// entrada de dados
		System.out.println("Digite o número de eleitores.");
		totalEleitores = entrada.nextInt();
		
		System.out.println("Digite o número de votos em branco.");
		votosBrancos = entrada.nextInt();
		
		System.out.println("Digite o número de votos nulos.");
		votosNulos = entrada.nextInt();
		
		System.out.println("Digite o número de votos válidos.");
		votosValidos = entrada.nextInt();
		
		// processamento
		porcentagemBrancos = ( ( (float)votosBrancos/(float)totalEleitores ) * 100f );
		porcentagemNulos = ( ( (float)votosNulos/(float)totalEleitores ) * 100f );
		porcentagemValidos = ( ( (float)votosValidos/(float)totalEleitores ) * 100f );
		
		// saída
		System.out.printf("Resultado:%n%.0f%% de votos brancos%n%.0f%% de votos nulos%n%.0f%% de votos válidos",
				porcentagemBrancos, porcentagemNulos, porcentagemValidos);
		
		entrada.close();
	}
}
