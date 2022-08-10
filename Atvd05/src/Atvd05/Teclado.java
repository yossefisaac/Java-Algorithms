package Atvd05;

public class Teclado {
    private String modelo;

    public Teclado(String modelo){
        this.modelo = modelo;
    }

    public String getTeclado(){
        return modelo;
    }

    public void setTeclado(String modelo){
        this.modelo = modelo;
    }

	@Override
	public String toString() {
		return "Teclado [modelo=" + modelo + "]";
	}
  
}
