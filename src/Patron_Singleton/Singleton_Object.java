/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_Singleton;

/**
 *
 * @author alexx
 */

public class Singleton_Object {
    private static Singleton_Object instancia = new Singleton_Object();
            
    public static Singleton_Object getInstance(){
        return instancia;
    }
    
}
