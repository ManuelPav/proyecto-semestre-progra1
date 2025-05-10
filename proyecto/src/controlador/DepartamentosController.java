package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class DepartamentosController implements Initializable {

    @FXML
    private TableView<?> tb;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextArea txaDescripcion;
    @FXML
    private ListView<?> listIntegrantes;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void agregarDepartamento(ActionEvent event) {
    }

    @FXML
    private void verEliminar(ActionEvent event) {
    }

    @FXML
    private void verGuardar(ActionEvent event) {
    }

    @FXML
    private void verIntegrante(ActionEvent event) {
    }

    @FXML
    private void verIntegranteAgregado(ActionEvent event) {
    }
    
}
