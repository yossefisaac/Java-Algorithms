package Atvd05;

public class Autor {
    private String nome;

    public Autor(String nome){
        this.nome = nome;
    }

    public String getAutor(){
        return nome;
    }

    public void setAutor(String nome){
        this.nome = nome;
    }

	@Override
	public String toString() {
		return "Autor [nome=" + nome + "]";
	}
     
}
