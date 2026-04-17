package com.example.bibliotecados.InicioSesion;


import com.example.mvc.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class InicioSesionController {
    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPassword;
    @FXML
    private Label lblMessage;

    private UserModel userModel = new UserModel();

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
        }else {
            lblMessage.setText("Datos incorrectos");
        }
    }
}
