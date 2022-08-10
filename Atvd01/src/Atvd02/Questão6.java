package Atvd02;

import java.util.Scanner;

public class Questão6 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		System.out.println("Digite quantas linhas tem a matriz:");
		int m = leitor.nextInt();
		System.out.println("Digite quantas colunas tem a matriz:");
		int n = leitor.nextInt();
		int MatrizA[][] = new int[m][n];
		int MatrizTransposta[][] = new int[n][m];
		
		for(int i=0; i<MatrizA.length; i++){
			for(int j=0; j<MatrizA[i].length; j++) {
				System.out.println("Digite o valor [" + i + "] [" + j + "] :");
				MatrizA[i][j] = leitor.nextInt();
			}	
		}
		System.out.println("Matriz preenchida: ");
		for(int i=0; i<MatrizA.length; i++){
			for(int j=0; j<MatrizA[i].length; j++) {
				System.out.print(MatrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz transposta: ");
		for(int i=0; i<MatrizTransposta.length; i++){
			for(int j=0; j<MatrizTransposta[i].length; j++) {
				MatrizTransposta[i][j] = MatrizA[j][i];
				System.out.print(MatrizTransposta[i][j] + " ");
			}
			System.out.println();
		}
		
	}//Fim do main.
}//Fim do class.
