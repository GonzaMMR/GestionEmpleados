/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Domino.Empleado;
import Domino.Persona;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class principal {
    static Scanner ent = new Scanner(System.in);
    public static int contador;
    
    public static int alea(int li, int ls){//función de JAVA
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
     
    
    
    public static void main(String[] args) {
        Empleado formulario [] = new Empleado[2];
        Empleado e1 = new Empleado("gonzalo","moraño");
        Empleado e2 = new Empleado("niko","beltreke");
        
        /*
        //crear una apersona
        
        Persona p1 = new Persona ("GONZALO","MORAÑO");
        Persona p2 = new Persona ("NIKO","BELTREKE");
        
        //visualizar la persona
        System.out.println(p1);
        System.out.println(p2);
        */
        
        formulario[0]=e1;
        formulario[1]=e2;
        
        for (int i = 0; i < formulario.length; i++) {
            System.out.println(formulario[i]);
        }
        
        System.out.println("\n\n====================\n\n");
        System.out.println("matriz de personas");
        matriz_de_personas();
        
        //imprimiendo numeros con variables
        System.out.println("Primera llamada con 3 argumentos: ");
        imprimirNumeros(1, 2, 4);
        System.out.println("Segunda llamada con 2 argumentos: ");
        imprimirNumeros(3, 7);

    }
    
    
    public static void matriz_de_personas(){
        
        
    Integer numeros[]={12,2,43};
       
        Persona e1 = new Empleado("Loken","swift");
        Persona e2 = new Empleado("LUIS","morado");
        Persona e3 = new Empleado("Loken","swift");
        Persona e4 = new Empleado("LUIS","morado");
        
        Persona empleado[]= {e1,e2};
        
        Persona matri[][]=new Persona [2][2];
        matri[0][0]=e1;
        matri[0][1]=e2;
        matri[1][0]=e3;
        matri[1][1]=e4;
        
      /* for (int i = 0; i < empleado.length; i++) {
          
        }*/
        for (int i = 0; i < matri.length; i++) {
            if (i==0) System.out.println("socios: ");
            else System.out.println("Directores: ");
            for (int j = 0; j < matri[i].length; j++) {
                System.out.println(matri[i][j]);
            }
                
        }
        //llamamos al metodo imprimir para imprimir tanto mi lista de empleados como la de los numeros
        System.out.println("imprimiendo numero");
        imprimir(numeros);
        System.out.println("imprimiendo empleados");
        imprimir(empleado);
        
        
        
    }
    
    public static void imprimir(Object lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista"+i+" = "+lista[i]);
        }
    }

    public static void imprimirNumeros( int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero = " + i + "] = " +numeros[i]);
        }
    }
    
}
