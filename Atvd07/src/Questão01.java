import java.util.ArrayList;

class Quest�o01 {
  public static void main(String[] agrs) {
    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(new Animal("Cachorro", 4, "Terrestre"));
    animals.add(new Animal("Calopsita", 2, "A�reo"));

    System.out.println(animals.get(0).getNome());
    System.out.println(animals.get(1).getNome());
  }
}

class Animal {
  private String nome;
  private int quantPatas;
  private String tipo;

  Animal(String nome, int quantPatas, String tipo) {
    this.setNome(nome);
    this.setQuantPatas(quantPatas);
    this.setTipo(tipo);
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setQuantPatas(int quantPatas) {
    this.quantPatas = quantPatas;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getNome() {
    return this.nome;
  }

  public int getQuantPatas() {
    return this.quantPatas;
  }

  public String getTipo() {
    return this.tipo;
  }

}