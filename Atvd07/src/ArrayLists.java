import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> listaDeCompras = new ArrayList<String>();

    listaDeCompras.add("Arroz");
    listaDeCompras.add("Feijão");
    listaDeCompras.add("Frango");
    listaDeCompras.add("Ovo");
    listaDeCompras.add("Macarrão");
    listaDeCompras.add("Leite");
    listaDeCompras.add("Leite"); //Repete na lista, mesmo sendo igual ao anterior.
    
    for (String i: listaDeCompras) {
        System.out.println(i);
      }
    System.out.println();
    listaDeCompras.remove("Ovo");//remove ovo   
    listaDeCompras.remove(0); //posição 0
    
    for (String i: listaDeCompras) {
      System.out.println(i);
    }

    listaDeCompras.clear();
  }
}