package Atvd05;

public class Questão05 {
    public static void main(String [] args){
        Pessoa pessoa = new Pessoa("Yossef", new Data(22, 9, 2000), new Endereco("Três Irmãs", 715, "Presidente Medici", "Campina Grande", "58417620"), new Contato("0000000", "83981999089", "contatoyossef@gmail.com"));
        System.out.println(pessoa.toString());
    }
}