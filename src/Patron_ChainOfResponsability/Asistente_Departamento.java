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
public class Asistente_Departamento extends Proceso_Cambio{

    
    //esta clase es la el primer filtro
    @Override
    public void MakeChange(Producto_Cambio producto) {
     if(producto != null){
            int dias = producto.getDias();
            
            //contando que todos los productos tienen un año de garantia
            if(dias > 365){
                System.out.println("Tiempo de garantia expirado. No se puede cambiar");
            //se pasa el producto al siguiente encargado
            }else{
                this.siguiente.MakeChange(producto);
            }   
            
        }
    }
    
    //Primero un asistente del departamento de atención al usuario debe verificar que el producto se 
    //encuentra en periodo de garantía
    
}
