
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Herencia {

    public static void main(String[] args) {
       Scanner lee=new Scanner(System.in);
       
       String nombre,sexo;
       int edad;
       
        
        Empleado E=new Empleado();
        
        System.out.println("Ingrese el nombre del Empleado");
        nombre=lee.next();
        System.out.println("Ingrese la edad");
        edad=lee.nextInt();
        System.out.println("Ingrese el sexo");
        sexo=lee.next();
        
        
        E.setNombre(nombre);
        E.setEdad(edad);
        E.setSexo(sexo);
        
    
        
        E.setNumeroEmpleado(12345);
        E.setPuesto("Administrador");
        E.setDepartamento("Sistemas");
        
        System.out.println("El nombre del empleado es "+ E.getNombre());
         System.out.println("Sexo:  "+E.getSexo());
        System.out.println("Edad:  "+E.getEdad());
        
        
        
    }
    
}
