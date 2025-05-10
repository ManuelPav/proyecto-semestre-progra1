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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class ConfiguracionController implements Initializable {

    @FXML
    private TextField txtNombreEmpresa;
    @FXML
    private TextField txtLogotipo;
    @FXML
    private TextField txtIdioma;
    @FXML
    private TextField txtZonaHoraria;
    @FXML
    private TextField txtTiempoVencimiento;
    @FXML
    private TextField hbxNivelPrioridad;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guardarCambios(ActionEvent event) {
    }

    @FXML
    private void cancelarCambios(ActionEvent event) {
    }

    @FXML
    private void verNiveles(ActionEvent event) {
    }
    
}
