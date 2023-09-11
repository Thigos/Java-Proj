package org.example.controller;

import org.example.model.Usuario;

import java.util.ArrayList;

public class UsuarioController {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    public boolean auth(String nome, String senha){
        for (Usuario usuario : listaUsuarios){
            if (nome.equals(usuario.getNome()) && senha.equals(usuario.getSenha())){
                return true;
            }
        }

        return false;
    }

    public String listarUsuarios(){
        String lista = "";

        for (Usuario usuario : listaUsuarios){
            lista += """
                    _______________
                    Nome: %s
                    """.formatted(usuario.getNome());
        }

        lista += "_______________";

        return lista;
    }

    public static void cadastrarUsuario(String nome, String senha){
        listaUsuarios.add(new Usuario(nome, senha));
    }
}
