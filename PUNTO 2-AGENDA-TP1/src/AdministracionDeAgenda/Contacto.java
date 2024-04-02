/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionDeAgenda;

/**
 *
 * @author Usuario
 */
public class Contacto {
    //atributos del contacto
    String nombre;
    String telefono;
    String email;
    //constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    //métodos get y set
    public String obtenerNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerTelefono() {
        return telefono;
    }

    public void asignarTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String obtenerEmail() {
        return email;
    }

    public void asignarEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + '}';
    }
    
    
    
    
    
    
    
}
