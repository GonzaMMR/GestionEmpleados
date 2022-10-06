/*
*   quiere que el unico constructor (reciba los 2 parametros: estudios y departamento)
    Gerente es una hija de empleado
 */
package Domino;

/**
 *
 * @author Alumno Mañana
 */
public class Gerente extends Empleado{
    
    private int estudios;
    private String departamento;
    
    
    //constructor
    public Gerente(int estudios, String departamento, int NumSS, double salario, String nombre, String apellido) {
        super(NumSS, salario, nombre, apellido);
        this.estudios = estudios;
        this.departamento = departamento;
    }

    public int getEstudios() {
        return estudios;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    
}
