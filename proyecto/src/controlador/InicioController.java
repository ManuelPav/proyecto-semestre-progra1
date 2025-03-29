/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class InicioController implements Initializable {

    @FXML
    private BorderPane bp;
    @FXML
    private Pane pane;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inicio(MouseEvent event) {
        bp.setCenter(pane);
    }

    @FXML
    private void tickets(MouseEvent event) throws Exception {
        loadPage("Ticket");
    }

    @FXML
    private void configuracion(MouseEvent event) throws Exception {
        loadPage("Configuracion");
    }
    
    private void loadPage(String page) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        
        bp.setCenter(root);
    }
    
}
