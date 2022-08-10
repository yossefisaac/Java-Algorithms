package Atvd03;

import java.util.Scanner;
public class Questão05{
    public static Scanner leitor = new Scanner(System.in);
    static String S1, S2, S3, S4;
    static String menu;
    
    public static void main(String[] args) {           
        do {
            System.out.println("\nEscolha uma opção abaixo: ");
            System.out.println("[A] - ler a String 1.");
            System.out.println("[B] - Para imprimir o tamanho da String 1.");
            System.out.println("[C] - Para comparar com a String 1 e String 2.");
            System.out.println("[D] - Concatenar a String 1 e a String 2.");
            System.out.println("[E] - Para imprimir a String 1 na forma inversa.");
            System.out.println("[0] - Parar Programa.");
            menu = leitor.next().toUpperCase();
        	switch(menu){ 
        	case "0":{
        	System.exit(0);
        	}
            case "A":
            	System.out.println("Digite a String S1: ");
            	S1 = leitor.next();
            	if(S1.length() > 20){
                    System.out.println("Digite até 20 caracteres: ");
                    S1 = leitor.next();
                }
                break;
            case "B":tamanho();break;            
            case "C":comparar();break;
            case "D":concatenar();break;            
            case "E":inversa();break;
        }
        	
        }while(menu!="0");
    }//Fim do main.

    public static void tamanho(){       
            System.out.format("O tamanho de String 1 é: " + S1.length());
        }
    
    public static void comparar(){
        System.out.println("Digite a String 1: ");
        S1 = leitor.next();

        while(S1.length() > 20){
            System.out.println("Digite até 20 caracteries: ");
            S1 = leitor.next();
            }
        
        System.out.print("Digite a String 2: ");
        S2 = leitor.next();
        if (S1.equalsIgnoreCase(S2)){
            System.out.println("As Strings são iguais.");
        }else{
            System.out.println("As Strings são Diferentes.");
        }
    }

    public static void concatenar(){        
        System.out.println("Digite a String 1: ");        
        S1 = leitor.next();
        
        while(S1.length() > 20){
            System.out.println("Digite até 20 caracteries: ");
            S1 = leitor.next();}
            System.out.println("Digite a String 2: ");
            S2 = leitor.next();
            S3 = S1 + " " + S2;
            System.out.format("O resultado da junção das Strings fica assim: " + S3);
    }

    public static void inversa(){     
        String inversa = "";
        for (int i = S1.length() - 1; i >= 0; i--){
            inversa += S1.charAt(i);
        }        
        System.out.format("A String 1 é "+ S1 + ", na forma inversa fica: " + inversa);       
    }
}//Fim do class.
