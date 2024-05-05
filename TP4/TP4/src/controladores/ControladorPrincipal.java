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
        
        System.out.println(reds1.esta(u3)); //método esta() chequeado
        
        
        
        
    }
    
}
