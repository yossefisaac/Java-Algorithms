package Atvd05;

public class Olho {
    public int quantidade;

    public Olho(int quantidade){
        this.quantidade = quantidade;
    }

    public int getOlho(){
        return quantidade;
    }

    public void setOlho(int quantidade){
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "Olho [quantidade=" + quantidade + "]";
	}
       
}
