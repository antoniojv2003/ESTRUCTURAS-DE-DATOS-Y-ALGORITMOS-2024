/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import metodos.Punto1;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //método main del proyecto: servirá para ejecutar las pruebas para los métodos
        int[] A={1,3,4,10,2}; //defino un arreglo de enteros 
       
        //muestra de los elementos del arreglo
        System.out.println("ELEMENTOS DEL ARREGLO");
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        
//        System.out.println("POSICION DEL ELEMENTO BUSCADO");
//        System.out.println(Punto1.busquedaArreglo(A, A.length-1, 2));  METODO CHEQUEADO CORRECTAMENTE


        
        
    }
    
}
