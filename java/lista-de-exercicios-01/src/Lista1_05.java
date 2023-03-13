/*
 * Construa um algoritmo para ler o raio de um círculo, calcular a área deste círculo
 * e mostrar o resultado. 
 */

public class Lista1_05 {

	public static void main(String[] args) {
		
		// declaração
		float circleRadio, circleArea;
		
		// entrada
		circleRadio = 20;
		
		// processamento
		circleArea = (3.14f * (circleRadio * circleRadio));
		
		// saída
		System.out.printf("A área do círculo é %.2f", circleArea);
				
	}
	
}
