package Atvd05;

public class Questão08 {
    public static void main(String [] args){
        Monstro monstro = new Monstro(new Cabeca(1), new Olho(2), new Boca(1), new Braco(6), new Perna(4));
        System.out.println(monstro.toString());
    }    
}
