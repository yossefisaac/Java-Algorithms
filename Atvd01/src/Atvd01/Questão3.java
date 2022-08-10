package Atvd01;

import java.util.Scanner; 

public class Questão3 {
	private static Scanner leitor;

	public static void main(String[] args) {
		int i;
		float nota[] = new float[10];
		float calcularMedia = 0;
		leitor = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = leitor.nextLine();
		System.out.println("Digite a disciplina desejada: ");
		String disciplina = leitor.nextLine();
		
		for(i=1; i<=4; i++) {
			System.out.println("Digite a "+ i + " nota do aluno:");
			nota[i] = i;
			nota [i]= leitor.nextFloat();
			calcularMedia += nota[i];
		}
		float media = (calcularMedia /4);
		System.out.println("A media do aluno: " + nome + " na diciplina de: " + disciplina + " é de: " + media+".");
				
	}//fim do main.
}//fim da class.


