/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import adtabb.ABB;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipalABB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ABB abb1=ABB.ABBVacio();
        System.out.println("Es vacio:"+abb1.esABBVacio()); //chequeo que sea vacio
        abb1=ABB.insertar(abb1, 5);
        abb1=ABB.insertar(abb1, 2);
        abb1=ABB.insertar(abb1, 3);
        abb1=ABB.insertar(abb1, 9);
        abb1=ABB.insertar(abb1, 1);
        System.out.println("Es vacio:"+abb1.esABBVacio());
        System.out.println("\n\nRECORRIDO EN PREORDEN:");
        abb1.preOrden(); //chequeado el insertar
        
        //operacion de busqueda
        abb1.buscar(2); //debe darlo por encontrado
        abb1.buscar(1000);//debe devolver null y decir que no se encontró
    }
    
}
