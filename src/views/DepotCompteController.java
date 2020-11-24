/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import models.Compte;
import models.Depot;

/**
 * FXML Controller class
 *
 * @author DANY
 */
public class DepotCompteController implements Initializable {

    @FXML
    private TextField txtNomPrenom;
    @FXML
    private TextField txtNci;
    @FXML
    private TextField txtTel;
    @FXML
   
    private TextField txtMnt;
    @FXML
    private TableView<Depot> tblvDepots;
    @FXML
    private TableColumn<Depot,String> tblcDate;
    @FXML
    private TableColumn<Depot, String> tblcMnt;
    @FXML
    private TableView<Compte> tblvComptes;
    @FXML
    private TableColumn<Compte, String> tblcNumero;
    @FXML
    private TableColumn<Compte, String> tblcSolde;
    @FXML
    private TextArea txtAdresse;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
