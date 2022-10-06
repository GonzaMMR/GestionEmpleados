/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

import Principal.principal;

/**
 *
 * crear una clase  hija = empleado, numero ss y que tenga un metodo imprimir pot pantalla
 */
public  class Persona  {
    private String nombre,apellido;
    private int idpersona;
    //contador de persona
    private static int contadorpersona;
    
//getter

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getIdpersona() {
        return idpersona;
    }

    public static int getContadorpersona() {
        return contadorpersona;
    }

  

//setter
    public static void setContadorpersona(int contadorpersona) {
        Persona.contadorpersona = contadorpersona;
    }
      public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
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
    
    public final void imprimir(){
        System.out.println("imprimiendo desde la clase padre ...");
    }

    
}
