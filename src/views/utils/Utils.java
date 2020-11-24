/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.utils;

import java.util.Observable;
import javafx.collections.ObservableList;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Compte;
import models.Partenaire;
import services.Transaction;

/**
 *
 * @author DANY
 */
public class Utils {
    
    public void  searchPartenaire(
            TextField txtNci,
            TextField txtNomPrenom,
            TextField txtAdresse,
            TextField txtTel,
            TextField txtLogin,
            PasswordField txtPwd,
            Partenaire part,
            Transaction service,
            ObservableList oblComptes){
        
         String nci=txtNci.getText();
        part=service.getPartenaireByNci(nci);
        if(oblComptes=!null)oblComptes.clear();
        
        if(part!=null){
            txtNomPrenom.setText(part.getNomComplet());
            txtAdresse.setText(part.getAdresse());
            txtTel.setText(part.getTel());
            txtLogin.setText(part.getLogin());
            txtPwd.setText(part.getPwd());
            
         }else{
            this.activeOrDisableFields(true);
            this.clearFields();
        }
    }
    
       
     public void activeOrDisableFields(boolean etat,
             TextField txtNci,
            TextField txtNomPrenom,
            TextField txtAdresse,
            TextField txtTel,
            TextField txtLogin,
            PasswordField txtPwd){
            txtNomPrenom.setDisable(etat);
            txtAdresse.setDisable(etat);
            txtTel.setDisable(etat);
            txtLogin.setDisable(etat);
            txtPwd.setDisable(etat);
        
        
    }
    
    
    public void clearFields(
            TextField txtNci,
            TextField txtNomPrenom,
            TextField txtAdresse,
            TextField txtTel,
            TextField txtLogin,
            PasswordField txtPwd){
            txtNomPrenom.clear();
            txtAdresse.clear();
            txtTel.clear();
            txtLogin.clear();
            txtPwd.clear();
        
        
    }
    
    
    public void loadTableView(TableView<Compte>tblVComptes,
            TableColumn<Compte,String>tblcNumero,
            TableColumn<Compte,String>tblcSolde,
            ObservableList oblComptes){
        tblcNumero.setCellValueFactory(new PropertyValueFactory<>);
        tblcSolde.setCellValueFactory(new PropertyValueFactory<>);
        //Souscrire
        tblvComptes.setItems(oblComptes);
    }
    
    
    
}
