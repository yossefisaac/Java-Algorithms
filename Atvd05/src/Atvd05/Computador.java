package Atvd05;

public class Computador {
    private Teclado teclado;
    private Monitor monitor;
    private Memoria memoria;
    private PlacaMae placaMae;

    public Computador(Teclado teclado, Monitor monitor, Memoria memoria, PlacaMae placaMae){
        this.teclado = teclado;
        this.monitor = monitor;
        this.memoria = memoria;
        this.placaMae = placaMae;
    }

    public Computador(){
        placaMae = new PlacaMae("Asus-b350m");
        teclado = new Teclado("MotoSpeed");
        monitor = new Monitor("LG-75hz");
        memoria = new Memoria("Gloway-16gb-x2");
    }

    public Computador(String modelo){
        placaMae = new PlacaMae(modelo);
    }

    public void ligarComputador(){
        placaMae = new PlacaMae("Asus");
    }

    public void ligarComputador(String modelo){
        placaMae = new PlacaMae(modelo);
    }

    
    public PlacaMae getPlacaMae(){
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae){
        this.placaMae = placaMae;
    }

    public Teclado getTeclado(){
        return teclado;
    }

    public void setTeclado(Teclado teclado){
        this.teclado = teclado;
    }

    public Monitor getMonitor(){
        return monitor;
    }

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;
    }

    public Memoria getMemoria(){
        return memoria;
    }

    public void setMemoria(Memoria memoria){
        this.memoria = memoria;
    }

	@Override
	public String toString() {
		return "Computador [teclado=" + teclado + ", monitor=" + monitor + ", memoria=" + memoria + ", placaMae="
				+ placaMae + "]";
	}

}
