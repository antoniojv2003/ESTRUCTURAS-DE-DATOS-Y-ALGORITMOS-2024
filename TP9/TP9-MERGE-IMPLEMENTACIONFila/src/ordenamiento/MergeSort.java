/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento;

import adtfila.FilaMerge;

/**
 *
 * @author Usuario
 */
public class MergeSort { //clase que tendrá las operaciones para el método Merge 
    //se colocará en el final de la fila al menor y en el frente al mayor 
    public static FilaMerge MergeSort(FilaMerge filaAordenar)
    {
        if(filaAordenar.longitud()==0||filaAordenar.longitud()==1) //caso base, donde ya estaría automáticamente ordenada 
            return filaAordenar;
        else
            return CombinarLista(MergeSort(dividirLista(filaAordenar)),MergeSort(filaAordenar)); //caso recursivo
    }
    
    public static FilaMerge dividirLista(FilaMerge filaA)
    {
        int tamanio=filaA.longitud()/2;
        FilaMerge filaB=FilaMerge.filaVacia();
        while(tamanio!=0){
            filaB.enfila(filaA.frente()); //se enfila la mitad de elementos de la fila que se manda como parámetro
            filaA.defila();
            tamanio--;
        }
        return filaB; 
    }
    
    
    
    public static FilaMerge CombinarLista(FilaMerge filaA,FilaMerge filaB)
    {
        FilaMerge filaC=FilaMerge.filaVacia(); //la fila C es la fila ya ordenada
        while(filaA.longitud()!=0 && filaB.longitud()!=0)
        {
            if((Integer)filaA.frente()>=(Integer)filaB.frente())
            {
                filaC.enfila(filaA.frente()); //en el frente irá el mayor
                filaA.defila();
            }
            else
            {
                filaC.enfila(filaB.frente());
                filaB.defila();
            }
        }
        while(filaA.longitud()!=0)
        {
            filaC.enfila(filaA.frente());
            filaA.defila();
        }
        while(filaB.longitud()!=0)
        {
            filaC.enfila(filaB.frente());
            filaB.defila();
        }
        return filaC; 
    }
            
}

