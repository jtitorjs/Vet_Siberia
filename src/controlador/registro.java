/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DB.conexion;
import java.sql.SQLException;
import modelo.animales;
import modelo.familia;
import modelo.medico;
import modelo.transacciones;

/**
 *
 * @author aishiterushiro
 */
public class registro {
    public ArrayList<animales> listar_animales() {
        ArrayList<animales> lista = new ArrayList();
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM animales order by codigoanimal";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                animales ani = new animales(rs.getInt("edad"),rs.getInt("codigoanimal"),rs.getString("tipo"),rs.getString("nombre"),rs.getString("diagnostico"),rs.getString("raza"));
                lista.add(ani);
            } 
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return lista;
    }
    
    public ArrayList<familia> listar_familia() {
        ArrayList<familia> lista1 = new ArrayList();
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT apellidoP,apellidoM,correoelectronico,telefono,codigofamilia FROM familia  ORDER BY codigofamilia";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                familia fam = new familia(rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getString("correoelectronico"),rs.getInt("telefono"),rs.getInt("codigofamilia"),rs.getInt("edad"),rs.getInt("codigoanimal"),rs.getString("tipo"),rs.getString("nombre"),rs.getString("diagnostico"),rs.getString("raza"));
                lista1.add(fam);
            } 
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return lista1;
    }
    public ArrayList<medico> listar_medico() {
        ArrayList<medico> lista = new ArrayList();
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM medico order by codigomedico";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                medico med = new medico(rs.getString("nombre"),rs.getString("apellido"),rs.getString("especialidad"),rs.getInt("codigomedico"));
                lista.add(med);
            } 
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return lista;
    }
    public ArrayList<transacciones> listar_transacciones() {
        ArrayList<transacciones> lista = new ArrayList();
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM transacciones order by codigo_trans";
            PreparedStatement stmt = cnx.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                transacciones trans = new transacciones(rs.getInt("codigo_trans"),rs.getInt("monto"));
                lista.add(trans);
            } 
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return lista;
    }
    public boolean eliminar(int cod,int cod_eliminacion) { 
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            if (cod_eliminacion == 1){
            String query = "DELETE FROM animales WHERE codigoanimal=?";
            
          PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
        }
            if (cod_eliminacion ==2){
                String query = "DELETE FROM familia WHERE codigofamilia=?";
            
          PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
            
            }
            if (cod_eliminacion == 3){
            String query = "DELETE FROM medico WHERE codigomedico=?";
            
          PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
            }
            if(cod_eliminacion ==4 ){
            String query = "DELETE FROM transacciones WHERE codigo_trans=?";
            
          PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
            }
            else return false;     
        } catch (Exception e) {
            return false;
        }}
    
   public animales buscarPorCodigoAni(int cod) {
        animales ani = null;
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM animales WHERE codigoanimal=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                ani = new animales(rs.getInt("edad"),rs.getInt("codigoanimal"),rs.getString("tipo"),rs.getString("nombre"),rs.getString("diagnostico"),rs.getString("raza"));
            }
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return ani;
    } 
    public boolean agregarAnimal(animales ani) {
        try {
            conexion conex = new conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "INSERT INTO animales(edad,codigoanimal,tipo,nombre,diagnostico,raza) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, ani.getEdad());
            stmt.setInt(2, ani.getCodigoanimal());
            stmt.setString(3, ani.getTipo());   
            stmt.setString(4, ani.getNombre()); 
            stmt.setString(5, null);    
            stmt.setString(6, ani.getRaza()); 
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean agregarDiagAnimal(animales ani) {
        try {
            conexion conex = new conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "INSERT  INTO animales (diagnostico) VALUES(?) WHERE codigoanimal=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, ani.getDiagnostico());
            stmt.setInt(2,ani.getCodigoanimal());
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean agregarFamilia(familia fam) {
        try {
            conexion conex = new conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "INSERT INTO familia(apellidoP,apellidoM,correoelectronico,telefono,codigofamilia,codigoanimal) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, fam.getApellidoP());
            stmt.setString(2, fam.getApellidoM());    
            stmt.setString(3, fam.getCorreoelectronico()); 
            stmt.setInt(4, fam.getTelefono()); 
            stmt.setInt(5, fam.getCodigofamilia()); 
            stmt.setInt(6, fam.getCodigoanimal()); 

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        }  catch (Exception e) {
            return false;
        }
        
    }
    public boolean agregarMedico(medico med) {
        try {
            conexion conex = new conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "INSERT INTO medico(codigomedico,nombre,apellido,especialidad) VALUES(?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, med.getCodigomedico());
            stmt.setString(2, med.getNombre());
            stmt.setString(3, med.getApellido());    
            stmt.setString(4, med.getEspecialidad()); 
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        }  catch (Exception e) {
            return false;
        }
        
    }
    public boolean agregarTrans(transacciones trans) {
        try {
            conexion conex = new conexion();
            Connection cnx = conex.obtenerConexion();
            String query = "INSERT INTO transacciones(codigo_trans,monto) VALUES(?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, trans.getCodigo_trans());
            stmt.setInt(2, trans.getMonto());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            return true;
        }  catch (Exception e) {
            return false;
        }
        
    }
     public familia buscarAniPorApellido(String apellidoP,String apellidoM) {
        familia fam = null;
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM familia WHERE apellidoP=? || apellidoM=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,apellidoP);
            stmt.setString(2,apellidoM);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fam = new familia(rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getString("correoelectronico"),rs.getInt("telefono"),rs.getInt("codigofamilia"),rs.getInt("edad"),rs.getInt("codigoanimal"),rs.getString("tipo"),rs.getString("nombre"),rs.getString("diagnostico"),rs.getString("raza"));
                
            }
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return fam;
    }
     public familia buscarFamPorCodigoAni(int cod) {
        familia fam = null;
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM familia WHERE codigoanimal=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,cod);
            
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                fam = new familia(rs.getString("apellidoP"),rs.getString("apellidoM"),rs.getString("correoelectronico"),rs.getInt("telefono"),rs.getInt("codigofamilia"),rs.getInt("edad"),rs.getInt("codigoanimal"),rs.getString("tipo"),rs.getString("nombre"),rs.getString("diagnostico"),rs.getString("raza"));
                
            }
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return fam;
    }
     public medico buscarMedPorCod(int cod) {
        medico med = null;
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM medico WHERE codigomedico=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1,cod);
            
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                med = new medico(rs.getString("nombre"),rs.getString("apellido"),rs.getString("especialidad"),rs.getInt("codigomedico"));
                
            }
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return med;
    }
     public medico buscarMedPorApellido(String apellido) {
        medico med = null;
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "SELECT * FROM medico WHERE apellido=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1,apellido);
            
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                med = new medico(rs.getString("nombre"),rs.getString("apellido"),rs.getString("especialidad"),rs.getInt("codigomedico"));
                
            }
            stmt.close();
            cnx.close();
        } catch (Exception e) {  }
        return med;
    }
     
        public boolean modificarAnimalFam(familia fam,int opc) {
            if (opc == 1){
                try {
            
                conexion conex = new conexion();
                Connection cnx = conex.obtenerConexion();
                String query = "UPDATE animales set edad=?,tipo=?,nombre=?,diagnostico=?,raza=? WHERE codigoanimal=?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setInt(1, fam.getEdad());
                stmt.setString(2, fam.getTipo());
                stmt.setString(3, fam.getNombre());
                stmt.setString(4, fam.getDiagnostico());
                stmt.setString(5, fam.getRaza());
                stmt.setInt(6, fam.getCodigoanimal());
                int filas = stmt.executeUpdate();
                stmt.close();
                cnx.close();
                if (filas == 1)
                    return true;
                else return false;
                } catch (Exception e) {
                 return false;
                }
            }
        if (opc ==2){
        try {
            
                conexion conex = new conexion();
                Connection cnx = conex.obtenerConexion();
                String query = "UPDATE familia set apellidoP=?,apellidoM=?,correoelectronico=?,telefono=?,codigoanimal=? WHERE codigofamilia=?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setString(1, fam.getApellidoP());
                stmt.setString(2, fam.getApellidoM());
                stmt.setString(3, fam.getCorreoelectronico());
                stmt.setInt(4, fam.getTelefono());
                stmt.setInt(5, fam.getCodigoanimal());
                int filas = stmt.executeUpdate();
                stmt.close();
                cnx.close();
                if (filas == 1)
                    return true;
                else return false;
                } catch (Exception e) {
                 return false;
                }
        }
        else
            return false;
       
    }
       public boolean modificarMedico(medico med) {
            
                try {
            
                conexion conex = new conexion();
                Connection cnx = conex.obtenerConexion();
                String query = "UPDATE medico set nombre=?,apellido=?,especialidad=? WHERE codigomedico=?";
                PreparedStatement stmt = cnx.prepareStatement(query);
                stmt.setString(1, med.getNombre());
                stmt.setString(2, med.getApellido());
                stmt.setString(3, med.getEspecialidad());
                stmt.setInt(4, med.getCodigomedico());
                int filas = stmt.executeUpdate();
                stmt.close();
                cnx.close();
                if (filas == 1)
                    return true;
                else return false;
                } catch (Exception e) {
                 return false;
                }
            }  
public boolean eliminardiag(int cod) { 
        try {
            conexion conexion1 = new conexion();
            Connection cnx = conexion1.obtenerConexion();
            String query = "DELETE diagnostico FROM animales WHERE codigoanimal=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, cod);
            int filas = stmt.executeUpdate();
            stmt.close();
            cnx.close();
            if (filas == 1)
               return true;
            else return false;
        }catch (Exception e) {
            return false;
        }
}
}


