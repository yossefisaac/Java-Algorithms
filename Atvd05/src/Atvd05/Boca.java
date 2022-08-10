package Atvd05;

public class Boca {
    public int quantidade;

    public Boca(int quantidade){
        this.quantidade = quantidade;
    }

    public int getBoca(){
        return quantidade;
    }

    public void setBoca(int quantidade){
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "Boca [quantidade=" + quantidade + "]";
	}
   
}
