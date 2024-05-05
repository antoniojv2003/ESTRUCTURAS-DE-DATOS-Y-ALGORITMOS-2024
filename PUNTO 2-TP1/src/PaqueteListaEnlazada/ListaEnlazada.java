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
            while(NodoAuxiliar.siguiente.siguiente!=null) //nos movemos hasta llegar al penúltimo 
            {
                NodoAuxiliar=NodoAuxiliar.siguiente;
                
            }
            NodoAuxiliar.siguiente=null; //borramos el último 
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
    
    //MÉTODO borrarConValor(int buscado): elimina todos los nodos que tengan el valor buscado
    public void borrarConValor(int buscado)
    { 
        if(!this.esVacia())
        {
            while(this.primero!=null && this.primero.informacion==buscado) //para borrar si se encuentran en los primeros lugares
            {
                this.primero=this.primero.siguiente;
            }

            Nodo NodoAuxiliar=this.primero;

            while(NodoAuxiliar!=null && NodoAuxiliar.siguiente!=null)
            {
                if(NodoAuxiliar.siguiente.informacion==buscado)
                {
                    NodoAuxiliar.siguiente=NodoAuxiliar.siguiente.siguiente;
                }
                else
                {
                    NodoAuxiliar=NodoAuxiliar.siguiente;
                }
            }
        }
    }
    
    //MÉTODO dameValorEnPosicion(int posicion):Devuelve el contenido del nodo en la posicion "posicion"
    //NOTA: para este método supondré que la posicion en las listas comienzan en 1
    public int dameValorEnPosicion(int posicion)
    {
        int valorBuscado=0; //aqui guardaremos el valor de esa posicion de nodo
        Nodo NodoAuxiliar=this.primero; //con este nodo iremos recorriendo la lista
        int contador=1; //iremos contando la iteracion de cada nodo de la lista
        if(!this.esVacia())
        {
            while(contador<=this.cantidad())
            {
                if(posicion==contador)
                {     
                    valorBuscado=NodoAuxiliar.informacion; //devuelve el valor del nodo en esa posicion  
                }
                contador++;
                NodoAuxiliar=NodoAuxiliar.siguiente; //paso al siguiente nodo
                
            }
        }
        if(valorBuscado==0)
        {
            System.out.println("No se encontro un nodo en esa posicion");
        }
        return valorBuscado;
        
    }
    
    //MÉTODO modificarValorEnPosicion: modificar el contenido del nodo de la posicion "posicion"
    public void modificarValorEnPosicion(int valor, int posicion)
    {
        Nodo NodoAuxiliar=this.primero; //con este nodo iremos recorriendo la lista
        int contador=1; //iremos contando la iteracion de cada nodo de la lista
        if(!this.esVacia())
        {
            while(contador<=this.cantidad())
            {
                if(posicion==contador)
                {     
                    NodoAuxiliar.informacion=valor; //si coincide la posicion buscada, reemplazamos por el valor que mandamos
                }
                contador++;
                NodoAuxiliar=NodoAuxiliar.siguiente; //paso al siguiente nodo
                
            }
        }
        
    }
    
    //MÉTODO insertarEnPosicion: inserta un nodo en la posicion "posicion" con valor "valor"
    public void insertarEnPosicion(int valor, int posicion)
    {
        Nodo NodoAInsertar=new Nodo(valor); //creamos el nodo que queremos insertar
        if(this.esVacia()) //vemos si es vacía
        {
            NodoAInsertar.siguiente=null; //creo que es redundante
            this.primero=NodoAInsertar; //hacemos que el primero o cabecera apunte a NodoAInsertar
            return;
        }
        
        int contador=1; //con esto iremos contando las iteraciones y avanzando en las posiciones
        if(posicion==1) //vemos si queremos insertar en la posicion 1
        {
         NodoAInsertar.siguiente=this.primero;
         this.primero=NodoAInsertar;
         return;
        }
        Nodo NodoAuxiliar=this.primero;
        while(contador<posicion-1 && NodoAuxiliar!=null) //asi avanzamos hasta la posicion anterior a la deseada con el nodo auxiliar
        {
            NodoAuxiliar=NodoAuxiliar.siguiente;
            contador++;
        }
        
        //insertamos el nuevo nodo entre el actual y el siguiente
        NodoAInsertar.siguiente=NodoAuxiliar.siguiente;
        NodoAuxiliar.siguiente=NodoAInsertar; //FUNCIONA PERO SE PUEDE MEJORAR
        
        
    }
            
           
    
        
    
    
}
