
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Manuel
 */
public class LoginController implements Initializable {

    @FXML
    private Label hola;
    @FXML
    private PasswordField txtContra;
    @FXML
    private TextField txtUsuario;
    @FXML
    private Button btnIngresar;
 
    private Stage stage;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void enviar(MouseEvent event) throws IOException {
     
    }

    @FXML
    private void showInicio(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Inicio.fxml"));
        Parent root = loader.load();
        Scene scene= new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        this.stage.close();
        
    }

    public void setScene(Stage primaryStage) {
            stage = primaryStage;
    }
    
}
