/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class VerificacionGuardarController implements Initializable {
    
    public boolean veri;
    Stage stage;
    @FXML
    private AnchorPane ap;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cancelar(ActionEvent event) {
      stage = (Stage) ap.getScene().getWindow();
      stage.close();
    }

    @FXML
    private void aceptar(ActionEvent event) {
      stage = (Stage) ap.getScene().getWindow();
      stage.close();
    }    
}
