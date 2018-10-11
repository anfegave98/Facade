/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class feo implements interfaces {

    @Override
    public void add(Object o) {
        try {
           Model.Store c = (Model.Store) o;
            Dao.StoreDAO cd = new Dao.StoreDAO("quiz");
            cd.createStore(c);
                    
        } catch (SQLException | URISyntaxException | ClassNotFoundException | IOException ex) {
            Logger.getLogger(feo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
