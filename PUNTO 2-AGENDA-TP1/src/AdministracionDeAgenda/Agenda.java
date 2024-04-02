/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionDeAgenda;

/**
 *
 * @author Usuario
 */
public class Agenda { //la agenda será nuestra lista enlazada
    
    public class Nodo //esta clase tendrá una clase interna que serán los nodos
    {
        private Nodo siguiente; //nodo que apuntará al siguiente nodo
        private Contacto contacto; //"contacto" será la información de nuestros nodos

        public Nodo(Contacto contacto) { //constructor
            this.contacto = contacto;
        }

        public Nodo obtenerSiguiente() {
            return siguiente;
        }

        public void asignarSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Contacto obtenerContacto() {
            return contacto;
        }

        public void asignarContacto(Contacto contacto) {
            this.contacto = contacto;
        }
     
    }
    
    private Nodo primero; //será nuestra cabecera
    
    //constructor privado para que solo se pueda crear la agenda mediante el metodo
    private Agenda() {
        this.primero = null; //inicializamos en null siempre
    }
    
    
    //***MÉTODOS AUXILIARES***
    //MÉTODO estático para crear agendas mediante el mismo 
    public static Agenda crearAgenda()
    {
        Agenda agendaCreada=new Agenda();
        return agendaCreada; //retorna la agenda creada
    }
    //MÉTODO para verificar si la agenda está vacía
    public boolean esVacia()
    {
        return (this.primero==null);
    }
    
    //MÉTODOS QUE NOS PIDE EL ENUNCIADO DE ESTE EJERCICIO
    
    //MÉTODO agregar(Contacto c):Agrega un contacto a la agenda
    //para este método iré agregando contactos al final
    public void agregar(Contacto c)
    {
        Nodo NodoAgregado=new Nodo(c);
        if(this.esVacia())
        {
            this.primero=NodoAgregado; //hacemos que la cabecera apunte a NodoAgregado 
        }
        else
        {
            Nodo NodoAuxiliar=this.primero; //usamos un nodo auxiliar para recorrer la lista
            while(NodoAuxiliar.siguiente!=null)
            {
                NodoAuxiliar=NodoAuxiliar.siguiente; //así hasta llegar al final de la lista
            }
            NodoAuxiliar.siguiente=NodoAgregado;
            
        }
    }
    
    //MÉTODO buscar(String nombre):busca el primer contacto con el nombre
    //recibido por parámetro y devuelve el contacto. Si no existe devuelve NULL
    public Contacto buscar(String nombre)
    {
        Contacto contactoARetornar;
        
        if(this.esVacia())
        {
            return null;
        }
        else
        {
            Nodo NodoAuxiliar=this.primero; //recorreremos la agenda mediante este nodo
            while(NodoAuxiliar!=null)
            {
                if(NodoAuxiliar.contacto.obtenerNombre().equalsIgnoreCase(nombre)) //comparamos sin importar la mayuscula
                {

                    contactoARetornar=NodoAuxiliar.contacto;
                    return contactoARetornar;
                }
                NodoAuxiliar=NodoAuxiliar.siguiente; //avanzamos en la iteracion
            }
        }
        return null; //retorna null si es que no lo encuentra
        
    }
    
    //MÉTODO borrar(String telefono): elimina el primer contacto con telefono igual alrecibido por parametro
    public void borrar(String telefono)
    {
        Nodo NodoActual=this.primero;
        Nodo NodoAnterior=null;
        //si es que el nodo a eliminar es el primero
        if(NodoActual!=null && NodoActual.contacto.obtenerTelefono().equals(telefono))
        {
            this.primero=NodoActual.siguiente;
            return;
        }
        
        //buscar el nodo a eliminar y mantener un puntero al nodo anterior
        while(NodoActual!=null && !(NodoActual.contacto.obtenerTelefono().equals(telefono)))
        {
            NodoAnterior=NodoActual;
            NodoActual=NodoActual.siguiente;
            
        }
        
        //si el nodo con ese contacto no existe no se elimina nada
        if(NodoActual==null)
        {
            System.out.println("No se encontro el contacto a eliminar");
            return;
            
        }
        
        //desenlazar el nodo a eliminar
        NodoAnterior.siguiente=NodoActual.siguiente;
       
        
    }
      
    
    //MÉTODO listar():muestra por pantalla los datos de todos los contactos de la agenda
    public void listar()
    {
        int posicion=1; //variable para localizar la posicion de cada Contacto
        
        if(this.esVacia())
        {
            System.out.println("La agenda no tiene contactos");
            return;
        }
        else
        {
            Nodo NodoAuxiliar=this.primero; //nodo auxiliar para recorrer la agenda
            while(NodoAuxiliar!=null)
            {
                System.out.println("Contacto "+ posicion);
                System.out.println(NodoAuxiliar.contacto); //mostramos cada contacto
                posicion++;
                NodoAuxiliar=NodoAuxiliar.siguiente;
            }
            return;
        }
    }
    
    //MÉTODO cantidad(): devuelve la cantidad de contactos de la agenda
    public int cantidad()
    {
        Nodo NodoAuxiliar=this.primero; //recorremos la lista mediante este nodo auxiliar
        int contador=0; //arrancaremos a contar desde 1
        
        while(NodoAuxiliar!=null)
        {
            contador++;
            NodoAuxiliar=NodoAuxiliar.siguiente;
        }
        
        return contador;
    }
    
    
    //MÉTODO enPosicion(int Posicion): devuelve el contacto en la posicion "posicion"
    public Contacto enPosicion(int posicion)
    {
        int contador=1; //con este contador trataremos de ubicar la posicion mandada por parámetro
        Nodo NodoAuxiliar=this.primero; //con este nodo auxiliar iremos recorriendo la lista
        Contacto contactoARetornar; //será la variable a retornar 
        
        while(NodoAuxiliar!=null)
        {
            if(contador==posicion)
            {
                contactoARetornar=NodoAuxiliar.contacto;
                return contactoARetornar;
                
            }
            NodoAuxiliar=NodoAuxiliar.siguiente; //pasamos al siguiente nodo
            contador ++; //pasamos al siguiente contacto
        }
        
        return null; //retorna null si no se encuentra el contacto de esa posicion
              
        
    }
    
     
    
    
    
   
    
    
    
    
}
