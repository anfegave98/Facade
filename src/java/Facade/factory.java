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
public class factory {
    public static interfaces getFacade(String tipo){
        if(tipo.equalsIgnoreCase("jpa")){
            return new jpa();
        }else{
            return new feo();
        }
    }
}
