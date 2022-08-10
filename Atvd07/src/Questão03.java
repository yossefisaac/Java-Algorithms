import java.util.Scanner;

public class Questão03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    try {
      System.out.println("Deseja executar algo?");
      System.out.println("Digite 1 para 'Sim' e 2 para 'Não'");
      
      if (input.nextInt() == 1) {
		throw new Exception();
      }
    } catch(Exception exception) {
      System.out.println("Sucesso.");
    }
    finally {
      System.out.println("Falha.");
      input.close();
    }
  }
}