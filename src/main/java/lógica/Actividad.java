/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lógica;

/**
 *
 * @author Matias
 */
import java.util.ArrayList;

/**
 *
 * @author Matias
 */
public class Actividad {
    
    private String titulo;
    private String enunciado;

public Actividad(){     
    this.enunciado="";
    this.titulo="";  
}

public Actividad(String titulo, String enunciado){     
    this.enunciado=enunciado;
    this.titulo=titulo;   
}

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
