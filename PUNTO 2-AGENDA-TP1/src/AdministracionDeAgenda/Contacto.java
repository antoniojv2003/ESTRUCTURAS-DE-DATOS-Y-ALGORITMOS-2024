/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionDeAgenda;

import java.util.Objects;

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

    //REDEFINICION DE EQUALS Y HASHCODE
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + Objects.hashCode(this.telefono);
        hash = 31 * hash + Objects.hashCode(this.email);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        return Objects.equals(this.email, other.email);
    }
    
    
    
    
    
    
    
    
    
}
