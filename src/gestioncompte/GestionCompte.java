/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncompte;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author DANY
 */
public class GestionCompte extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../views/addCompte.fxml"));
        
        
        
        Scene scene = new Scene(root);
        stage.setTitle("Transfert Argent");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        //1-Ajouter Driver
        //2- Connexion à la BD
        //3- Ecrire les requetes et Executer les Requetes
        //4 - Recuperer le resultat
        //NB : Entre 2 requetes les parties
        //3 et 4 qui peuvent changer
    }
    
}
