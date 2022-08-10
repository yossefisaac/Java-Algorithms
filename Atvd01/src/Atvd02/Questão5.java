package Atvd02;

import java.util.Scanner;

public class Questão5 { 
	private static Scanner leitor;
	//Tentei fazer digitando o nome do aluno, porém não consegui..

	public static void main(String[] args) { 
		leitor = new Scanner(System.in);
		float notasAlunos[][] = new float[5][3];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite a nota " + (j+1) + " do aluno" + (i+1));
				notasAlunos[i][j] = leitor.nextFloat();
			}
		}//Primeiro For. (Capturar as notas dos aluno)
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Aluno:  " + (i+1) + " // " +  (j+1) +"° Nota:" + notasAlunos[i][j]);
			}
		}//Segundo For. (Mostrar Alunos e notas)
		
		for(int i=0; i<5; i++){
			float soma=0;
			for(int j=0; j<3; j++) {
				soma = soma + notasAlunos[i][j];
			}
		System.out.println("Média do aluno "+ (i+1) + ": " + ((soma)/3));		
		}// Terceiro For. (Média)
	}//Fim do main.	
}//Fim do class.
