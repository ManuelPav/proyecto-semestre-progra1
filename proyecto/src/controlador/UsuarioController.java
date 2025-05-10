/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import logica.Rol;
import logica.Usuario;

/**
 * FXML Controller class
 *
 * @author manue
 */
public class UsuarioController implements Initializable {
    
    Rol admin = new Rol("Administrador", "administra cosas");
    Rol tec = new Rol("Tecnico", "Mas bajo que un admin");
    Rol usu = new Rol("Usuario", "Lo normal");

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
    private Button btnGuardar;
    @FXML
    private TableView<Usuario> tabela;
    @FXML
    private TableColumn<Usuario, String> nombre;
    @FXML
    private TableColumn<Usuario, String> nombreUsuario;

    ObservableList<Usuario> inicialData(){
        Usuario u1 = new Usuario("Manuel", "ManuelPav", "manuelmansilla987@gmail.com", "Benja12", admin);
        Usuario u2 = new Usuario("Benjamin", "ManuelPav", "manuelmansilla987@gmail.com", "Benja12", tec);
        Usuario u3 = new Usuario("Mansilla", "ManuelPav", "manuelmansilla987@gmail.com", "Benja12", usu);
        Usuario u4 = new Usuario("Estada", "ManuelPav", "manuelmansilla987@gmail.com", "Benja12", tec);
        Usuario u5 = new Usuario("Aura", "ManuelPav", "manuelmansilla987@gmail.com", "Benja12", usu);
        return FXCollections.<Usuario> observableArrayList(u1,u2,u3,u4,u5);
    };
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nombre.setCellValueFactory(new PropertyValueFactory<Usuario, String>("nombre"));
        nombreUsuario.setCellValueFactory(new PropertyValueFactory<Usuario, String>("nombreUsuario"));
        
        tabela.setItems(inicialData());
    }    

    @FXML
    private void confimarEliminacion(ActionEvent event) {
    }

    @FXML
    private void confirmarAgregar(ActionEvent event) {
    }

    @FXML
    private void confirmarEditar(ActionEvent event) {
    }
    
}
