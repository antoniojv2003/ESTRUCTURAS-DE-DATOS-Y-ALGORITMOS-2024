/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import listaenlazada.ListaEnlazada;
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

        //CONTROL PARA EL PUNTO 2
        ListaEnlazada L1=ListaEnlazada.crearLista(); //creo una lista
        System.out.println("\n\nELEMENTOS DE LA LISTA");
        L1.InsertarAlFinal(0);
        L1.InsertarAlFinal(2);
        L1.InsertarAlFinal(3);
        L1.InsertarAlInicio(100);
        L1.mostrar(); //MÉTODO CHEQUEADO
        
        System.out.println("SUMA DE LOS ENTEROS DE LA LISTA QUE SUPEREN AL VALOR DE UMBRAL");
        System.out.println(L1.sumaEnteros(0));
        
//        String str=new String(); PRUEBAS CON STRING
//        str="Hola"; 
//        System.out.println(str);
//        
//        for(int i=0;i<str.length();i++) //RECORRER UN STRING CARACTER A CARACTER
//        {
//            System.out.println(str.charAt(i));
//        }

    
        
        
        
        
    }
    
}
