package Atvd05;

public class Capitulo {
    private String descricao;

    public Capitulo(String descricao){
        this.descricao = descricao;
    }

    public String getCapitulo(){
        return descricao;
    }

    public void setCapitulo(String descricao){
        this.descricao = descricao;
    }

	@Override
	public String toString() {
		return "Capitulo [descricao=" + descricao + "]";
	}
    
}