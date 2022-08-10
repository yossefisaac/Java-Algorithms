package Atvd05;

public class Hacker {
    public static void main(String[]args){
        Usuario usuario = new Usuario("usuario@gmail.com", "123456");
        usuario.senha = "654321";
        usuario.mostrarUsuario();
    }
}
