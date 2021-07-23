/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_ChainOfResponsability;

import java.util.Date;

/**
 *
 * @author alexx
 */
public class Producto_Cambio {
    //nombre del producto a devolver
    protected String nombre;
    //nombre del producto a devolver
    protected int valor_Producto;
    //tal como el nombre lo indica, son los dias que fueron usados el producto
    protected int Dias_Usados;
    //desxcrripcion de la falla
    protected String Descripcion_Falla;
    
    
    
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
    
    public int getDias(){
        return Dias_Usados;
    }
    
    public void setDias(int Dias_Usados){
        this.Dias_Usados = Dias_Usados;
    }
    
    public String getDescripcion_Falla(){
        return Descripcion_Falla;
    }
    
    public void setDescripcion_Falla(String Descripcion_Falla){
        this.Descripcion_Falla = Descripcion_Falla;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(int Dias_Usados){
        this.nombre = nombre;
    }
}
