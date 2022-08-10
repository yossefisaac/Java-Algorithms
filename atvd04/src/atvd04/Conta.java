package atvd04;

public class Conta {
    private float saldo;
   
    public Conta(){
       saldo = 0.0f;
    }

    public void depositar(float quantia){
        saldo = saldo + quantia;
        System.out.println("Deposito efetuado com sucesso!");
        System.out.println("Seu novo saldo: " + this.saldo);
    }

    public void sacar(float quantia){
        if(saldo>=quantia){
            saldo = saldo - quantia;
            System.out.println("Saque concluído!");
            System.out.println("Seu novo saldo: " + this.saldo);
        } else{
            System.out.println("Impossível fazer saque.");
        }      
    }
}
