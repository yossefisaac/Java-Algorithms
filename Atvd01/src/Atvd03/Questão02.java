package Atvd03;

import java.util.Scanner;
public class Questão02 {
	public static Scanner leitor = new Scanner(System.in);
	static float nota[] = new float[3];
	static char letra;
	static char letraUpperCase;
	
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println("Digite a " + i+01 + " nota: ");
			nota[i] = leitor.nextFloat();
		}
		System.out.println("Digite 'A' para Calcular de forma Aritmética e 'P' para ponderada.");
		letra = leitor.next().charAt(0);
		letraUpperCase = Character.toUpperCase(letra);
		System.out.println("A media é de: "+ CalcularMedia());
		
	}//Fim do codigo principal.
	public static float CalcularMedia() {
		float notaTotalA=0;
		float media=0;
		if(letraUpperCase == 'A'){
			for(int i=0; i<3; i++) {
				notaTotalA += nota[i];
			}
		media = (notaTotalA/3);
		}
		if(letraUpperCase == 'P'){
			media = (((nota[0]*5) + (nota[1]*3) + (nota[2]*2)) / 10);
		}
		return media;
	}//Fim da função.

}//Fim do class.
