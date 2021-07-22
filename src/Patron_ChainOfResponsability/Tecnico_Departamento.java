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
public class Tecnico_Departamento extends Proceso_Cambio{
    //un miembro del departamento técnico constatar   que el tipo de fallo se encuentre dentro de lo cubierto 
    //por la garantía
    private ArrayList<String> lista_fallas = new ArrayList<>();
    //este es el segundo filtro
    @Override
    public void MakeChange(Producto_Cambio producto) {
     if(producto != null){
        String falla = producto.getDescripcion_Falla();
            //contando que todos los productos tienen un año de garantia
        for(int i=0; i<lista_fallas.size(); i++){
            if(lista_fallas.get(i) == falla){
                System.out.println("Si  entra la falla e la garantia");
                this.siguiente.MakeChange(producto);
            }else{
                System.out.println("La garantia no cubre este fallo");
            }
        }
     }
    }
}
        
        //se pasa el producto al siguiente encargado
           
            
        


