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
public class transacciones {
    private int codigo_trans,monto;

    public transacciones(int codigo_trans, int monto) {
        this.codigo_trans = codigo_trans;
        this.monto = monto;
    }

    public int getCodigo_trans() {
        return codigo_trans;
    }

    public void setCodigo_trans(int codigo_trans) {
        this.codigo_trans = codigo_trans;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    
    
}
