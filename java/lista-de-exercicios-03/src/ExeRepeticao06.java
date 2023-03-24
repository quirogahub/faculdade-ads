/*
 * Escreva um algoritmo para imprimir os 50 primeiros números primos maior que 100.
 * Obs.: Número primo é aquele divisível somente por 1 e ele mesmo.
 */

public class ExeRepeticao06 {
	
	public static void main(String[] args) {
		
		int fiftyPrimeNumbers = 0,
			currentNumber = 100,
			division;
		
		while (fiftyPrimeNumbers <= 50) {
			
			// ESCOPO PARA CONTAR DIVISORES, VERIFICAR SE É PRIMO E IMPRIMIR

				int dividers = 0;
			
			for (int divider = currentNumber; divider >= 1; divider--) {
				division = currentNumber % divider;
				
				if (division == 0) {
					dividers++;
				} // fim if
				
			} // fim for
			
			if(dividers == 2) {
				System.out.println(currentNumber);
				fiftyPrimeNumbers++;
			}
			
			currentNumber++;
		
		} // fim while
		

	} //
}
