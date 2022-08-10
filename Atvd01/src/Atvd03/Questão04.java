package Atvd03;

import java.util.Scanner;
public class Questão04 {
	public static Scanner leitor = new Scanner(System.in);
	private static String palavra1;
	private static String palavra2;
	
	public static void main(String[] args) {
		System.out.println("Digite a primeira palavra: ");
		palavra1 = leitor.next().toUpperCase();
		System.out.println("Digite a segunda palavra: ");
		palavra2 = leitor.next().toUpperCase();
		
		if(palavra1.equals(palavra2)) {
			System.out.println("Palavras iguais.");
		}else {
			System.out.println("As duas palavras concatenadas formam: " + palavra1 + palavra2);//Posso concatenar assim.
			System.out.printf("As duas palavras concatenadas formam: " + palavra1.concat(palavra2));//Ou assim.
		}
		
	}//Fim do main.

}//Fim do class
