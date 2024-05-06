/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import metodos.Pila;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipalTP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main del proyecto
        Pila pila1=Pila.pilaVacia();
        System.out.println(pila1.esPilaVacia());
        
        pila1.push(4);
        pila1.push(53);
        pila1.push("Hola");
        pila1.push("HOLA");
        pila1.push("adios");
        pila1.push('c');
        pila1.push(245.33);
        
        pila1.mostrarPila();
        
        System.out.println("\nELEMENTO DEL TOPE:"+pila1.top()+"\n");
        System.out.println("\nELEMENTO DEL FONDO:"+pila1.fondo()+"\n");
        pila1.pop();
        
        System.out.println("PILA DESPUES DE HACER UN POP");
        pila1.mostrarPila();
        System.out.println("\nELEMENTO DEL TOPE:"+pila1.top()+"\n");
        
        System.out.println("\nELEMENTO DEL FONDO:"+pila1.fondo()+"\n");
        
    }
    
}
