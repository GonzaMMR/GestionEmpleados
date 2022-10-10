/*
Interfaces de acesso a datos con un conjunto de operaciones comunes
 */
package com.empresa.accesoaDatos;

/**
 *
 * @author Alumno Mañana
 */
public interface IAcessoaDatos {
    
    int MAX__REGISTRO = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
