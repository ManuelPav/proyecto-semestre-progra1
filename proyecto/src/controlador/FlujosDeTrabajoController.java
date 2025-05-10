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
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class FlujosDeTrabajoController implements Initializable {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtReglas;
    @FXML
    private TextArea txtAccionesAutomaticas;
    @FXML
    private TextField txtTransciciones;
    @FXML
    private TextField txtEstados;
    @FXML
    private TableView<?> table;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirEstados(ActionEvent event) {
    }

    @FXML
    private void abrirTransciciones(ActionEvent event) {
    }

    @FXML
    private void abrirGuardar(ActionEvent event) {
    }

    @FXML
    private void abrirCancelar(ActionEvent event) {
    }
    
}
