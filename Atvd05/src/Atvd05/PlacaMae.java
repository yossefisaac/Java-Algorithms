package Atvd05;

public class PlacaMae {
    private String modelo;

    public PlacaMae(){
    }

    public PlacaMae(String modelo){
        this.modelo = modelo;
    }

    public String getPlacaMae(){
        return modelo;
    }

    public void setPlacaMae(String modelo){
        this.modelo = modelo;
    }

	@Override
	public String toString() {
		return "PlacaMae [modelo=" + modelo + "]";
	}
    
}
