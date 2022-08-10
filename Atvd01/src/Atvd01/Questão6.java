package Atvd01;

import java.util.Scanner;

public class Questão6 {
	private static Scanner leitor;

	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = leitor.nextInt();
		if(idade<16) {
			System.out.println("Não Eleitor.");}
		else if(idade>=18 && idade<=65) {
			System.out.println("Eleitor Obrigatório.");}
		else{
			System.out.println("Eleitor Facultativo.");}
		
	}//Fim do main

}//Fim do class
