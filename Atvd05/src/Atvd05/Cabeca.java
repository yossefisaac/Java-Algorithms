package Atvd05;

public class Cabeca {
    public int quantidade;

    public Cabeca(int quantidade){
        this.quantidade = quantidade;
    }

    public int getCabeca(){
        return quantidade;
    }

    public void setCabeca(int quantidade){
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "Cabeca [quantidade=" + quantidade + "]";
	}
}
