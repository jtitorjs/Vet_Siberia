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
public class familia extends animales{
   private String apellidoP,apellidoM,correoelectronico;
   private int telefono,codigofamilia;

    public familia(String apellidoP, String apellidoM, String correoelectronico, int telefono, int codigofamilia, int edad, int codigoanimal, String tipo, String nombre, String diagnostico, String raza) {
        super(edad, codigoanimal, tipo, nombre, diagnostico, raza);
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.correoelectronico = correoelectronico;
        this.telefono = telefono;
        this.codigofamilia = codigofamilia;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCodigofamilia() {
        return codigofamilia;
    }

    public void setCodigofamilia(int codigofamilia) {
        this.codigofamilia = codigofamilia;
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
