package org.example.view;

import java.util.Scanner;

public class Menu extends App{

    @Override
    public void body(){
        int opcao = Integer.parseInt(input("""
                1- Cadastrar Novo Usuário
                2- Sair
                3- Logout
                
                :\s"""));

        /*
        Enunciado Pede Sair como Opção 2
         */

        switch (opcao){
            case 1 -> {
                this.mainLoop(false);
                Cadastrar cadastrar = new Cadastrar();
                cadastrar.setTitle("Cadastrar Novo Usuário");
                cadastrar.mainLoop(true);
            }

            case 2 -> {
                System.exit(0);
            }

            case 3 -> {
                this.mainLoop(false);
                Login login = new Login();
                login.setTitle("Login");
                login.mainLoop(true);
            }

            default -> {
                System.out.println("Opção Inválida");
            }
        }
    }
}
