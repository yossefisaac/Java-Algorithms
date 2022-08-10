package Atvd05;

public class Monstro {
    private Cabeca cabeca;
    private Olho olho;
    private Boca boca;
    private Braco braco;
    private Perna perna;
    
    public Monstro(Cabeca cabeca, Olho olho, Boca boca, Braco braco, Perna perna){
        this.cabeca = cabeca;
        this.olho = olho;
        this.boca = boca;
        this.braco = braco;
        this.perna = perna;
    }

    public Cabeca getCabeca(){
        return cabeca;
    }

    public void setCabeca(Cabeca cabeca){
        this.cabeca = cabeca;
    }

    public Olho getOlho(){
        return olho;
    }

    public void setOlho(Olho olho){
        this.olho = olho;
    }
    
    public Boca getBoca(){
        return boca;
    }

    public void setBoca(Boca boca){
        this.boca = boca;
    }

    public Braco getBraco(){
        return braco;
    }

    public void setBraco(Braco braco){
        this.braco = braco;
    }

    public Perna getPerna(){
        return perna;
    }

    public void setPerna(Perna perna){
        this.perna = perna;
    }

	@Override
	public String toString() {
		return "Monstro [cabeca=" + cabeca + ", olho=" + olho + ", boca=" + boca + ", braco=" + braco + ", perna="
				+ perna + "]";
	}
}
