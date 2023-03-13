/*
 * Construa um algoritmo para ler uma temperatura em graus Fahrenheit, calcular
 * e mostrar o valor correspondente em graus Celsius sabendo que TempCelsius = 5 *
 * (TempFahrenheit - 32) / 9
 */

public class Lista1_06 {

	public static void main(String[] args) {
		
		// declaração
		float temperaturaFahrenheit, temperaturaCelsius;
		
		// entrada
		temperaturaFahrenheit = 45.8f;
		
		// processamento
		temperaturaCelsius = (float) ((temperaturaFahrenheit - 32) * 5 / 9);
		
		// saída
		System.out.printf("%.1f graus Fahrenheit é igual a %.1f graus Celsius.",
				temperaturaFahrenheit, temperaturaCelsius);				
	}
	
	
}
