package Atvd02;

import java.util.Scanner;

public class Questão7 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		int MatrizA[][] = new int[5][5];
		int MatrizB[][] = new int[5][5];
		int MatrizC[][] = new int[5][5]; //matriz soma
		int MatrizD[][] = new int[5][5]; //matriz diferença
		
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor da Matriz A [" + i + "] [" + j + "] :");
				MatrizA[i][j] = leitor.nextInt();
			}	
		}
		
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++) {
				System.out.println("Digite o valor da Matriz b [" + i + "] [" + j + "] :");
				MatrizB[i][j] = leitor.nextInt();
			}	
		}
		
		System.out.println("Soma das matrizes: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++) {
				MatrizC[i][j]= (MatrizA[i][j] + MatrizB[i][j]);
				System.out.print(MatrizC[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Diferença das matrizes: ");
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++) {
				MatrizD[i][j]= (MatrizA[i][j] - MatrizB[i][j]);
				System.out.print(MatrizC[i][j] + " ");
			}
			System.out.println();
		}		
	}//Fim do main.
}//Fim do class.
