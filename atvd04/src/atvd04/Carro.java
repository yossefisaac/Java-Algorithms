package atvd04;

public class Carro {
    private String marca, modelo;
    private int ano;
    private String tipo;

    public Carro(String marca, String modelo, int ano, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }
    @Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", tipo=" + tipo + "]";
	}

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public String getTipo(){
        return this.tipo;
    }

}
