/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import adtfila.Fila;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //MAIN PARA EL TP6
        
        Fila fila1=Fila.filaVacia(); //creacion de una fila de prueba
        
        System.out.println(fila1.esFilaVacia()); //prueba del metodo esFilaVacia para una fila vacia
        fila1.mostrarFila(); //prueba de mostrarFila para una fila Vacia
        
        int item1=1,item2=2,item3=3,item4=4,item5=5,item6=6,item7=7,item14=14; //defino una serie de items para hacer pruebas
        
        fila1.enfila(item1);
        fila1.enfila(item2);
        fila1.enfila(item3);
        fila1.enfila(item4);
        System.out.println(fila1.esFilaVacia());//prueba de esFilaVacia con una fila NO vacia
        System.out.println("\nELEMENTOS DE LA FILA 1");
        fila1.mostrarFila(); //prueba de mostrarFila para una fila NO vacia
        System.out.println("Longitud:"+fila1.longitud());
        System.out.println("Frente:"+fila1.frente());
        fila1.defila(); //prueba del método defila
        fila1.defila();
        System.out.println("\nELEMENTOS DE LA FILA1 DESPUES DE DEFILAR");
        fila1.mostrarFila();
        System.out.println("Longitud:"+fila1.longitud());
        System.out.println("Frente:"+fila1.frente());
        
    }
    
}
