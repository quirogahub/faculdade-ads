/*
 *	Construa um algoritmo que leia um número e o guarde em uma variável X.
 *	Calcule e mostre: (1) o conteúdo de X, (2) o quadrado de X, (3) o resto
 *	da divisão inteira de X por 3, (4) a metade de X e (5) o resultado do produto de X
 *	pela metade de X  
 */

// importar objeto Scanner
import java.util.Scanner;

public class Lista1_04 {

	public static void main(String[] args) {
		
		// referência
		Scanner entradaTeclado = new Scanner(System.in);
		
		// Declaração
		float X, metadeDeX, produtoDeXComSuaMetade;
		
		// entrada
		System.out.println("Digite um número inteiro.");
		X = entradaTeclado.nextInt();
		entradaTeclado.close();
		
		// processamento
		metadeDeX = X / 2;
		produtoDeXComSuaMetade = X * metadeDeX;
		
		// processamento e saída
		System.out.printf("O número é %f.%n", X);
		System.out.printf("O quadrado de %f é %f.%n", X, X * X);
		System.out.printf("O resto da divisão de %f por 3 é %f.%n", X, X % 3);
		System.out.printf("A metade de %f é %f.%n", X, metadeDeX);
		System.out.printf("O produto de %f com sua metade é %f.", X, produtoDeXComSuaMetade);
		
	}
	
}
