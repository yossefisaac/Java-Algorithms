import java.util.HashMap;

public class HashMaps {
  public static void main(String[] args) {
    HashMap<Integer, String> listaDeCompras = new HashMap<Integer, String>();
    
    
    listaDeCompras.put(1, "Arroz");
    listaDeCompras.put(2, "Feij�o");
    listaDeCompras.put(3, "Frango");
    listaDeCompras.put(4, "Ovo");
    listaDeCompras.put(5, "Macarr�o");
    listaDeCompras.put(6, "Leite"); 
    listaDeCompras.put(6, "Leite"); // Item duplicado, logo ser� desconsiderado.
  
    for (String i: listaDeCompras.values()) {
      System.out.println(i);
    }
    System.out.println();
    
    listaDeCompras.remove(1); //Remove posi��o 1.
    for (String i: listaDeCompras.values()) {
        System.out.println(i);
      }
    listaDeCompras.clear();
  }
}