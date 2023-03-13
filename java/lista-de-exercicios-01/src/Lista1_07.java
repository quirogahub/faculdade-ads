/*
 * Construa um algoritmo que leia um comprimento em polegadas, calcule e
 * mostre o comprimento correspondente em milímetros, considerando que 1 polegada
 * equivale a 25,4 milímetros. 
 */

public class Lista1_07 {

	public static void main(String[] args) {
		
		// declaração
		float comprimentoPolegadas, comprimentoMilimetros;
		
		// entrada
		comprimentoPolegadas = 84.7f;
		
		// processamento
		comprimentoMilimetros = (float) (comprimentoPolegadas * 25.4);
		
		// saída
		System.out.printf("%.1f polegadas é igual a %.1f milímetros.",
				comprimentoPolegadas, comprimentoMilimetros);
	}
	
}
