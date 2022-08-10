package atvd08;
public abstract class FiguraAbstrata {
	private String nome;
	
	public FiguraAbstrata(String nome){
		this.nome = nome;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "FiguraAbstrata [nome=" + nome + "]";
	}

	abstract void desenha();
	
}

