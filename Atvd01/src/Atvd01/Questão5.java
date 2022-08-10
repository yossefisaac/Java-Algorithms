package Atvd01;

import java.util.Scanner;

public class Questão5 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor do depósito: ");
		float deposito = leitor.nextFloat();
		System.out.println("Digite o valor da taxa de juros em porcentagem: ");
		float juros = leitor.nextFloat();
		
		System.out.println("Valor do rendimento: "+ ((deposito * juros)/100));
		System.out.println("Valor total: " + (deposito + ((deposito * juros)/100)));
	}//Fim do main

}//Fim do class
