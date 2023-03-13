/*
 * Construa um programa para ler 3 valores os quais correspondem ao número de
 * convidados para um churrasco, sendo homens, mulheres e crianças. Sabendo que, em média,
 * um homem come 650 gramas de carne, uma mulher come 420 gramas de carne, e uma criança
 * come 290 gramas de carne, calcule a quantidade de carne necessária para o churrasco em
 * quilogramas e mostre o resultado.
 */

public class Lista1_09 {
	
	public static void main(String[] args) {

		// Declaração
		int homem, mulher, crianca;
		float quantidadeDeCarneEmKg;
		
		// Entrada
		homem = 6;
		mulher = 11;
		crianca = 4;
		
		// Processamento
		quantidadeDeCarneEmKg = (float) (((homem * 650) + (mulher * 420) + (crianca * 290)) / 1000);
		
		// Saída
		System.out.printf("Para %d homens, %d mulheres e %d crianças serão necessários %.1f Kg de carne.", 
				homem, mulher, crianca, quantidadeDeCarneEmKg);
	}	
}
