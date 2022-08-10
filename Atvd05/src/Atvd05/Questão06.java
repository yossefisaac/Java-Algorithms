package Atvd05;

public class Questão06 {
    public static void main(String []args){
        Teclado teclado = new Teclado("MotoSpeed");
        Monitor monitor = new Monitor("LG-75hz");
        Memoria memoria = new Memoria("Gloway-16gb-x2");
        PlacaMae placaMae = new PlacaMae("Asus-b350m");
        Computador computadorEmpresarial = new Computador(teclado, monitor, memoria, placaMae);
        System.out.println(computadorEmpresarial.toString());

        Computador computadorPessoal = new Computador(new Teclado("MotoSpeed"), new  Monitor("LG-75hz"), new Memoria("Gloway-16gb-x2"), new PlacaMae("Asus-b350m"));
        System.out.println(computadorPessoal.toString());
         
        Computador computador = new Computador();
        PlacaMae placa = new PlacaMae();
        placa.setPlacaMae("Asuss");
        computador.setPlacaMae(placa);
    }    
}