/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteListaEnlazada;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada { //mediante esta clase implementaremos la lista enlazada
    
    public class Nodo{ //clase Nodo
        private Nodo siguiente; //variables de instancia de esta clase como privadas para cumplir con el encapsulamiento (usar metodos get and set para acceder a ellas)
        private int informacion;
        
        public Nodo(int informacion) { //constructor
            this.informacion = informacion;
        }
        //métodos get and set 
        public Nodo obtenerSiguiente() {
            return siguiente;
        }

        public void asignarSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public int obtenerInformacion() {
            return informacion;
        }

        public void asignarInformacion(int informacion) {
            this.informacion = informacion;
        }
    }
    
    //variables de instancia de la clase ListaEnlazada
    private Nodo primero; //definimos el primer nodo de la lista (será nuestra cabecera) 
    
    //CONSTRUCTOR PRIVADO

    public ListaEnlazada() {
        this.primero = null; //incializamos en null siempre
    }
    

    //DEFINICION DE LOS MÉTODOS PARA LA CLASE ListaEnlazada 
    
    //MÉTODO crearLista(): Instancia y devuelve una lista vacía
    public static ListaEnlazada crearLista()
    {
      ListaEnlazada lista=new ListaEnlazada(); //crea una lista enlazada
      return lista; //retorna la lista enlazada
      
    }
    
    
    //MÉTODO esVacia(): comprueba si la lista está vacía
    
    public boolean esVacia()
    {
        return(this.primero==null); //comprueba si el primer elemento apunta a null
    }
    
    
            
           
    
        
    
    
}
