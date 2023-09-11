package org.example;

import org.example.controller.UsuarioController;
import org.example.model.Usuario;
import org.example.view.Cadastrar;
import org.example.view.Login;
import org.example.view.Menu;

public class Main {

    public static void main(String[] args) {
        UsuarioController.cadastrarUsuario("ADM", "adm123");
        UsuarioController.cadastrarUsuario("Teste", "teste");
        UsuarioController.cadastrarUsuario("admin", "admin");

        Login login = new Login();
        login.setTitle("Login");
        login.mainLoop(true);
    }
}