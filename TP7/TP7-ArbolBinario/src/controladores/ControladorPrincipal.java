/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import arbolbinarioadt.ArbolBinario;



/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //funcion main para pruebas
        ArbolBinario T0=ArbolBinario.arbolVacio();
        System.out.println(T0.esABVacio()); //prueba del esABVacio
        
        //Armado de un arbol (de abajo hacia arriba)
        ArbolBinario T1=ArbolBinario.armarAB(ArbolBinario.arbolVacio(), 1, ArbolBinario.arbolVacio());
        ArbolBinario T2=ArbolBinario.armarAB(ArbolBinario.arbolVacio(),2, ArbolBinario.arbolVacio());
        ArbolBinario T3=ArbolBinario.armarAB(T1, 3, T2); 
        ArbolBinario T4=ArbolBinario.armarAB(ArbolBinario.arbolVacio(), 4, ArbolBinario.arbolVacio()); 
        ArbolBinario T5=ArbolBinario.armarAB(T3, 5, T4);
        
        System.out.println(T5.esABVacio());
        
        System.out.println("\nORDEN SIMETRICO");
        T5.ordenSimetrico(); 
        System.out.println("\n\n");
        
        System.out.println("PREORDEN");
        T5.preOrden();
        System.out.println("\n\n");
        
        System.out.println("POSORDEN");
        T5.posOrden();
        
        //prueba del metodo pertenece
        System.out.println("\n\nMETODO PERTENECE PRUEBAS:");
        System.out.println(T5.pertenece(6));
        System.out.println(T5.pertenece(7));
        System.out.println(T5.pertenece(1));
        System.out.println(T5.pertenece(3));
        System.out.println(T5.pertenece(5));
        System.out.println(T5.pertenece(9));
        //MÉTODOS DEL ADT CHEQUEADOS, FUNCIONAN CORRECTAMENTE
    }
    
}
