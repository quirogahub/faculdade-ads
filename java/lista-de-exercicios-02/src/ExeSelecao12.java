/*
 * Produtos em uma mercearia possuem preços variados de acordo com 
 * o tipo de produto e a quantidade a ser comprada. Implemente um programa que apresente a
 * lista de produtos disponíveis juntamente com seus preços e solicite ao usuário que escolha (1)
 * o produto a ser comprado e (2) a quantidade escolhida do produto e informe o valor da
 * compra. Os produtos e seus preços são: banana (R$ 0,30 se forem compradas menos do que
 * uma dúzia, e R$ 0,25 se forem compradas pelo menos doze), laranja (R$ 0,40 se forem
 * compradas menos do que uma dúzia, e R$ 0,35 se forem compradas pelo menos doze), maçã
 * (R$ 0,50 se forem compradas menos do que uma dúzia, e R$ 0,45 se forem compradas pelo
 * menos doze), kiwi (R$ 0,40 se forem compradas menos do que uma dúzia, e R$ 0,30 se forem
 * compradas pelo menos doze).
 */

import java.util.Scanner;

public class ExeSelecao12 {
	
	public static void main(String[] args) {
		
		// instanciação do Scanner
		Scanner entrada = new Scanner(System.in);
		
		// preços granel
		double precoBananaGranel = 0.3f,
			   precoLaranjaGranel = 0.4f,
			   precoMacaGranel = 0.5f,
			   precoKiwiGranel = 0.4f;
		
		// preços com desconto
		double precoBananaDesconto = 0.25f,
			   precoLaranjaDesconto = 0.35f,
			   precoMacaDesconto = 0.45f,
			   precoKiwiDesconto = 0.3f;		
		
		// nomes para item selecionado
		String banana = "banana",
			   laranja = "laranja",
			   maca = "maçã",
			   kiwi = "kiwi";
		
		// selecao do menu
		int selecaoMenu;
		
		
		// Exibir menu
		System.out.printf("%s\n\n"
				+ "1. Banana -> R$ 0,30 \"preço granel\" ou R$ 0,25 \"preço dúzia ou mais\"\n"
				+ "2. Laranja -> R$ 0,40 \"preço granel\" ou R$ 0,35 \"preço dúzia ou mais\"\n"
				+ "3. Maçã -> R$ 0,50 \"preço granel\" ou R$ 0,45 \"preço dúzia ou mais\"\n"
				+ "4. Kiwi -> R$ 0,40 \"preço granel\" ou R$ 0,30 \"preço dúzia ou mais\"\n"
				+ "\n%s",
				"------ Lista de Produtos e Preços ------",
				"Escolha o produto desejado ou digite -1 para sair.\n");

		// ler resposta do usuário
		selecaoMenu = entrada.nextInt();
		
		// validar entrada do usuário
		if(selecaoMenu > 0 && selecaoMenu <= 4) {
			
			// variáveis para calcular o preço final
			double total, multiplicador;
			int unidadesSelecionadas;
			String fruta;
			
			// string com o header da mensagem de valor da compra
			String mensagemHeaderTotal = "------ Valor da Compra ------";
			
			switch(selecaoMenu) {
				
				case 1:
					// atribuir fruta
					fruta = "banana";
					
					// perguntar quantas unidades deseja comprar
					System.out.printf("Escolha a quantidade de %s desejada.\n", fruta);
					unidadesSelecionadas = entrada.nextInt();
					
					// processamento do preço final
					if(unidadesSelecionadas > 0) {
						
						if(unidadesSelecionadas < 12) {
							multiplicador = 0.3f;
							total = multiplicador * unidadesSelecionadas;
						}
						else {
							multiplicador = 0.25f;
							total = multiplicador * unidadesSelecionadas;
						}
						
						System.out.printf("%s\n%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f",
								mensagemHeaderTotal, unidadesSelecionadas, fruta, multiplicador, total);
					}
					else {
						System.out.println("Nenhum item está sendo comprado.");
					}
					
					break;
				
				case 2:
					// atribuir fruta
					fruta = "laranja";
					
					// perguntar quantas unidades deseja comprar
					System.out.printf("Escolha a quantidade de %s desejada.\n", fruta);
					unidadesSelecionadas = entrada.nextInt();
					
					// processamento do preço final
					if(unidadesSelecionadas > 0) {
						
						if(unidadesSelecionadas < 12) {
							multiplicador = 0.4f;
							total = multiplicador * unidadesSelecionadas;
						}
						else {
							multiplicador = 0.35f;
							total = multiplicador * unidadesSelecionadas;
						}
						
						System.out.printf("%s\n%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f",
								mensagemHeaderTotal, unidadesSelecionadas, fruta, multiplicador, total);
					}
					else {
						System.out.println("Nenhum item está sendo comprado.");
					}
					
					break;
					
				case 3:
					// atribuir fruta
					fruta = "maçã";
					
					// perguntar quantas unidades deseja comprar
					System.out.printf("Escolha a quantidade de %s desejada.\n", fruta);
					unidadesSelecionadas = entrada.nextInt();
					
					// processamento do preço final
					if(unidadesSelecionadas > 0) {
						
						if(unidadesSelecionadas < 12) {
							multiplicador = 0.5f;
							total = multiplicador * unidadesSelecionadas;
						}
						else {
							multiplicador = 0.45f;
							total = multiplicador * unidadesSelecionadas;
						}
						
						System.out.printf("%s\n%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f",
								mensagemHeaderTotal, unidadesSelecionadas, fruta, multiplicador, total);
					}
					else {
						System.out.println("Nenhum item está sendo comprado.");
					}
					
					break;
					
				case 4:
					// atribuir fruta
					fruta = "kiwi";
					
					// perguntar quantas unidades deseja comprar
					System.out.printf("Escolha a quantidade de %s desejada.\n", fruta);
					unidadesSelecionadas = entrada.nextInt();
					
					// processamento do preço final
					if(unidadesSelecionadas > 0) {
						
						if(unidadesSelecionadas < 12) {
							multiplicador = 0.4f;
							total = multiplicador * unidadesSelecionadas;
						}
						else {
							multiplicador = 0.3f;
							total = multiplicador * unidadesSelecionadas;
						}
						
						System.out.printf("%s\n%d unidade(s) de %s a R$ %.2f a unidade = R$ %.2f",
								mensagemHeaderTotal, unidadesSelecionadas, fruta, multiplicador, total);
					}
					else {
						System.out.println("Nenhum item está sendo comprado.");
					}
					
					break;
					
				default:
					break;
					
			} // fim switch
		} // fim if validar entrada do usuário
		else {
			if(selecaoMenu == -1) {
				System.out.println("Você encerrou o programa.");
			}
			else {
				System.out.println("Programa finalizado por input inesperado.");
			}
		} // fim else de validar entrada do usuário
		
			   
	} // fim main 

} // fim programa
