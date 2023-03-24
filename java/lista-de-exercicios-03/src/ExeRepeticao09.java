/*
 * Escrever um algoritmo que recebe repetidamente o sexo (M - Masculino e F - Feminino) e a idade.
 * Apresentar no final do algoritmo a média da idade dos homens e a média da idade das mulheres.
 * Parar o algoritmo quando for digitado um sexo diferente de M ou F.
 */

import java.util.Scanner;

public class ExeRepeticao09
{

	public static void main(String[] args)
	{
		// cria scanner
		Scanner userInput = new Scanner(System.in);
		
		int sumAgeWomen = 0,
			sumAgeMen = 0,
			menCounter = 0,
			womenCounter = 0,
			averageMen = 0,
			averageWomen = 0;
		
		boolean continueProgram = true;
		
		String inputGender;
		
		System.out.println("Programa iniciado.\n");
		
		do
		{
			System.out.println("Digite o sexo. (M/F)");
			inputGender = userInput.next(); // ler sexo
						
			if(inputGender.equals("M") || inputGender.equals("m"))
			{
				System.out.println("Digite a idade.");
				int inputAge = userInput.nextInt(); // ler idade
				menCounter++;
				sumAgeMen += inputAge;
				averageMen = sumAgeMen / menCounter;
			}
			else
			{
				if(inputGender.equals("F") || inputGender.equals("f"))
				{	
					System.out.println("Digite a idade.");
					int inputAge = userInput.nextInt(); // ler idade
					womenCounter++;
					sumAgeWomen += inputAge;
					averageWomen = sumAgeWomen / womenCounter;
				}
				else
				{
					continueProgram = false;
				}
			}
			
			System.out.printf("Média de idade dos homens: %d\n", averageMen);
			System.out.printf("Média de idade das mulheres: %d\n", averageWomen);
			
		} while (continueProgram);
		
		System.out.println("Programa encerrado.");
		
		userInput.close();
		
	} // fim main
} // fim class
