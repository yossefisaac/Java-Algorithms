package Atvd05;

public class Monitor {
    private String modelo;

    public Monitor(String modelo){
        this.modelo = modelo;
    }

    public String getMonitor(){
        return modelo;
    }

    public void setMonitor(String modelo){
        this.modelo = modelo;
    }

	@Override
	public String toString() {
		return "Monitor [modelo=" + modelo + "]";
	}
    
}
