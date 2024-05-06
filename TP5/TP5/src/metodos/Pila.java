/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class Pila <ITEM>  { //la pila será una lista enlazada, cuyo tope será el primer elemento de la lista
    
    public class Nodo  //como toda lista enlazada estará conformada por nodos
    {
        private Nodo siguiente;
        private ITEM item;

        public Nodo(ITEM item) { //constructor de los nodos
            this.item = item;
        }

        public Nodo obtenerSiguiente() {
            return siguiente;
        }

        public void asignarSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public ITEM obtenerItem() {
            return item;
        }

        public void asignarItem(ITEM item) {
            this.item = item;
        }
        
    }
    
    Nodo primero; //en nuestro caso la cabecera apuntará al último elemento de la pila

    private Pila() {
        this.primero = null;
    }
    
    public static Pila pilaVacia()
    {
        Pila pilaNueva=new Pila();
        return pilaNueva; //creamos y retornamos una pila mediante este met
    }
    
    //operaciones del ADT
    public boolean esPilaVacia()
    {
        return (this.primero==null);
    }
    
    public void push(ITEM item) //agregará el item en el tope de la pila
    {                           //es decir, al inicio de la lista
        Nodo NodoAInsertar=new Nodo(item); 
        if(this.esPilaVacia())
        {
            this.primero=NodoAInsertar; 
        }
        else
        {
            NodoAInsertar.siguiente=this.primero;
            this.primero=NodoAInsertar; //agregamos el nodo al inicio
        }
        
    }
    
    public void mostrarPila() //metodo para mostrar el contenido de una pila
    {
        if(this.esPilaVacia())
        {
            return;
        }
        else
        {
            Nodo NodoAux=this.primero; //nodo auxiliar para recorrer la pila
            while(NodoAux!=null)
            {
                System.out.println(NodoAux.item);
                NodoAux=NodoAux.siguiente;
            }
        }
        
    }
    
    public void pop() //operacion para borrar el último item añadido
    {
        if(this.esPilaVacia())
        {
            return;
        }
        else
        {
            this.primero=this.primero.siguiente; //borro el primer elemento de la lista
            //pero es el ultimo añadido a la pila
        }
    }
    
    public ITEM top() //método que devuelve el limite que esta en el tope de la pila
    {
        return (this.primero.obtenerItem());
        
    }
    
    public ITEM fondo() //método que devuelve el fondo de la pila, es decir
                        //el último elemento de las lista
    {
        if(this.esPilaVacia())
        {
            return null; //si la pila está vacía retorno null
        }
        else 
        {
            Nodo NodoAux=this.primero; //nodo auxiliar para recorrer la pila
            while(NodoAux.siguiente!=null)
            {
                NodoAux=NodoAux.siguiente;
            }
            return (NodoAux.item);
        }
    }
    
    
    
    
}
