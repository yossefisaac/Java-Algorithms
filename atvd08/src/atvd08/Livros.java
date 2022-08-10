package atvd08;
public class Livros {
	private String titulo;
	private String autor;
	private String genero;
	private String editora;
	private int edicao;
	private static String[] tipoGenero = new String[]{"Ficção", "Ciências Naturais", "Literatura", "Ciências Humanas"};
	
	public Livros(String titulo, String autor, String genero, String editora, int edicao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.editora = editora;
		this.edicao = edicao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public static String[] getTipoGenero() {
		return tipoGenero;
	}

	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", editora=" + editora
				+ ", edicao=" + edicao + "]";
	}

	
}

