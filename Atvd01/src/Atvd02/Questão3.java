package Atvd02;

import java.util.Scanner;

public class Questão3 {
	private static Scanner leitor;
	
	//Não consegui fazer com vetor no for, pesquisando na internet so aprendi dessa forma.
	//E indexof so mostra a posição, não a quantidade.
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		String nomes[] = new String[3];
		int totalCharactersA = 0;
		int totalCharactersE = 0;
		char temp;
		
		System.out.println("Digite o primeiro nome: ");
		nomes[0] = leitor.next();
        for (int i = 0; i < nomes[0].length(); i++) {

            temp = nomes[0].charAt(i);
            if (temp == 'a') {
                totalCharactersA++;
                }
            if (temp == 'A') {
                totalCharactersA++;
                }
            if (temp == 'e') {
                totalCharactersE++;
                }
            if (temp == 'E') {
                totalCharactersE++;
                }
        	}
        System.out.println("Digite o segundo nome: ");
		nomes[1] = leitor.next();
        for (int i = 0; i < nomes[1].length(); i++) {

            temp = nomes[1].charAt(i);
            if (temp == 'a') {
                totalCharactersA++;
                }
            if (temp == 'A') {
                totalCharactersA++;
                }
            if (temp == 'e') {
                totalCharactersE++;
                }
            if (temp == 'E') {
                totalCharactersE++;
                }
        	}
        System.out.println("Digite o terceiro nome: ");
		nomes[2] = leitor.next();
        for (int i = 0; i < nomes[2].length(); i++) {

            temp = nomes[2].charAt(i);
            if (temp == 'a') {
                totalCharactersA++;
                }
            if (temp == 'A') {
                totalCharactersA++;
                }
            if (temp == 'e') {
                totalCharactersE++;
                }
            if (temp == 'E') {
                totalCharactersE++;
                }
        	}
        
        System.out.println("A letra A aparece " + totalCharactersA + " vezes nos nomes informados.");
        System.out.println("A letra E aparece " + totalCharactersE + " vezes nos nomes informados.");
    }//Fim do main
}//Fim do class