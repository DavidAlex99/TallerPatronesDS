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
public class Gerencia_Departamento extends Proceso_Cambio{
    //Si el precio de venta de producto supera los 
    //1000 USD, se requiere además la aprobación del gerente de la tienda
    @Override
    public void MakeChange(Producto_Cambio producto) {
        if(producto != null){
            int valor = producto.getValor();
            if(valor > 1000){
                System.out.println("No se puede hacer el reemboloso, pues se supera los $1000");
            }else{
                System.out.println("Se realiza el cambio");
            }
        }
    }
    
}
