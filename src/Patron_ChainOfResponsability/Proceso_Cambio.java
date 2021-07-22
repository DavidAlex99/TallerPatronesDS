/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_ChainOfResponsability;

/**
 *
 * @author alexx
 */
public abstract class Proceso_Cambio {
    protected Proceso_Cambio siguiente;
    
    //este metodo me permite ir a la siguiente fase (personal) cuando se complete la condicional
    public void setSiguienteFase(Proceso_Cambio siguiente){
        this.siguiente = siguiente;
    }
    
    public abstract void MakeChange(Producto_Cambio produto);
}
