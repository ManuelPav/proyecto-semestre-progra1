/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class InicioController implements Initializable {

    Stage inicioStage = new Stage();
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    public void mostrarVentana(){
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/vista/Inicio.fxml"));
            inicioStage.setScene(new Scene(root));
            inicioStage.show();
        } catch (IOException ex) {
            System.out.println("no se pudo ver la ventana");
        }
        
    }
    
    @FXML
    private void tickets(ActionEvent event) {
       fxmlLoad fxml = new fxmlLoad();
       Pane ventana = fxml.getPane("Tickets");
       bp.setCenter(ventana);
    }

    @FXML
    private void usuario(ActionEvent event) {
       fxmlLoad fxml = new fxmlLoad();
       Pane ventana = fxml.getPane("Usuarios");
       bp.setCenter(ventana);
    }

    @FXML
    private void departamentos(ActionEvent event) {
       fxmlLoad fxml = new fxmlLoad();
       Pane ventana = fxml.getPane("Departamentos");
       bp.setCenter(ventana);
    }

    @FXML
    private void flujoDeTrabajo(ActionEvent event) {
       fxmlLoad fxml = new fxmlLoad();
       Pane ventana = fxml.getPane("FlujosDeTrabajo");
       bp.setCenter(ventana);
    }

    @FXML
    private void configuracion(ActionEvent event) {
       fxmlLoad fxml = new fxmlLoad();
       Pane ventana = fxml.getPane("Configuracion");
       bp.setCenter(ventana);
    }

    @FXML
    private void inicio(ActionEvent event) {
       bp.setCenter(ap);
    }

    @FXML
    private void crearTicket(ActionEvent event) {
    }

    @FXML
    private void verTickets(ActionEvent event) {
        fxmlLoad fxml = new fxmlLoad();
        Pane ventana = fxml.getPane("Tickets");
        bp.setCenter(ventana);
    }
}
