package atvd08;
public class Triangulo extends FiguraAbstrata{

	public Triangulo(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	void desenha() {
		System.out.println("O " + getNome() + " Está sendo desenhado!");
		
	}

}

