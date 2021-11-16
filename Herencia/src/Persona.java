/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    
    public Persona(){
        
    }
    public Persona (String nombre, int edad, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;       
    }
    
    public void ImprimirMensaje(){
        System.out.println("Soy una persona");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String  getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
}
