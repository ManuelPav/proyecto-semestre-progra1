
package main;

import controlador.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader  loader= new FXMLLoader(getClass().getResource("/vista/Login.fxml"));
        
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        LoginController controller = loader.getController();
        controller.setScene(primaryStage);
        primaryStage.setTitle("Iniciar Sesión");
        primaryStage.show();
        }
    
    public static void main(String[] args) {
        launch(args);
    }
}
