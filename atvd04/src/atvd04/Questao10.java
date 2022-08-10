package atvd04;

public class Questao10 {

    public static void main (String [] args){
        Conta corrente = new Conta();
        Conta poupanca = new Conta();
        corrente.depositar(200);
        corrente.sacar(30);
        poupanca.depositar(30);
        poupanca.sacar(200);
    }
}
