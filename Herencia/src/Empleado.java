/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Bibiano Vasquez
 */
public class Empleado extends Persona{
    
    private int NumeroEmpleado;
    private String  departamento;
    private String puesto;
    
    public Empleado(){
        
    }
    public Empleado(String nombre, int edad, String sexo, int NumeroEmpleado, String departamento, String puesto){
        super(nombre,edad,sexo);
        this.NumeroEmpleado=NumeroEmpleado;
        this.departamento=departamento;
        this.puesto=puesto;
    }

    public int getNumeroEmpleado() {
        return NumeroEmpleado;
    }

    public void setNumeroEmpleado(int NumeroEmpleado) {
        this.NumeroEmpleado = NumeroEmpleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
}
