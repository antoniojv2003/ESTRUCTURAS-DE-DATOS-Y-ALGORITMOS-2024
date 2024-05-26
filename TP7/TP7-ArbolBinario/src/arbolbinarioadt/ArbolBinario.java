/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinarioadt;

/**
 *
 * @author Usuario
 */
public class ArbolBinario{ //clase que implementa el adt arbol binario
    private ArbolBinario izquierdo; //tiene tres atributos: raiz, izquierdo y derecho
    private ArbolBinario derecho;
    private Integer raiz; //primero pruebo con tipos de datos genéricos, después particularizo
                        //para el tipo entero

    private ArbolBinario() { //constructor privado
        this.izquierdo = null;
        this.derecho = null;
        this.raiz = null;  //esto puede ser redundante porque estas variables se inicializan en null cuando se crea algo del tipo ArbolBinario
    }
    
    public static ArbolBinario arbolVacio() //método que retorna un AB vacío
    {
        ArbolBinario abvacio=new ArbolBinario(); //AB de enteros
        return abvacio; //retorna el arbol vacio creado
    }
    
    public static ArbolBinario armarAB (ArbolBinario izq, Integer raizAB, ArbolBinario der)//método que arma un AB a partir de su raiz, su arbol izquierdo y derecho
    {
        ArbolBinario nuevoArbol=arbolVacio();
        nuevoArbol.izquierdo=izq;
        nuevoArbol.derecho=der;
        nuevoArbol.raiz=raizAB; 
        return nuevoArbol;
    } //EN PROCESO DE PRUBEAS
      //OTRA IDEA ES QUE SEA UN MÉTODO ESTATICO PERO HAY QUE VER PORQUE SALE UN ERROR
      //CUANDO SE USA ALGO DEL TIPO ITEM COMO PARÁMETRO 
    
    public boolean esABVacio() //metodo para evaluar si un AB es vacio
    {
        return (this.raiz==null); //si la raiz es nula entonces es vacio
    }
    
    public ArbolBinario izquierdo() //retorna el arbol izquierdo
    {
        return (this.izquierdo);
    }
    
    public ArbolBinario derecho() //retorna el arbol derecho
    {
        return (this.derecho);
    }
    
    public boolean pertenece(Integer item) //operacion que determina si pertenece el item que se manda como parámetro
    {
        if(this.esABVacio())
            return false;
        else
        {
            return ((item==this.raiz)||(this.izquierdo.pertenece(item))||(this.derecho.pertenece(item)));
        }
    }
    
    
    
    //METODOS DE RECORRIDO DE ARBOLES BINARIO (punto 2 del tp)
    
    public void ordenSimetrico()
    {
        if(!this.esABVacio())
        {
            this.izquierdo.ordenSimetrico();
            System.out.println(this.raiz);
            this.derecho.ordenSimetrico();
        }
    }
    
    public void preOrden()
    {
        if(!this.esABVacio())
        {
            System.out.println(this.raiz);
            this.izquierdo.preOrden();
            this.derecho.preOrden();
        }
    }
    
    public void posOrden()
    {
        if(!this.esABVacio())
        {
            this.izquierdo.posOrden();
            this.derecho.posOrden();
            System.out.println(this.raiz);
        }
    }
    
    
    
    
    
   
    
}
