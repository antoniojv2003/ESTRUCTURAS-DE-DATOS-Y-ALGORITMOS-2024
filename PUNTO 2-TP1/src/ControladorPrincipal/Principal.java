/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorPrincipal;

import PaqueteListaEnlazada.ListaEnlazada;

/**
 *
 * @author Usuario
 */
public class Principal { //clase con el método main
    public static void main(String[] args) {
        //pruebas para la clase lista
//        ListaEnlazada listaEnlazada1=ListaEnlazada.crearLista();
//        System.out.println("Cantidad de elementos en la lista:");
//        System.out.println(listaEnlazada1.cantidad());
//        listaEnlazada1.InsertarAlInicio(2);
//        System.out.println(listaEnlazada1.esVacia()); //funciona
//        
//        listaEnlazada1.mostrar(); //funciona
//        
//        listaEnlazada1.InsertarAlInicio(4);
//        System.out.println("El listado de elementos nos queda asi despues de agregar el 4 al inicio");
//        listaEnlazada1.mostrar();
//        System.out.println("Cantidad de elementos en la lista:");
//        System.out.println(listaEnlazada1.cantidad());
//        listaEnlazada1.InsertarAlInicio(9);
//        System.out.println("El listado de elementos nos queda asi despues de agregar el 9 al inicio");
//        listaEnlazada1.mostrar();
//        System.out.println("Cantidad de elementos en la lista:");
//        System.out.println(listaEnlazada1.cantidad());        
//        listaEnlazada1.InsertarAlFinal(1);
//        System.out.println("El listado de elementos nos queda asi despues de agregar el 1 al final");
//        listaEnlazada1.mostrar();       
//        
//        System.out.println("Cantidad de elementos en la lista:");
//        System.out.println(listaEnlazada1.cantidad());
//        
//        listaEnlazada1.InsertarAlFinal(13432);
//        System.out.println("El listado de elementos nos queda asi despues de agregar el 13432 al final");
//        listaEnlazada1.mostrar(); 
//        System.out.println("Cantidad de elementos en la lista:");
//        System.out.println(listaEnlazada1.cantidad());
//        
//        System.out.println("Asi queda la lista si borramos el primer elemento:");
//        listaEnlazada1.borrarPrimero();
//        listaEnlazada1.mostrar();
//        
//        System.out.println("Asi queda la lista si borramos el ultimo nodo");
//        listaEnlazada1.borrarUltimo();
//        listaEnlazada1.mostrar();
//        
//        System.out.println(listaEnlazada1.pertenece(0)); //vemos si pertenece el 0
//        System.out.println(listaEnlazada1.pertenece(1)); //vemos si pertenece el 1
//        System.out.println(listaEnlazada1.pertenece(4)); //vemos si pertenece el 4
//        System.out.println(listaEnlazada1.pertenece(2)); //vemos si pertenece el 2
//        
//        listaEnlazada1.InsertarAlFinal(3);
//        listaEnlazada1.InsertarAlFinal(3);
//        listaEnlazada1.InsertarAlFinal(11);
//        listaEnlazada1.InsertarAlFinal(3);
//        
//        listaEnlazada1.mostrar();
//        listaEnlazada1.borrarConValor(3);
//        listaEnlazada1.mostrar();
//        
//        System.out.println("El valor en la posicion tal es "+listaEnlazada1.dameValorEnPosicion(4));
//        
//        listaEnlazada1.modificarValorEnPosicion(5, 4);
//        System.out.println("Lista luego de modificar el elemento en la posicion 2");
//        listaEnlazada1.mostrar();
//        
//        listaEnlazada1.insertarEnPosicion(534, 4);
//        System.out.println("Lista luego de insertar el valor 534 en la posicion 3");
//        listaEnlazada1.mostrar();
        
        //PRUEBAS CON UNA SEGUNDA LISTA
        ListaEnlazada lista2=ListaEnlazada.crearLista(); 
        System.out.println(lista2.esVacia());
        System.out.println(lista2.cantidad());
        lista2.mostrar();
        lista2.insertarEnPosicion(1, 1);
        lista2.mostrar();
        lista2.insertarEnPosicion(2,2);
        lista2.mostrar();
        lista2.insertarEnPosicion(5, 2);
        lista2.mostrar();
        lista2.insertarEnPosicion(8, 3);
        lista2.mostrar();      
        
        lista2.insertarEnPosicion(7, 4);
        lista2.mostrar();  
        
        lista2.insertarEnPosicion(8, 1);
        lista2.mostrar();      


        
        
        
    }
    
}
