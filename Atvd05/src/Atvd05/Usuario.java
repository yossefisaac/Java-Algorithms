package Atvd05;

public class Usuario {
     String login, senha; //Ap�s colocar como privado o codigo hacker n�o consegue acessar.
     
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    void mostrarUsuario(){ //Ap�s colocar como privado o codigo hacker n�o consegue acessar.
        System.out.printf("Usuario: " + this.login +  " Senha: " + this.senha);
    }
}
