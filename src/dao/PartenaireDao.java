/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.Partenaire;

/**
 *
 * @author DANY
 */
//Classe D'implémentation
public class PartenaireDao implements IDao<Partenaire> {
    
       private List<Partenaire> tablePartenaire;
       
       public PartenaireDao(){
            this.tablePartenaire=new ArrayList<>(
                    Arrays.asList(
                    new Partenaire("xxx","admin","admin","admin",0,"admin","admin"),
                    new Partenaire("xxx1","admin1","admin1","admin1",0,"admin1","admin1")
                    
                    )
                                      
                 );
            
                 
       }

    @Override
    public Partenaire add(Partenaire partenaire) {
        //Generer L'ID
       this.tablePartenaire.add(partenaire);
       return partenaire;
    }

    @Override
    public List<Partenaire> selectAll() {
       return this.tablePartenaire;
    }
       
       
    
    
}
