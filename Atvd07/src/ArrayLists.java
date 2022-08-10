import java.util.ArrayList;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<String> listaDeCompras = new ArrayList<String>();

    listaDeCompras.add("Arroz");
    listaDeCompras.add("Feij�o");
    listaDeCompras.add("Frango");
    listaDeCompras.add("Ovo");
    listaDeCompras.add("Macarr�o");
    listaDeCompras.add("Leite");
    listaDeCompras.add("Leite"); //Repete na lista, mesmo sendo igual ao anterior.
    
    for (String i: listaDeCompras) {
        System.out.println(i);
      }
    System.out.println();
    listaDeCompras.remove("Ovo");//remove ovo   
    listaDeCompras.remove(0); //posi��o 0
    
    for (String i: listaDeCompras) {
      System.out.println(i);
    }

    listaDeCompras.clear();
  }
}