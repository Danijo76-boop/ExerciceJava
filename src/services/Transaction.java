/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CompteDaoBD;
import dao.PartenaireDao;
import java.util.List;
import models.Compte;
import models.Partenaire;
import models.User;
import dao.CompteDao;
import models.Depot;


/**
 *
 * @author DANY
 */
public class Transaction {
    PartenaireDao daoPartenaire;
    CompteDao daoCompte;

    public Transaction() {
        this.daoPartenaire=new PartenaireDao();
         this.daoCompte=new CompteDao();
        
    }
    
    
    
    public Compte addCompteTransaction(Compte compte) {
        //Partenaire n'existe pas
        if(compte.getPartenaire().getId()==0){
            
            this.addComptePartenaire(compte.getPartenaire());
        }
       compte=daoCompte.add(compte);
       this.setDepot(compte, compte.getSolde());
        return compte;
    }
    public User addComptePartenaire(Partenaire partenaire) {
        return daoPartenaire.add(partenaire);
    }    
    public Compte setDepot(Compte compte, double montant) {
        Depot depot=new Depot(montant);
        compte.getDepots().add(depot);
        return compte;
    }
    
    public Partenaire getPartenaireByNci(String nci) {
      List<Partenaire> partenaires = daoPartenaire.selectAll();
      for(Partenaire part :partenaires){
          if(part.getNci().compareTo(nci)==0){
              return part;
          }
              
      }
      return null;
    }
}
