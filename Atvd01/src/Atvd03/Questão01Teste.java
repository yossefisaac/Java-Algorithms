package Atvd03;

import java.util.Scanner;

public class Questão01Teste {
	static int valor;
	public static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Digite um valor: ");
		valor = leitor.nextInt();
		System.out.println(parOuImpar());
	}//Fim do codigo principal.
	public static char parOuImpar() {
		if(valor%2==0) {
			return 1;	
		}
		else {
			return 0;
		}
	}//Fim da função.	
}//Fim do class.
