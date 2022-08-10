import java.util.HashMap;

public class HashMaps {
  public static void main(String[] args) {
    HashMap<Integer, String> listaDeCompras = new HashMap<Integer, String>();
    
    
    listaDeCompras.put(1, "Arroz");
    listaDeCompras.put(2, "Feijão");
    listaDeCompras.put(3, "Frango");
    listaDeCompras.put(4, "Ovo");
    listaDeCompras.put(5, "Macarrão");
    listaDeCompras.put(6, "Leite"); 
    listaDeCompras.put(6, "Leite"); // Item duplicado, logo será desconsiderado.
  
    for (String i: listaDeCompras.values()) {
      System.out.println(i);
    }
    System.out.println();
    
    listaDeCompras.remove(1); //Remove posição 1.
    for (String i: listaDeCompras.values()) {
        System.out.println(i);
      }
    listaDeCompras.clear();
  }
}