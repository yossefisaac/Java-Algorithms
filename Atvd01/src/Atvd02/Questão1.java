package Atvd02;

import java.util.Scanner;

public class Questão1 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(numero + "X" + i + "=" + (numero*i));
		}
		
	}//Fim do main
}//Fim do class
