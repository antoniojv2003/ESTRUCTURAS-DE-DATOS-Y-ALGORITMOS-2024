/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaEnlazadaTP3;

/**
 *
 * @author Usuario
 */
public class ListaEnlazada3 {
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
    
    //variables de instancia de la clase ListaEnlazada3
    private Nodo primero; //definimos el primer nodo de la lista (será nuestra cabecera) 
    
    //CONSTRUCTOR PRIVADO

    private ListaEnlazada3() {
        this.primero = null; //incializamos en null siempre
    }
    

    //DEFINICION DE LOS MÉTODOS PARA LA CLASE ListaEnlazada3 
    
    //MÉTODO crearLista(): Instancia y devuelve una lista vacía
    public static ListaEnlazada3 crearLista()
    {
      ListaEnlazada3 lista=new ListaEnlazada3(); //crea una lista enlazada
      return lista; //retorna la lista enlazada
      
    }
    
    
    //MÉTODO esVacia(): comprueba si la lista está vacía
    
    public boolean esVacia()
    {
        return(this.primero==null); //comprueba si el primer elemento apunta a null
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
    
    //MÉTODO MOSTRAR PARA EL TP3 PUNTO 2
    
    public static void mostrar(ListaEnlazada3 L)
    {
        if(L.esVacia())
        {
            return;
        }
        else
        {
            
            System.out.println(L.primero.informacion);
            L.primero=L.primero.siguiente;
            mostrar(L);
        }
                 
    }
    
    //MÉTODO PARA EL PUNTO 3 DEL TP3
    //calcula la suma de los enteros almacenados en los nodos cuyo valor sea superior a un valor umbral pasado como parámetro.
    public static int sumaEnteros(ListaEnlazada3 L, int valorUmbral)
    {
        
        if(L.esVacia())
        {
            System.out.println("La lista esta vacia y no se suma ningun elemento--->resultado 0");
            return 0;
        }
        else
        {
            if(L.primero.informacion>valorUmbral)
            {
                int x=L.primero.informacion;
                L.primero=L.primero.siguiente;
                System.out.println("El valor supera al de umbral entonces se suma");
                return(x+sumaEnteros(L,valorUmbral));
            }
            else
            {
                L.primero=L.primero.siguiente;
                System.out.println("El valor no supera al de umbral, se vuelve a aplicar el metodo pasando al siguiente elemento");
                return(sumaEnteros(L,valorUmbral)); 
            }
        }
    }
}
