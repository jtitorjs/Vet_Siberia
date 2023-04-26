/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipografias;
import java.awt.Font;
import java.io.InputStream;
/**
 *
 * @author aishiterushiro
 */
public class fuentes {
    private Font font = null;
    public String NEBULA = "Nebula-Regular.otf";
    public String SCFT = "Starcraft Normal.ttf";
    public String TL = "True Lies.ttf";
    public String TOKYO = "Tokyo 2097.otf";
    public String CYBER = "cyberdyne3d.ttf";
    public String DM = "DeathMetal logo.ttf";
    
     /* Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2
 * tamanio = float
 */
    
    
 public Font fuente( String fontName, int estilo, float tamanio)
    {
         try {
            //Se carga la fuente
            InputStream is =  getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);            
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
