package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import logica.Rol;
import logica.Visitante;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class UsuarioController implements Initializable {

    @FXML
    private Button btnEliminarUsuario;
    @FXML
    private Button btnAgregarUsuario;
    @FXML
    private TextField txtNumIdentificacion;
    @FXML
    private TextField txtIdentificacion;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtContrasenia;
    @FXML
    private TextField txtRol;
    @FXML
    private TextField txtCodigo;
    @FXML
    private TableView<Visitante> tabela;
    @FXML
    private TableColumn<Visitante, String> nombre;
    @FXML
    private TableColumn<Visitante, String> nombreUsuario;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void confimarEliminacion(ActionEvent event) {
    }

    @FXML
    private void confirmarAgregar(ActionEvent event) {

        Stage s = new Stage();

        try {

            Parent root = FXMLLoader.load(getClass().getResource("/vista/VerificacionGuardar.fxml"));

            s.setScene(new Scene(root));
            s.show();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "no se pudo realizar la accion");
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la accion");
        }

    }

}
