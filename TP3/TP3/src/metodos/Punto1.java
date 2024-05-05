/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class Punto1 { //clase con los métodos del tp1 
    //métodos static para no necesitar de una instancia de la clase para poder aplicarlos 
    
    /*CONSIGNA: 
    1) Escriba la versión recursiva del algoritmo de búsqueda secuencial en un arreglo. La búsqueda debe ser tal que:
    - devuelva la posición de la primera ocurrencia del elemento buscado en el arreglo
    - devuelva-1 si el mismo no está presente. Calcule la complejidad e implemente en Java. Compare con el algoritmo de Búsqueda Binaria dado en clase.

    */
    
    /*
    PSEUDOCÓDIGO:
    FUNCIONbusquedaArreglo(A, n,buscado):VECTORxENTERO>=0xENTEROENTERO>=0 
    SI n=0 entonces 
            Retornar -1 
    SINO 
            SI(A[n]=buscado)  entonces
                    Retornar n
            SINO
                    Retornar busquedaArreglo(A, n-1,buscado)
    FIN 

    */

    //IMPLEMENTACIÓN 
    
    public static int busquedaArreglo(int A[], int n, int buscado) //n será la cantidad de elementos que tiene el arreglo de enteros
    {
        if(n==-1)
        {
            return -1;
        }
        else
        {
            if(A[n]==buscado)
            {
                return n;
            }
            else
            {
                return (busquedaArreglo(A,n-1,buscado));
            }
            
        }
        
    }
    
}
