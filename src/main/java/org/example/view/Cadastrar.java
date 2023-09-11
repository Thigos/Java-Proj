package org.example.view;

import org.example.controller.UsuarioController;

import java.util.concurrent.TimeUnit;

public class Cadastrar extends App{

    @Override
    public void body() throws InterruptedException {
        UsuarioController usuarioController = new UsuarioController();

        String nome = input("Digite o Nome do Novo Usuário: ");
        String senha = input("Digite a Senha: ");

        UsuarioController.cadastrarUsuario(nome, senha);

        System.out.printf("""
                
                Usuário Cadastrado!
                
                Lista de Usuários no sistema:
                %s
                """, usuarioController.listarUsuarios());

        TimeUnit.SECONDS.sleep(1);

        this.mainLoop(false);
        Menu menu = new Menu();
        menu.setTitle("Menu");
        menu.mainLoop(true);
    }
}
