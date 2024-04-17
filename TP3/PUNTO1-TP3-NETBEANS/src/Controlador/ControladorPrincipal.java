/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import ListaEnlazadaTP3.ListaEnlazada3;


/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {
    public static void main(String[] args) {
        
//        //PRUEBAS PARA EL PUNTO 1
//        int[] vector={1,3,5,6};
//        
//        System.out.println(metodosRecurs.buscarElemento(vector,5,0));

        //PRUEBAS PARA EL PUNTO 2
        
        ListaEnlazada3 lista1=ListaEnlazada3.crearLista(); //creo la lista
        System.out.println(lista1.esVacia());
        lista1.InsertarAlFinal(3);
        lista1.InsertarAlFinal(5);
        lista1.InsertarAlFinal(10);
        lista1.InsertarAlFinal(0);
//        System.out.println(lista1.esVacia());
//        
//        System.out.println("ELEMENTOS DE LA LISTA");
//        ListaEnlazada3.mostrar(lista1); //COMENTO ESTA PARTE PARA PROBAR EL OTRO METODO POR SEPARADO SINO ME VACIA LA LISTA
        
        //PRUEBA PARA EL PUNTO 3 
        System.out.println("SUMA USANDO LA FUNCION SUMA ENTEROS");
        
        System.out.println(lista1.esVacia());
        System.out.println(ListaEnlazada3.sumaEnteros(lista1, 3));
        
        
        
        
        
        
    }
    
}
