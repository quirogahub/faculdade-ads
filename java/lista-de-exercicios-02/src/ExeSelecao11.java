/*
 * Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se 
 * forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
 * Escreva um algoritmo que leia o número de laranjas compradas, calcule e escreva o valor total
 * da compra. Implementar uma validação da quantidade de frutas a serem compradas para
 * evitar que seja lido um número de laranjas menor (negativo) ou igual a zero.
 */

import java.util.Scanner;

public class ExeSelecao11 {

	public static void main(String[] args) {
		
		// instanciação do Scanner
		Scanner entrada = new Scanner(System.in);
		
		// instanciação e declaração de Strings
		String mensagemPadrao = " unidade(s) de laranja a R$ 0,30 a unidade = R$ ",
			   mensagemComDesconto = " unidade(s) de laranja a R$ 0,25 a unidade = R$ ",
			   mensagemHeaderCompra = "--- Valor da Compra ---",
			   mensagemNenhumItem = "Nenhum item está sendo comprado.";
		
		// variáveis de processamento
		int unidadesCompradas;
		double precoPadrao, precoComDesconto, calculoPadrao = 0.3f, calculoComDesconto = 0.25f;
		boolean validarUnidades;
		
		// ENTRADA DE DADO
		System.out.println("Digite o número de laranjas a serem compradas.");
		unidadesCompradas = entrada.nextInt();
		entrada.close();
		
		// PROCESSAMENTO
		validarUnidades = unidadesCompradas > 0;
		precoPadrao = calculoPadrao * unidadesCompradas;
		precoComDesconto = calculoComDesconto * unidadesCompradas;
		
		// SAÍDA
		if(validarUnidades) {
			if(unidadesCompradas < 12) {
				System.out.printf("%s\n%d%s%.2f", mensagemHeaderCompra, unidadesCompradas, mensagemPadrao, precoPadrao);
			}
			else {
				System.out.printf("%s\n%d%s%.2f", mensagemHeaderCompra, unidadesCompradas, mensagemComDesconto, precoComDesconto);
			}
		}
		else {
			System.out.println(mensagemNenhumItem);
		}
		
	}
}
