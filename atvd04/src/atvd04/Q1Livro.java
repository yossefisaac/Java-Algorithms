package atvd04;

//Questão01. Livro.java

public class Q1Livro {
    private String titulo, autor, editora;
    private int ano;

    public Q1Livro() {}
    public Q1Livro(String titulo, String autor, String editora, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

	@Override
	public String toString() {
		return "Q1Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + "]";
	}

	public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo; 
    }

    public String getAutor(){
        return this.autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getEditora(){
        return this.editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }  
}