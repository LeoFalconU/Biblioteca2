package com.example.bibliotecados.InicioSesion;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionController {
    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPassword;
    @FXML
    private Label lblMessage;

    private InicioSesionModel userModel = new InicioSesionModel();

    @FXML
    public void onClickLogin(){
        String usuario = txtUser.getText();
        String password = txtPassword.getText();

        if (usuario.isEmpty() || password.isEmpty()){
            lblMessage.setText("Llena todos los campos");
            return;
        }

        boolean valido = userModel.validarUsuario(usuario, password);
        if (valido) {
            lblMessage.setText("Bienvenido "+usuario);
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setTitle("Segunda Ventana");
                stage.setScene(new Scene(root));
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            lblMessage.setText("Datos incorrectos");
        }
    }
}
