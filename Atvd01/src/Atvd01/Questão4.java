package Atvd01;

import java.util.Scanner;

public class Questão4 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		float comprimento1, comprimento2, comprimento3;
		leitor = new Scanner(System.in);
		
			System.out.println("Digite o "+ 1+"°" + " comprimento da madeira");  //Poderia usar vetor e for, tentei porém não consegui jogar no if os vetores.
			comprimento1 = leitor.nextFloat();
			System.out.println("Digite o "+ 2+"°" + " comprimento da madeira");
			comprimento2 = leitor.nextFloat();
			System.out.println("Digite o "+ 2+"°" + " comprimento da madeira");
			comprimento3 = leitor.nextFloat();
			
		if ((comprimento1<comprimento2 + comprimento3) && (comprimento2<comprimento1 + comprimento3) && (comprimento3<comprimento1 + comprimento3)){
			System.out.println("Forma um triângulo válido.");
		}
		else {
			System.out.println("Não forma um triângulo válido.");
		}
	}//Fim do main

}//Fim do class
