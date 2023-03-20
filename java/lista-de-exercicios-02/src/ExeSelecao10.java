/*
 * Ler três valores para os lados de um triângulo: A, B e C. Verificar se 
 * os lados fornecidos formam realmente um triângulo. Se formar, deve ser indicado o tipo de
 * triângulo: isósceles, escaleno ou equilátero. Para verificar se os lados fornecidos formam um
 * triângulo: A < B + C e B < A + C e C < A + B. Triângulo isósceles: possui dois lados iguais (A=B ou A=C ou B=C).
 * Triângulo escaleno: possui todos os lados diferentes (A<>B e B<>C e A<>C. Triângulo equilátero: possui todos os lados iguais (A=B e B=C).
 */

import java.util.Scanner;

public class ExeSelecao10 {

	public static void main(String[] args) {
		
		// instanciação e declaração
		Scanner entrada = new Scanner(System.in);
		String escaleno = "ESCALENO", isosceles = "ISÓSCELES", equilatero = "EQUILÁTERO";
		int ladoA, ladoB, ladoC;
		boolean validarTriangulo, validarEscaleno, validarIsosceles, validarEquilatero;
		
		// ENTRADA DE DADOS
		System.out.println("Digite os três lados do triângulo.");
		ladoA = entrada.nextInt();
		ladoB = entrada.nextInt();
		ladoC = entrada.nextInt();
		entrada.close();
		
		// PROCESSAMENTO
		
		// testar se os lados formam um triângulo
		validarTriangulo = (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
		
		// testar se o tipo do triângulo é ESCALENO
		validarEscaleno = (ladoA != ladoB) && (ladoB != ladoC) && (ladoA != ladoC);
		
		// testar se o tipo do triângulo é ISOSCELES
		validarIsosceles = (ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC);
		
		// testar se o tipo do triângulo é EQUILATERO
		validarEquilatero = (ladoA == ladoB) && (ladoB == ladoC);
		
		
		// saída
		if(!validarTriangulo) {
			System.out.println("Os lados NÃO formam um triângulo.");
		}
		else {
			if(validarEscaleno) {
				System.out.printf("Os lados formam um triângulo %s.", escaleno);
			}
			if(validarEquilatero) {
				System.out.printf("Os lados formam um triângulo %s.", equilatero);
			}
			else {
				if(validarIsosceles) {
					System.out.printf("Os lados formam um triângulo %s.", isosceles);
				}
			}
		}
		
		
	}
}
