/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosUsuario;

import java.util.ArrayList;
import lógica.Actividad;

/**
 *
 * @author Matias
 */
public class Alumno {
    
    private String nombre;
    private ArrayList<Actividad> planTrabajo;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre){
        this.nombre=nombre;
        this.planTrabajo = new ArrayList<>();
    }
    
    public Alumno(String nombre, ArrayList<Actividad> workplan){
        this.nombre=nombre;
        this.planTrabajo=workplan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Actividad> getPlanTrabajo() {
        return planTrabajo;
    }

    public void setPlanTrabajo(ArrayList<Actividad> planTrabajo) {
        this.planTrabajo = planTrabajo;
    }
    
    public boolean comprobarPlanTrabajo(){
        boolean respuesta = false;
        if(!this.planTrabajo.isEmpty() && this.planTrabajo!=null)
            respuesta = true;
        if(this.planTrabajo==null)
            return false;
        return respuesta;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", planTrabajo=" + planTrabajo + '}';
    }
    
    
}
