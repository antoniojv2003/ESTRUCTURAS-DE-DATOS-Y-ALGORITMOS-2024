/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControladorPrincipal;

import AdministracionDeAgenda.Agenda;
import AdministracionDeAgenda.Contacto;

/**
 *
 * @author Usuario
 */
public class Principal { //clase donde estará el método main
    public static void main(String[] args) {
        
        //PRUEBAS
        Agenda Agenda1=Agenda.crearAgenda();
        
        System.out.println(Agenda1.esVacia());
        
        Contacto contacto1=new Contacto("Juan","81654","juanmiguel@gmail.com");
        Contacto contacto2=new Contacto("Camila","56785","camilasuarez@gmail.com");
        Contacto contacto3=new Contacto("Sergio","75421","sergiopereyra@gmail.com");
        Agenda1.agregar(contacto1);
        Agenda1.agregar(contacto2);
        Agenda1.agregar(contacto3);
        System.out.println(Agenda1.esVacia());
        System.out.println(Agenda1.buscar("camila"));
        System.out.println(Agenda1.buscar("Juan"));
        System.out.println(Agenda1.buscar("Ricardo"));
                
        Agenda1.listar();
        System.out.println("Cantidad de contactos en la agenda: "+Agenda1.cantidad());
        
//        Agenda1.borrar("81654");
//        Agenda1.borrar("75421");
//        Agenda1.borrar("3445");
//        
//        System.out.println("AGENDA DESPUES DE ELIMINAR A SERGIO Y A JUAN");
// 
//        
//        Agenda1.listar();
//        
//        System.out.println("Cantidad de contactos en la agenda: "+Agenda1.cantidad());  
        System.out.println("\nCONTACTO DE LA POSICION 2:");
        System.out.println(Agenda1.enPosicion(2));
        
        
        
        
    }
    
}
