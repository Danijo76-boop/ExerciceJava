/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import models.Compte;

/**
 *
 * @author DANY
 */
public interface IDao <T> {
    public T add(T object);
    public List<T> selectAll();
    
    
    
    
}
