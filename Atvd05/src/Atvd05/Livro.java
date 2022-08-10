package Atvd05;

public class Livro {
    private Titulo titulo;
    private Autor autor;
    private Capitulo capitulo;
    private Editora editora;

    public Livro(Titulo titulo, Autor autor, Capitulo capitulo, Editora editora){
        this.titulo = titulo;
        this.autor = autor;
        this.capitulo = capitulo;
        this.editora = editora;
    }

    public Titulo getTitulo(){
        return titulo;
    }

    public void setTitulo(Titulo titulo){
        this.titulo = titulo;
    }
    
    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public Capitulo getCapitulo(){
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo){
        this.capitulo = capitulo;
    }

    public Editora getEditora(){
        return editora;
    }

    public void setEditora(Editora editora){
        this.editora = editora;
    }

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", capitulo=" + capitulo + ", editora=" + editora + "]";
	}
}
