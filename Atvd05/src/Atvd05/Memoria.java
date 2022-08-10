package Atvd05;

public class Memoria {
    private String modelo;

    public Memoria(String modelo){
        this.modelo = modelo;
    }

    public String getMemoria(){
        return modelo;
    }

    public void setMemoria(String modelo){
        this.modelo = modelo;
    }

	@Override
	public String toString() {
		return "Memoria [modelo=" + modelo + "]";
	}
	
}
