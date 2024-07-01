/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtfila;

/**
 *
 * @author Usuario
 */
public class FilaMerge { //clase que tendrá las operaciones definidas para el ADT FILA (punto 1 del TP6)  //EN ESTE CASO SE IMPLEMENTARÁ PARA APLICAR EL MÉTODO MERGE
    /*Estrategia: se implementará con una lista simplemente enlazada que contará con dos referencias al frente y al final de la fila. 
    La referencia FRENTE apuntará al primer elemento de la lista enlazada, mientras que la referencia FINAL apuntará al último elemento,
    de tal forma que todas las operaciones puedan realizarse con un costo O(1)*/
    private Nodo frenteFilaMerge; 
    private Nodo finalFilaMerge;
    private Integer cantidadItems; //la cantidad se inicializa en 0 pero se va incrementando o decrementando a medida que se enfila o defila respectivamente
    
    private class Nodo
    {
        private Nodo siguiente;
        private int item; //según lo que nos piden en el enunciado, los items de la fila deben ser números enteros

        public Nodo(int item) { //Constructor: al crear un Nodo se inicializa el valor del item
            this.item = item;
        }
        //métodos get y set 
        public Nodo obtenerSiguiente() {
            return siguiente;
        }

        public void asignarSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public int obtenerItem() {
            return item;
        }

        public void asignarItem(int item) {
            this.item = item;
        }
        
    }
    
    //OPERACIONES DEFINIDAS PARA EL ADT FILA
    //Constructor (privado) 

    private FilaMerge() { //quiero inicializar frente y final en null así que sería redundante hacerlo dentro de este constructor
        cantidadItems=0; //inicializo la cantidad en 0
    }
    
    public static FilaMerge filaVacia() //operacion filaVacia: crea y retorna una fila vacia
    {
        FilaMerge filavacia=new FilaMerge(); //creación de una fila
        
        return filavacia; //retorna la fila vacía
    }

    
    public boolean esFilaMergeVacia() //operacion esFilaMergeVacia: retorna true si la fila es vacia, y false en caso contrario
    {
        return ((this.frenteFilaMerge==null)&&(this.finalFilaMerge==null)); //el frente y el final deben apuntar a null para considerar a una fila vacía (aunque se puede usar como condición a solo uno) 
    }
    
    
    public void mostrarFilaMerge() //método auxiliar para mostrar los elementos de la fila
    {
        if(!this.esFilaMergeVacia())
        {
            Nodo NodoAux=this.frenteFilaMerge; //vamos iterando y recorriendo la fila desde el frente hasta el final
            while(NodoAux!=null)
            {
                System.out.println(NodoAux.obtenerItem()); //muestro el item del nodo de esta iteración
                NodoAux=NodoAux.obtenerSiguiente(); //paso al siguiente nodo de la lista
            }
            
        }  
    }
    
    public void enfila(Integer item) //operación enfila: enfila el elemento que se manda por parámetro
    {
        Nodo NodoAEnfilar=new Nodo(item); //creo el nodo
        if(this.esFilaMergeVacia())
        {
            this.frenteFilaMerge=NodoAEnfilar; 
            this.finalFilaMerge=NodoAEnfilar;  //El frente y el final apuntarán a ese único nodo, debido a su condición inicial de vacía
            cantidadItems++; //incremento el contador de items pues estoy agregando uno
            
        }
        else
        {
            this.finalFilaMerge.asignarSiguiente(NodoAEnfilar); //el nodo del final apunta al nuevo enfilado
            this.finalFilaMerge=NodoAEnfilar; //ahora el final pasa a apuntar a este nodo que se enfila
            cantidadItems++; //incremento el contador de items pues estoy agregando uno
        }
    }
    
    public void defila() //operacion defila: saca el elemento del frente
    {
        if(!this.esFilaMergeVacia())
        {
            this.frenteFilaMerge=this.frenteFilaMerge.obtenerSiguiente(); //el frente apunta al que le sigue
            this.cantidadItems--; //decremento el contador de items pues estoy sacando uno
        }
    }
    
    public Integer frente() //operación frente: obtiene el elemento que está en el frente de la fila
    {
        if(this.esFilaMergeVacia())
            return null; //es indefinido así que retorno null
        else
            return this.frenteFilaMerge.obtenerItem();
    }
    
    public Integer Final() //retorna el elemento ubicado al finald de la fila
    {
        return this.finalFilaMerge.obtenerItem();
    }
    
    /*NOTA: las operaciones como longitud (definida a continuación), pertenece(),
    igualfilas(),concatenarfilas(), etc., en la teoría se muestran como aplicaciones,
    así que las operaciones básicas definidas para el adt son:
    filaVacia(), esFilaMergeVacia(), enfila(), defila() y frente()
    */
    public Integer longitud() { //operación auxiliar longitud para obtener la cantidad de items con los que cuenta la fila
        return cantidadItems;
    } 
    
    
    
   
    
    
    
    
    
}
