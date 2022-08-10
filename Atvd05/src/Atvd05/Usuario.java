package Atvd05;

public class Usuario {
     String login, senha; //Após colocar como privado o codigo hacker não consegue acessar.
     
    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    void mostrarUsuario(){ //Após colocar como privado o codigo hacker não consegue acessar.
        System.out.printf("Usuario: " + this.login +  " Senha: " + this.senha);
    }
}
