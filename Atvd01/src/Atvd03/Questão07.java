package Atvd03;

import java.util.Scanner;
public class Questão07 {
	public static Scanner leitor = new Scanner(System.in);
	static int numero1, numero2;
	public static void main(String[] args) {
		
		System.out.println("Digite o primeiro número: ");
		numero1 = leitor.nextInt();
		System.out.println("Digite o segundo número: ");
		numero2 = leitor.nextInt();
		System.out.println("O MDC dos números digitados é de: " + MDC(numero1, numero2));
	}//Fim do main.
	public  static int MDC(int numero1, int numero2) {
		if (numero1 == numero2) {
			return numero1;
		}
		else if (numero1 > numero2) {
			return MDC(numero1-numero2, numero2);
		}
		else if (numero2 > numero1) {
			return MDC(numero2-numero1, numero1);
		}
		return 0;
	}
}//Fim do class.
