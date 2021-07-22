/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patron_ChainOfResponsability;

import java.util.ArrayList;

/**
 *
 * @author alexx
 */
public class Jefe_Inv_Departamento extends Proceso_Cambio{
    //este es el tercer filtro
    //el jefe de inventario debe certificar la existencia del producto en bodega para reposición
    private ArrayList<String> inventario = new ArrayList<>();
    
    @Override
    public void MakeChange(Producto_Cambio producto) {
        if(producto != null){
            String nombrep = producto.getNombre();
            for(int i=0; i<inventario.size(); i++){
                if(inventario.get(i).equalsIgnoreCase(nombrep)){
                System.out.println("Si hay el producto en el inventario");
                this.siguiente.MakeChange(producto);
                }else{
                    System.out.println("No se encuentra este producto en inventario");
                }
            }
        }
    }
}

