package Questão06;

import java.util.ArrayList;
import java.util.List;

public class Questão06 {
	
    public List<Pessoa> lista = new ArrayList<Pessoa>(); //as pessoas são cadastradas dentro da lista

    public void cadastrarPessoa(Pessoa pessoa){
        lista.add(pessoa);
    }

    public void mostrarPessoas(){
        for(Pessoa pessoa:lista){
            System.out.println(pessoa.toString());
        }
    }
    public static void main(String [] args){
        Questão06 aplicacao = new Questão06();
        
        Pessoa pessoa = new Pessoa("Yossef", "111222333312");
        Pessoa cliente = new Cliente("Cliente: Isaac", "22233344432", 902834);
        Pessoa funcionario = new Funcionario("Joao", "66677788821", "03932", 1100);
        Pessoa gerente = new Gerente("Jucelio", "99988877765", "08773", 10000, 3);
        
        aplicacao.cadastrarPessoa(pessoa);
        aplicacao.cadastrarPessoa(cliente);
        aplicacao.cadastrarPessoa(funcionario);
        aplicacao.cadastrarPessoa(gerente);
        
        aplicacao.mostrarPessoas(); //Mostrar lista com pessoas.
    }
}