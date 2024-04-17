/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Usuario
 */
public class metodosRecurs {
    
    //PUNTO 1
    public static int buscarElemento(int[] arreglo, int elemento, int Primerindice) {
        // Caso base: si el índice es igual al tamaño del arreglo, significa que no se encontró el elemento
        if (Primerindice == arreglo.length) {
            return -1;
        }

        // Si el elemento en la posición actual es igual al elemento buscado, retornamos el índice actual
        if (arreglo[Primerindice] == elemento) {
            return Primerindice;
        }

        // Llamada recursiva para buscar en el resto del arreglo
        return buscarElemento(arreglo, elemento, Primerindice + 1);
    }
    
     
    
}
