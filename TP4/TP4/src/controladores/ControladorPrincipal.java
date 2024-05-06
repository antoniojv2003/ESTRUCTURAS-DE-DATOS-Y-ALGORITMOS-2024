/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladores;

import metodos.RedSocial;
import metodos.Usuario;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //clase main del proyecto
        RedSocial reds1=RedSocial.redSocialVacia(); 
        
        Usuario u1=new Usuario("Carlos","Juarez");
        Usuario u2=new Usuario("Antonio","Vargas");
        Usuario u3=new Usuario("Facundo","Martinez");
        System.out.println(reds1.esVacia()); //chequeo si está vacía
        reds1.registrar(u1);
        reds1.registrar(u2);
        System.out.println(reds1.esVacia()); //CHEQUEADO MÉTODO TRUE
        
        System.out.println("ELEMENTOS DE reds1:");
        reds1.mostrar();
        
        System.out.println(reds1.esta(u1)); //método esta() chequeado
        
        
        
//      reds1.echar(u2);  CHEQUEADO ESTE MÉTODO
        
//        System.out.println("ULTIMO USUARIO");
//        System.out.println(reds1.ultimoUsuario());
//        
//        System.out.println("CANTIDAD DE USUARIOS");
//        reds1.echar(u2);
//        reds1.echar(u1);
//        System.out.println(reds1.cantidad());
//        
//        reds1.mostrar(); //muestro para chequear de que no se haya modificado la lista original
//        METODOS CHEQUEADOS
        Usuario u4=new Usuario("Nicolas","Rodriguez");
        Usuario u5=new Usuario("Camila","Saavedra");
        reds1.registrar(u3);
        RedSocial reds2=RedSocial.redSocialVacia();
        reds2.registrar(u2);
        reds2.registrar(u5);
        reds2.registrar(u4);
        
        System.out.println("CONTENIDO DE RS1");
        reds1.mostrar();
        System.out.println("CONTENIDO DE RS2");
        reds2.mostrar();
        
//        System.out.println("CONTIENEN EL USUARIO MANDADO A ESAMIGOCOMUN?");
//        System.out.println(reds1.esAmigoComun(reds2, u2));        
//        METODO ESAMIGOCOMUN CHEQUEADO
        
        
        
        
        
    }
    
}
