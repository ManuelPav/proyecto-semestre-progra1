
package main;

import controlador.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;
import logica.Rol;

public class Main extends Application{
    
    LoginController log = new LoginController(); 
    
    public static void main(String[] args){
          launch(args);
      }

    @Override
    public void start(Stage primaryStage) throws Exception {
        log.abrirVentana();
    }
    
    
    
}

