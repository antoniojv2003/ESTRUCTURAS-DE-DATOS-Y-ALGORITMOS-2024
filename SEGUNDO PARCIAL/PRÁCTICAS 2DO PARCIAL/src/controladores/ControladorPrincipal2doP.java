/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import fila.Fila;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal2doP {
    public static void main(String[] args) { //metodo para hacer pruebas
        Fila f1=Fila.filaVacia();
        System.out.println(f1.esFilaVacia());
        System.out.println("Frente f1 vacia:"+f1.obtenerFrente());
        Fila f3=Fila.filaVacia();
        System.out.println("Frente f3 vacia"+f3.obtenerFrente());
        System.out.println("Iguales frentes?"+(f1.obtenerFrente()==f3.obtenerFrente()));
        f1.enfila(1);
        f1.enfila(5);
        f1.enfila(6);
        f1.enfila(3);
        System.out.println(f1.esFilaVacia());
        f1.mostrar(); 
        System.out.println("\n"+"Frente:"+f1.obtenerFrente()+" Final:"+f1.obtenerFinal()+" Longitud:"+f1.longitud());
        System.out.println("Si defilo");
        f1.defila();
        f1.mostrar();
        //prueba de aplicaciones como usuario 
        //Invertir una fila: funciona
//        System.out.println("\nFila invertida:");
//        Fila invertida;
//        invertida=f1.invertir();
//        invertida.mostrar();
        //pertenece
        System.out.println(f1.pertenece(2));
        System.out.println(f1.pertenece(3));
        System.out.println(f1.pertenece(1000));
        
//        //prueba de igualFila con otra fila
        Fila f2=Fila.filaVacia();
        f2.enfila(5);
        f2.enfila(6);
        f2.enfila(3);
        System.out.println("Son iguales?");
        System.out.println(igualFila(f1,f2));
        
                
        
    } 
    
    //metodos implementados como usuario
    //igualFila: retorna true si dos filas son iguales
    public static boolean igualFila(Fila f1,Fila f2)
    {
        if(f1.esFilaVacia()&&f2.esFilaVacia())
            return true;
        else
        {
            if(f1.esFilaVacia()||f2.esFilaVacia())
                return false;
            else
            {
                if(f1.obtenerFrente()==f2.obtenerFrente())
                {
                    f1.defila();
                    f2.defila();
                    return igualFila(f1,f2);
                }
                else
                    return false;
            }
        }
              
    }
  }


    

