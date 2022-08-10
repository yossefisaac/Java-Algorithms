package Atvd02;

import java.util.Scanner;

public class Questão2 {
	private static Scanner leitor;
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		float salario = 0, salarioCont = 0, cont = 0;
		int filho, i = 0, cont2 = 0;
		
		while(salario!=-1) {
		System.out.println("Digite o salario: ");
		salario = leitor.nextFloat();
		if(salario!=-1) {
			cont += salario;;
		}
		
		if(salario > salarioCont) {
			salarioCont = salario;
		}
		
		System.out.println("Digite o numero de filhos: ");
		filho = leitor.nextInt();
		if(salario!=-1) {
			cont2 += filho;
			i++;
		}
		}
		System.out.println("A média salarial é de: " + (cont/i));
		System.out.println("A média de filhos é de aproximadamente: " + (cont2/i)); //Não existe '2,3 filhos', por isso foi usado int para filho, tendo assim um valor aproximado.
		System.out.println("O maior salário é de: " + salarioCont);
		
	}//Fim do main.
}//Fim do class
