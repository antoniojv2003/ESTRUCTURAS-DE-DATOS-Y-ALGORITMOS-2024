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

    private ListaEnlazada() {
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
    
    //MÉTODO InsertarAlInicio(int x): inserta un nodo al comienzo de la lista
    public void InsertarAlInicio(int x)
    {
        Nodo NodoAInsertar=new Nodo(x); //creamos el nodo que tendra esa informacion
        if(this.esVacia())
        { 
          this.primero=NodoAInsertar;  //si la lista está vacia hacemos que el nodo 
                                       //primero apunte al nodo a insertar
        }
        else
        {
            NodoAInsertar.siguiente=this.primero; //hacemos que el nodo a insertar apunte
                                                  //apunte al que estaba primero
            this.primero=NodoAInsertar;//ponemos como primero este nodo que creamos
        }
    }
    
    
    //MÉTODO InsertarAlFinal(): inserta un nodo al final de la lista
    public void InsertarAlFinal(int x)
    {
        Nodo NodoAInsertar=new Nodo(x); //creamos le nodo a insertar con esa información
        if(this.esVacia())
        {
            this.primero=NodoAInsertar; //si la lista está vacia ese nodo es el primero
        }
        else
        {
            Nodo NodoAuxiliar=this.primero; //este nodo nos servirá para que simule ser el primero e ir recorriendo la lista
            
            while(NodoAuxiliar.siguiente!=null)
            {
             NodoAuxiliar=NodoAuxiliar.siguiente; //mientras el nodo al que apunte un nodo no sea null (es decir no llegamos al final de la lista) 
                                                           //pasaremos al siguiente
            }
            NodoAuxiliar.siguiente=NodoAInsertar; //una vez que llegamos al final de la lista hacemos que el último nodo apunte al que queremos insertar

        }
        
    }
    
    //MÉTODO MOSTRAR(): recorre los nodos de la lista y muestra su contenido por pantalla
    public void mostrar()
    {
        Nodo NodoAuxiliar=this.primero; //nodo que ira recorriendo la lista
        
        if(this.esVacia())
        {
            System.out.println("La lista esta vacia!!!");
        }
        else
        {  
            System.out.println("***CONTENIDO DE LA LISTA***");
            while(NodoAuxiliar!=null)
            {
                System.out.println(NodoAuxiliar.informacion); //mostramos el contenido del nodo
                NodoAuxiliar=NodoAuxiliar.siguiente; //apuntamos al siguiente nodo
            }
            
        }
        
        
    }
    
    //MÉTODO cantidad():devuelve la cantidad de nodos de una lista
    public int cantidad()
    {
       int contadorDeNodos=0; //contaremos los nodos y retornaremos los mismos
       Nodo NodoAuxiliar=this.primero; //usaremos un nodo auxiliar para recorrer la lista
       
       if(this.esVacia())
       {
           return 0;
       }
       else
       {
           while(NodoAuxiliar!=null)
           {
               contadorDeNodos++; //incrementamos el contador
               NodoAuxiliar=NodoAuxiliar.siguiente; //apuntamos al siguiente nodo
               
           }
       }
       
       return contadorDeNodos; //retornamos la cantidad de nodos
    }
    
    //MÉTODO borrarPrimero(): elimina el primer nodo de la lista
    public void borrarPrimero()
    {
        if(this.esVacia())
        {
            System.out.println("La lista no posee elementos para borrar");
        }
        else
        {
            this.primero=this.primero.siguiente; //deja de apuntar al que estaba apuntando antes
        }                                       //sino que apunta al que le sigue  
    }
    
    //MÉTODO borrarUltimo: elimina el último nodo de la lista
    public void borrarUltimo()
    {
        Nodo NodoAuxiliar=this.primero; //usaremos un nodo auxiliar para recorrer nuestra lista
        
        if(this.esVacia())
        {
            System.out.println("La lista no posee elementos para borrar");
        }
        else
        {
            while(NodoAuxiliar.siguiente.siguiente!=null)
            {
                NodoAuxiliar=NodoAuxiliar.siguiente;
                
            }
            NodoAuxiliar.siguiente=null;
        }
    }
    
    //MÉTODO pertenece(int buscado): determina si un elemento pertenece a la lista
    public boolean pertenece(int buscado)
    {
        Nodo NodoAuxiliar=this.primero; //nodo auxiliar para recorrer la lista
        
        if(this.esVacia())
        {
            return false;
        }
        else
        {
            while(NodoAuxiliar!=null)
            {
                if(NodoAuxiliar.informacion==buscado)
                {
                    return true; //si coincide entonces retorna true
                }
                
                NodoAuxiliar=NodoAuxiliar.siguiente; //pasamos a apuntar al siguiente nodo
            }
            return false; //si no encuentra un elemento que tenga el mismo valor entonces retorna true
        }
    }
    
    
            
           
    
        
    
    
}
