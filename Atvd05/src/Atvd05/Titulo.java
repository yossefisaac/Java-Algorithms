package Atvd05;

public class Titulo {
    private String descricao;

    public Titulo(String descricao){
        this.descricao = descricao;
    }

    public String getTitulo(){
        return descricao;
    }

    public void setTitulo(String descricao){
        this.descricao = descricao;
    }

	@Override
	public String toString() {
		return "Titulo [descricao=" + descricao + "]";
	}

}
