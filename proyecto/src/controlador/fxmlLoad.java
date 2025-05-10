/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.net.URL;
import javafx.scene.layout.Pane;
import main.Main;
import javafx.fxml.FXMLLoader;

public class fxmlLoad {
    private Pane ventana;
    
    public Pane getPane(String archivo){
        
        try{
            URL files = Main.class.getResource("/vista/"+archivo+".fxml");
            if (files == null){
                throw new java.io.FileNotFoundException("el archivo no fue encontrado");
            }
            
            ventana = new FXMLLoader().load(files);
            
        } catch(Exception e){
            System.out.println("no se pudo visualizar la ventana");
        }
        
        return ventana;
    };
    
}
