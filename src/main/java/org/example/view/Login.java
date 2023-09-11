package org.example.view;

import org.example.controller.UsuarioController;

import java.util.Scanner;

public class Login extends App {
    @Override
    public void body(){
        UsuarioController usuarioController = new UsuarioController();

        String nome = input("Digite o Nome de Usuário: "); //ADM
        String senha = input("Digite a Senha: "); //adm123

        boolean isAuth = usuarioController.auth(nome, senha);

        if(!isAuth){
            System.out.println("Usuário ou Senha Incorretos \n");
        }else {
            this.mainLoop(false);
            Menu menu = new Menu();
            menu.setTitle("Menu");
            menu.mainLoop(true);
        }
    }
}
