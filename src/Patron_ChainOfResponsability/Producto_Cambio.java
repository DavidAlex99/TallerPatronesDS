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
public class Producto_Cambio {
    //nombre del producto a devolver
    protected int valor_Producto;
    
    public Producto_Cambio(int valor_Producto){
        super();
        this.valor_Producto = valor_Producto;
    } 
    
    public int getValor(){
        return valor_Producto;
    }
    
    public void setValor(int valor_Producto){
        this.valor_Producto = valor_Producto;
    }
}
