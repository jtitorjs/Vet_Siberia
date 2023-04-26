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
public class animales {
    
    protected int edad,codigoanimal;
    protected String tipo,nombre,diagnostico,raza;

    public animales(int edad, int codigoanimal, String tipo, String nombre, String diagnostico, String raza) {
        this.edad = edad;
        this.codigoanimal = codigoanimal;
        this.tipo = tipo;
        this.nombre = nombre;
        this.diagnostico = diagnostico;
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoanimal() {
        return codigoanimal;
    }

    public void setCodigoanimal(int codigoanimal) {
        this.codigoanimal = codigoanimal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
