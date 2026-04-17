package com.example.bibliotecados.InicioSesion;

public class InicioSesionModel {
    private final String UsuarioCorrecto="admin";
    private final String Usuario_Password="1234";

    public boolean validarUsuario(String usuario, String password){
        return usuario.equals(UsuarioCorrecto) && Usuario_Password.equals("1234");
    }
}
