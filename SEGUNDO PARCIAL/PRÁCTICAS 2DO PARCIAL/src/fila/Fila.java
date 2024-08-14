/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila;

/**
 *
 * @author Usuario
 */
public class Fila {//ADT FILA-repaso parcial 
    //clase privada nodo
    private class Nodo
    {
        private Integer info; //informacion que tiene el nodo
        private Nodo siguiente;

        public Nodo(Integer info) { //se instancia cada nodo con la informacion que contiene 
            this.info = info;
        }

        public Integer getInfo() {
            return info;
        }

        public void setInfo(Integer info) {
            this.info = info;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }
        
    }
    
    //variables de instancia de la clase Fila
    private Nodo frenteF; //apunta al primer elemento de la lista enlazada
    private Nodo finalF;//apunta al último elemento de la lista enlazada
    private Integer cantidad; //se inicializa en 0 y se va incrementando cuando se enfila algún elemento 

    private Fila() { //constructor privado
        this.cantidad = 0; //para cada instancia se inicializa la cantidad de elementos en 0 
        this.finalF=null;
        this.frenteF=null;
    }
    
    public static Fila filaVacia() //método estático para crear una fila vacía, haciendo uso del constructor privado 
    {
        Fila filavacia=new Fila();
        return filavacia; 
    }
    
    public boolean esFilaVacia() //determina si una fila es vacia (true) o no (false)
    {
        return (this.frenteF==null);
    }
    
    public Integer obtenerFrente() //para obtener el frente de la fila
    {
        if(this.frenteF==null)
        {
            return null;
        }
        else
        {
            return (this.frenteF.getInfo());    
        }
    }
    
    public void enfila(Integer x) //al aplicarse sobre una fila, enfilará el elemento que se manda como parámetro
    {
        Nodo nodoAInsertar=new Nodo(x);
        if(this.esFilaVacia())
        {
            this.frenteF=nodoAInsertar;
            this.finalF=nodoAInsertar; //el frente y el final apunta al primer nodo que se enfila
            this.cantidad++; //incremento la cantidad 
        }
        else
        {
            //se añade como último elemento
            this.finalF.setSiguiente(nodoAInsertar);
            this.finalF=nodoAInsertar;
            this.cantidad++;
            
        }
            
    }
    
    public void defila ()
    {
        if(!this.esFilaVacia())
        {
            this.frenteF=this.frenteF.getSiguiente();
            this.cantidad--;
        }
    }
    
    public Integer obtenerFinal() //método para obtener el final de la fila
    {
        return this.finalF.getInfo();
    }
    public void mostrar() //método auxiliar para mostrar una fila
    {
        if(this.esFilaVacia())
        {
            System.out.println("La fila esta vacia");
        }
        else
        {
            Nodo nodoAux=this.frenteF; //muestro del frente al final
            while(nodoAux!=null)
            {
                System.out.println(nodoAux.getInfo());
                nodoAux=nodoAux.getSiguiente(); //paso al siguiente nodo
            }
        }
        
    }
    
    public Integer longitud()
    {
        return this.cantidad;
    }
    
    //pertenece: determina si un elemento pertenece a una fila
    public boolean pertenece(Integer x)
    {
        if(this.esFilaVacia())
            return false;
        else
        {
            Nodo nodoAux=this.frenteF;
            while(nodoAux!=null)
            {
                if(nodoAux.getInfo().equals(x))
                {
                    return true;
                }
                nodoAux=nodoAux.getSiguiente();
            }
            return false;
        }
    }
    
    //metodos aux
    public Fila invertir(){ //habria que chequearlo
        return invertir(this, new Fila());
    }
    private Fila invertir(Fila filaOriginal, Fila filaInvertida){
    
        if(!filaOriginal.esFilaVacia()){
            Integer frenteOriginal = filaOriginal.obtenerFrente();
            filaOriginal.defila();
            invertir(filaOriginal, filaInvertida);
            filaInvertida.enfila(frenteOriginal);
        }
        return filaInvertida;
    }
    
    
    
    
    
    
    
}
