/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Compte;
import models.Partenaire;
import services.Transaction;


/**
 *
 * @author DANY
 */
public class AddCompteController implements Initializable {
    
    
    @FXML
    private TextField txtNci;
    
    private Transaction service;
    @FXML
    private TextField txtNomPrenom;
    @FXML
    private TextField txtTel;
    @FXML
    private TextField txtAdresse;
    @FXML
    private TextField txtLogin;
    @FXML
   
    private TextField txtSolde;
    Partenaire part;
    
    @FXML
    private PasswordField txtPwd;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        service=new Transaction();
        
    }    

    @FXML
    private void handleSearchPartenaire(ActionEvent event) {
        String nci=txtNci.getText();
        this.part=service.getPartenaireByNci(nci);
        if (oblComptes.size()>0)oblComptes.clear();
        
        if(part!=null){
            txtNomPrenom.setText(part.getNomComplet());
            txtAdresse.setText(part.getAdresse());
            txtTel.setText(part.getTel());
            txtLogin.setText(part.getLogin());
            txtPwd.setText(part.getPwd());
            this.activeOrDisableFields(true);
            List<Compte> comptes=service.getComptesByPartenaire();
            oblComptes=FXCollections.observableArrayList(comptes);
            this loadTableView();
            
         }else{
            this.activeOrDisableFields(false);
            this.clearFields();
        }
    }
    
    public void activeOrDisableFields(boolean etat){
            txtNomPrenom.setDisable(etat);
            txtAdresse.setDisable(etat);
            txtTel.setDisable(etat);
            txtLogin.setDisable(etat);
            txtPwd.setDisable(etat);
        
        
    }
    
    
    public void clearFields(){
            txtNomPrenom.clear();
            txtAdresse.clear();
            txtTel.clear();
            txtLogin.clear();
            txtPwd.clear();
        
        
    }

    private void handleCreateCompte(ActionEvent event, String nci) {
        double solde=Double.parseDouble(txtSolde.getText());
        if(part==null){
            String nomComplet=txtNomPrenom.getText();
            String Adresse=txtAdresse.getText();
            String Tel=txtTel.getText();
            String Login=txtLogin.getText();
            String Pwd=txtPwd.getText();
            part=new Partenaire(nci,nomComplet,Adresse,Tel,Login,Pwd);
        }
        
  Compte compte = new Compte("xxx2",solde,part);
  service.addCompteTransaction(compte);
  //this loadTableView();
  oblComptes.add(compte);  
    }

    @FXML
    private void handleCreateCompte(ActionEvent event) {
    }
    
    
    
    
    
}
