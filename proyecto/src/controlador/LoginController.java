/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class LoginController implements Initializable {

    InicioController log = new InicioController();
    Stage loginStage = new Stage();
    
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtContrasenia;
    @FXML
    private AnchorPane loginPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    public void abrirVentana(){
        try {
          Parent root = FXMLLoader.load(getClass().getResource("/vista/Login.fxml"));
          loginStage.setScene(new Scene(root)); 
          loginStage.show();
        } catch (IOException ex) {
            System.out.println("no se pudo hacer esta mrd");
        }
    }
   
    @FXML
    private void ingresar(ActionEvent event) {
        log.mostrarVentana();
        loginStage = (Stage) loginPane.getScene().getWindow();
        loginStage.close();
    }
    
   

    
}
