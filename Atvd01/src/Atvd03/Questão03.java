package Atvd03;

import java.util.Scanner;
public class Quest�o03 {
	public static Scanner leitor = new Scanner(System.in);
	static double X, Y, Z;
	
	public static void main(String[] args) {
		System.out.println("Digite o valor de X");
		X = leitor.nextDouble();
		System.out.println("Digite o valor de Y");
		Y = leitor.nextDouble();
		System.out.println("Digite o valor de Z");
		Z = leitor.nextDouble();
		triangulos();
		
	}//Fim do codigo principal.
	public static void triangulos() {
		if ((X<Y+Z) && (Y<X+Z) && (Z<X+Y)) {
			if(X==Z && X==Y && Z==Y) {
				System.out.println("Triangulo Equil�tero.");
			}
			if(((X==Z)&&(X!=Y)) || ((X==Y)&&(X!=Z)) || ((Z==Y)&&(Z!=X))) {
				System.out.println("Triangulo Is�sceles.");
			}
			if(X!=Z && X!=Y && Z!=Y) {
				System.out.println("Triangulo Escaleno.");
			}
		}else {
			System.out.println("N�o pode ser um triangulo.");
		}
	}//Fim do proecdimento.

}//Fim do class
