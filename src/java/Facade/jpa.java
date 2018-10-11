/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Labing
 */
public class jpa implements interfaces {

    @Override
    public void add(Object o) {
    Model.Store s =(Model.Store) o;
    quiz.Store a = new quiz.Store();
    a.setStoreId(s.getStore_id());
    quiz.DAO d=new quiz.DAO();
    d.enviar(a);
    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
