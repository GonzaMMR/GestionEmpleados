/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

import Principal.principal;
import java.io.Serializable;

/**
 *
 * crear una clase  hija = empleado, numero ss y que tenga un metodo imprimir pot pantalla
 */
public  class Persona  implements Serializable{
    private String nombre,apellido;
    private int idpersona;
    //contador de persona
    private static int contadorpersona;
    
    //getter and setter (cada atributo )
    public String getNombre() {    
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public static int getContadorpersona() {
        return contadorpersona;
    }

    public static void setContadorpersona(int contadorpersona) {    
        Persona.contadorpersona = contadorpersona;
    }

//contructores
    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
        this.idpersona = ++Persona.contadorpersona;
        
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", idpersona=" + idpersona + '}';
    }
    
    //equals and hascode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.idpersona;
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
        final Persona other = (Persona) obj;
        if (this.idpersona != other.idpersona) {
            return false;
        }
        return true;
    }
    
    
    public final void imprimir(){
        System.out.println("imprimiendo desde la clase padre ...");
    }

    
}
