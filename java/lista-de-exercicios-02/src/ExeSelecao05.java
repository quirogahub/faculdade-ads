/*
 *   Construa um algoritmo para ler um valor, verificar se está no intervalo (100, 200) e mostrar essa informação.
 */

import java.util.Scanner;

public class ExeSelecao05 {

	public static void main(String[] args){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro.");
		int valor = entrada.nextInt();
		entrada.close();
		
		if(valor >= 100 && valor <= 200){
			System.out.printf("%d está no intervalo (100, 200).", valor);
		}
		else {
			System.out.printf("%d não está no intervalo (100, 200).", valor);
		}
		
		
	}
}
