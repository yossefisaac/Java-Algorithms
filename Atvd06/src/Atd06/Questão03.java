package Atd06;

public class Questão03 {
    public static void main(String [] args){
    	
        Pessoa pessoa = new Pessoa("Yossef", "123456789", "22/9/2000");
        Pessoa aluno = new Aluno("joao", "11111111", "1/1/1990", "00000000");
        Pessoa funcionario = new Funcionario("isaac", "987654321", "21/1/1970", "111111111", "5/6/2022", 5000);
        Pessoa chefedepartamento = new ChefeDepartamento("Misael", "369258147", "21/02/1967", "987456", "21/02/1987", 30000, "NUTES", "21/02/2011", 10000);
        
        System.out.println(pessoa.toString()+"\n"+aluno.toString()+"\n"+funcionario.toString()+"\n"+ chefedepartamento.toString());
    }  
}
