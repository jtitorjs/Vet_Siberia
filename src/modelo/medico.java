/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aishiterushiro
 */
public class medico {
 private String nombre,apellido,especialidad;
 private int codigomedico;

    public medico(String nombre, String apellido, String especialidad,  int codigomedico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        
        this.codigomedico = codigomedico;
    }

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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

   

    public int getCodigomedico() {
        return codigomedico;
    }

    public void setCodigomedico(int codigomedico) {
        this.codigomedico = codigomedico;
    }
 
}
