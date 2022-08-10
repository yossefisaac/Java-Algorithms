package Atd06;

public class ChefeDepartamento extends Funcionario {
    
    private String departamento;
    private String dataPromocao;
    private float gratificacao;

    public ChefeDepartamento(String nome, String cpf, String dataNasc, String matricula, String dataAdmissao,
            float salario, String departamento, String dataPromocao, float gratificacao) {
        super(nome, cpf, dataNasc, matricula, dataAdmissao, salario);
        this.departamento = departamento;
        this.dataPromocao = dataPromocao;
        this.gratificacao = gratificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public float getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(float gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
	public String toString() {
		return "ChefeDepartamento [departamento=" + departamento + ", dataPromocao=" + dataPromocao + ", gratificacao="
				+ gratificacao + ", matricula=" + matricula + ", dataAdmissao=" + dataAdmissao + ", salario=" + salario
				+ ", nome=" + nome + ", cpf=" + cpf + ", dataNasc=" + dataNasc + "]";
	}      
}
