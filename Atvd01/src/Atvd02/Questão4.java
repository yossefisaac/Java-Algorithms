package Atvd02;

import java.util.Scanner;


public class Questão4 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		int numeros[] = new int[10];
		int aux= 0;
		
		for(int i=0; i<10; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = leitor.nextInt();
		}//Fim do for.
		
		for (int j=0; j<10; j++){
			for(int i=0; i<9; i++){
				if(numeros[i] > numeros[i+1]){
					aux = numeros[i];
					numeros[i] = numeros[i+1];
					numeros[i+1] = aux;	
					}
			}
			}//Fim do segundo for.
		
		for(int i=0; i<10; i++) {
			System.out.println("Ordem crescente: " + numeros[i]);
		}
		for(int i=9; i>=0; i--) {
			System.out.println("Ordem decrescente: " + numeros[i]);
		}
	}//Fim do Main.
}//Fim do class.
