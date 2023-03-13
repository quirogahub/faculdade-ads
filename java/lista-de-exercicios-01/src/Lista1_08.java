/*
 *  Construa um programa que leia as horas, minutos e segundos em determinado
 *	momento do dia, calcule e mostre qual o total de segundos decorridos neste dia.
 */

public class Lista1_08 {

	public static void main(String[] args) {

		// declaração
		int horas, minutos, segundos, totalSegundos;
		
		// entrada
		horas = 16;
		minutos = 30;
		segundos = 54;
		
		// processamento
		totalSegundos = ((horas * 60 * 60) + (minutos * 60) + segundos);
		
		// saída
		System.out.printf("Às %d:%d:%d terá passado %d segundos no dia.", 
				horas, minutos, segundos, totalSegundos);
	}
}
