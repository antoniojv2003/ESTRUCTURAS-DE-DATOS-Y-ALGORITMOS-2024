/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author Usuario
 */
public class RedSocial { //implementación para el punto 4-LAS REDES SOCIALES SERÁN LISTAS ENLAZADAS DE USUARIOS
    /*CONSIGNA:
    b)	Implemente en Java el ADT REDSOCIAL(USUARIOS) usando 
    lista simplemente enlazada. USUARIO debe contener los atributos nombre, apellido. 
    La implementación de la operación ESTA debe ser recursiva. */
    public class Nodo
    {
        private Nodo siguiente;
        private Usuario usuario; //la informaciónq que tendrán los nodos será un usuario

        public Nodo(Usuario usuario) { //constructor
            this.usuario = usuario;
        }

        public Nodo obtenerSiguiente() {
            return siguiente;
        }

        public void asignarSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

        public Usuario obtenerUsuario() {
            return usuario;
        }

        public void asignarUsuario(Usuario usuario) {
            this.usuario = usuario;
        }
           
    }
    
    private Nodo primero; //defino la cabecera para esta red social

    private RedSocial() { //constructor privado
        this.primero = null;
    }
    //EL SIGUIENTE MÉTODO ES PARA CREAR UNA REDSOCIAL VACIA
    public static RedSocial redSocialVacia() //método para crear la red social
    {
        RedSocial nuevaRedSocial=new RedSocial(); 
        return nuevaRedSocial;       
    }
    
    public void registrar(Usuario u) //registra al final dicho usuario
    {
        Nodo NodoARegistrar=new Nodo(u); 
        if(this.esVacia())
        {
            this.primero=NodoARegistrar; //quiero registrar el nodo con ese usuario
        }
        else
        {
            Nodo NodoAux=this.primero; 
            while(NodoAux.siguiente!=null)
            {
                NodoAux=NodoAux.siguiente;
            }
            NodoAux.siguiente=NodoARegistrar;
        }
    }
    
    public void mostrar() //operación extra para mostrar los usuarios registrados en una red social
    {
        Nodo NodoAux=this.primero; 
        while(NodoAux!=null)
        {
            System.out.println(NodoAux.usuario);
            NodoAux=NodoAux.siguiente;
        }
    }        
    //ESTAS FUERON LAS CONSTRUCTORAS PRIMITIVAS
    //OPERACIONES DEFINIDAS PARA ESTA CLASE
    
    //operacion ESVACIA
    public boolean esVacia()
    {
        return (this.primero==null); 
    }
    
    //operacion ESTA
    public boolean esta(Usuario u)
    {
        if(this.esVacia())
        {
            return false; 
        }
        else
        {
            Nodo NodoAux=this.primero; //nodo auxiliar para recorrer la red social (lista enlazada)
            while(NodoAux!=null)
            {
                if(NodoAux.usuario.equals(u)) //condicion para saber si estos usuarios son iguales
                    return true;
                NodoAux=NodoAux.siguiente; 
            }
            return false; 
        }
    }
    
    
    
    
    
    
    
    
    
    
}
