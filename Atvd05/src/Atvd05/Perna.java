package Atvd05;

public class Perna {
    public int quantidade;

    public Perna(int quantidade){
        this.quantidade = quantidade;
    }

    public int getPerna(){
        return quantidade;
    }

    public void setPerna(int quantidade){
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "Perna [quantidade=" + quantidade + "]";
	}
      
}
