package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class DepartamentosController implements Initializable {

    Stage s = new Stage();
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
    private void verGuardar(ActionEvent event)  {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vista/VerificacionGuardar.fxml"));
            
            s.setScene(new Scene (root));
            s.show();
    
        } catch (IOException e){
            JOptionPane.showMessageDialog(null, "no se pudo realizar la accion");
        } catch (RuntimeException ex){
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion");
        }
    }
    @FXML
    private void verIntegrante(ActionEvent event) {
    }

    @FXML
    private void verIntegranteAgregado(ActionEvent event) {
    }
    
    
}
