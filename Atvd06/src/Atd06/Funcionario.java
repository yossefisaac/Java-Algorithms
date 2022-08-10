package Atd06;


public class Funcionario extends Pessoa {
    protected String matricula;
    protected String dataAdmissao;
    protected float salario;

    public Funcionario(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao,
            float salario) {
        super(nome, cpf, dataNasc);
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario
				+ ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}  
}
