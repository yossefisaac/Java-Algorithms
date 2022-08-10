import java.util.HashSet;

public class Hashset {
  public static void main(String[] args) {
    HashSet<String> listaDeCompras = new HashSet<String>();

    listaDeCompras.add("Arroz");
    listaDeCompras.add("Feijão");
    listaDeCompras.add("Frango");
    listaDeCompras.add("Ovo");
    listaDeCompras.add("Macarrão");
    listaDeCompras.add("Leite"); // Item duplicado, logo um dos será desconsiderado.
    listaDeCompras.add("Leite"); 

    for (String i: listaDeCompras) {
      System.out.println(i);
    }

    listaDeCompras.remove("Ovo");
    System.out.println();
    for (String i: listaDeCompras) { //Item removido
        System.out.println(i);
      }
    listaDeCompras.clear();
  }
}