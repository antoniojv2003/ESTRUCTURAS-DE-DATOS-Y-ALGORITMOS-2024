/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import adtfila.FilaMerge;
import ordenamiento.MergeSort;

/**
 *
 * @author Usuario
 */
public class Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        FilaMerge filaParaOrdenar=FilaMerge.filaVacia();
        System.out.println("Hola");
        filaParaOrdenar.enfila(2);
        filaParaOrdenar.enfila(1);
        filaParaOrdenar.enfila(4);
        filaParaOrdenar.enfila(20);
        filaParaOrdenar.enfila(6);
        filaParaOrdenar.enfila(2);
        filaParaOrdenar.enfila(8);
        filaParaOrdenar.enfila(1000);
        filaParaOrdenar.enfila(1001);
 
        System.out.println("FILA SIN ORDENAR:");
        filaParaOrdenar.mostrarFilaMerge();
        System.out.println("Frente:"+filaParaOrdenar.frente()+"  Final:"+filaParaOrdenar.Final());
        
        FilaMerge filaOrdenada=MergeSort.MergeSort(filaParaOrdenar);
        System.out.println("\n\nFILA ORDENADA:");
        filaOrdenada.mostrarFilaMerge();
        System.out.println("Frente:"+filaOrdenada.frente()+"  Final:"+filaOrdenada.Final());
    }
    
}
