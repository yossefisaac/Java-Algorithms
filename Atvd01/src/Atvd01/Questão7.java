package Atvd01;

import java.util.Scanner;

public class Questão7 {
	private static Scanner leitor;

	public static void main(String[] args) {
		int calorias = 0;
		 leitor = new Scanner(System.in);
		 System.out.println("Seja bem vindo!");
		 System.out.println("Escolha o seu prato, Digite 1 para o prato Italiano, 2 para Japonês e 3 para Salvadoreno.");
		 int numeroCal = leitor.nextInt();
		 switch(numeroCal) { //poderia usar o if e else.
		 case 1:
			 calorias +=750;
			 break;
		 case 2:
			 calorias +=342;
			 break;
		 case 3:
			 calorias +=545;
			 break;
		 }//Fim do primeiro switch
		 System.out.println("Escolha o sua bebida, Digite 1 para chá, 2 para suco de Laranja e 3 para Refrigerante.");
		 int numeroCal2 = leitor.nextInt();
		 switch(numeroCal2) { //poderia usar o if e else.
		 case 1:
			 calorias +=30;
			 break;
		 case 2:
			 calorias +=80;
			 break;
		 case 3:
			 calorias +=90;
			 break;
		 }//Fim do segundo switch
		System.out.println("A quantidade de calorias dos pratos escolhidos é de: " + calorias);
	}//Fim do main

}//Fim da class
