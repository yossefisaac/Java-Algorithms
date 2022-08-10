package Atvd05;

public class Editora {
    private String descricao;

    public Editora(String descricao){
        this.descricao = descricao;
    }

    public String getEditora(){
        return descricao;
    }

    public void setEditora(String descricao){
        this.descricao = descricao;
    }

	@Override
	public String toString() {
		return "Editora [descricao=" + descricao + "]";
	}     
}
