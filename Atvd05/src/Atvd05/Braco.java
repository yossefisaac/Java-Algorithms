package Atvd05;

public class Braco {
    public int quantidade;

    public Braco(int quantidade){
        this.quantidade = quantidade;
    }

    public int getBraco(){
        return quantidade;
    }

    public void setBraco(int quantidade){
        this.quantidade = quantidade;
    }

	@Override
	public String toString() {
		return "Braco [quantidade=" + quantidade + "]";
	}
   
}
