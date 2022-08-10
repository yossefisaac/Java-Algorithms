package Atvd03;

import java.util.Scanner;

public class Questão06 {
	public static Scanner leitor = new Scanner(System.in);
	static int n, calculo=0;
	public static void main(String[] args) {
		System.out.println("Digite o número n: ");
		n = leitor.nextInt();
		CalcularN();
		System.out.println("O calculo dos números deu: "+ calculo);
		
	}//Fim do main.
	public static int CalcularN() {
		for(int i=1; i<=n; i++) {
			calculo += i;
		}
	
	return 0;
	}
}//Fim do class.
