package atvd08;
import java.util.ArrayList;

public class Questao02 {
	private static ArrayList<Livros> lista = new ArrayList<Livros>();
	public static void main(String[] args) {
		
		Livros livro1 = new Livros("titulo", "autor", Livros.getTipoGenero()[2], "editora", 1);
		
		lista.add(livro1);
		
		for(Livros livro: lista){
            System.out.println(livro.toString());
        }
	}

}

