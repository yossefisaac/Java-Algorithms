package Atvd05;

public class Pessoa {
    public String nome;
    private Data datanasc;
    private Endereco endereco;
    private Contato contato;

    public Pessoa(String nome, Data datanasc, Endereco endereco, Contato contato) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Pessoa [contato=" + contato + ", datanasc=" + datanasc + ", endereco=" + endereco + ", nome=" + nome
                + "]";
    }
}