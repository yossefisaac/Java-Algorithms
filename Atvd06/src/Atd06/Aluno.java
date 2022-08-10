package Atd06;

public class Aluno extends Pessoa{

    private String matricula;
    
    public Aluno(String nome, String cpf, String dataNasc, String matricula) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}
}