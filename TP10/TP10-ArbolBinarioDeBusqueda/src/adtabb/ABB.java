/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adtabb;

/**
 *
 * @author Usuario
 */
public class ABB { //clase que tendrá las operaciones básicas para operar con un ABB (Árbol Binario de Búsqueda)
    /*
    NOTA: se usará lo mismo que se hizo para la clase ABB del tp7 pero con la diferencia principal de que 
    el usuario no tendrá a mano el método armarABB (será privado) sino que directamente usará el método insertar
    el cual se encargará de ir insertando nodos al ABB según el criterio que caracteriza a este tipo de árboles
    (los de clave menores a la clave de la raiz van para la izquierda y los mayores para la derecha)
    Además se modificará el método de pertenece, el cual se llamara buscarABB, que en vez de devolver un boolean
    devolverá el valor que se busca y en caso que no se encuentre devolverá null, toda esta operación de búsqueda 
    la hará con el criterio. 
    */
    private ABB izquierdo; //tiene tres atributos: raiz, izquierdo y derecho
    private ABB derecho;
    private Integer raiz; //será un árbol de números enteros

    private ABB() { //constructor privado
        this.izquierdo = null;
        this.derecho = null;
        this.raiz = null;  //esto puede ser redundante porque estas variables se inicializan en null cuando se crea algo del tipo ABB
    }
    
    public static ABB ABBVacio() //método que retorna un AB vacío
    {
        ABB abvacio=new ABB(); //AB de enteros
        return abvacio; //retorna el arbol vacio creado
    }
    
    private static ABB armarABB (ABB izq, Integer raizAB, ABB der)//método que arma un AB a partir de su raiz, su arbol izquierdo y derecho 
    { //NOTAR QUE AHORA ES PRIVADO PUES ES UNA CONSTRUCTORA PRIVADA, SE DARÁ AL USUARIO EL MÉTODO insertar()
        ABB nuevoArbol=ABBVacio();
        nuevoArbol.izquierdo=izq;
        nuevoArbol.derecho=der;
        nuevoArbol.raiz=raizAB; 
        return nuevoArbol;
    }
    
    public boolean esABBVacio() //metodo para evaluar si un AB es vacio
    {
        return (this.raiz==null); //si la raiz es nula entonces es vacio
    }
    
    public Integer raiz()
    {
        return (this.raiz);
    }
    
    public ABB izquierdo() //retorna el arbol izquierdo
    {
        return (this.izquierdo);
    }
    
    public ABB derecho() //retorna el arbol derecho
    {
        return (this.derecho);
    }
    
    public static ABB insertar(ABB abb, Integer x) //método que al aplicarlo sobre un ABB lo modificará agregándole el elemento x
    {
        if(abb.esABBVacio())
        {
            return armarABB(ABBVacio(),x,ABBVacio());
        }
        else
        {
            if(abb.raiz()==x)
            {
                return armarABB(abb.izquierdo(),abb.raiz(),abb.derecho()); //en el ABB no hay claves repetidas
            }
            else
            {
                if(abb.raiz()>x) //si el elemento es menor lo inserta en el arbol izquierdo
                {
                    return armarABB(insertar(abb.izquierdo(),x),abb.raiz(),abb.derecho());
                }
                else //si el elemento es mayor lo inserta en el arbol derecho
                {
                    return abb.armarABB(abb.izquierdo(),abb.raiz(),insertar(abb.derecho(),x));
                }
                    
            }
        }
        
    }
    
    public Integer buscar(Integer x) //realiza la búsqueda de un valor dado y retorna el valor del nodo si encuentra una coincidencia o null si el valor no se encuentra en el árbol.
    {
        if(this.esABBVacio())
        {
            System.out.println("Elemento no encontrado");
            return null;
        }
        else
        {
            if(x==this.raiz)
            {
                System.out.println("El elemento encontrado! Valor:"+this.raiz());
                return this.raiz();
            }
            else
            {
                if(x<this.raiz)
                {
                    return this.izquierdo.buscar(x); //si es menor lo busca en el izquierdo
                }
                else
                {
                    return this.derecho.buscar(x); //si es mayor lo busca en el derecho
                }
            }
        }
        
    }
    
    //METODOS DE RECORRIDO DE ARBOLES BINARIO (punto 2 del tp7)
    
    public void ordenSimetrico()
    {
        if(!this.esABBVacio())
        {
            this.izquierdo.ordenSimetrico();
            System.out.println(this.raiz);
            this.derecho.ordenSimetrico();
        }
    }
    
    public void preOrden()
    {
        if(!this.esABBVacio())
        {
            System.out.println(this.raiz);
            this.izquierdo.preOrden();
            this.derecho.preOrden();
        }
    }
    
    public void posOrden()
    {
        if(!this.esABBVacio())
        {
            this.izquierdo.posOrden();
            this.derecho.posOrden();
            System.out.println(this.raiz);
        }
    }
    
}
