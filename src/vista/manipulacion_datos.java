/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import javax.swing.JOptionPane;
import tipografias.fuentes;
import controlador.registro;
import modelo.animales;
import modelo.familia;
import modelo.medico;
/**
 *
 * @author aishiterushiro
 */
public class manipulacion_datos extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    fuentes tipoFuente;
    public manipulacion_datos() {
        initComponents();
        this.setLocationRelativeTo(null);
        tipoFuente =new fuentes();
        //cuerpo = new fuentes();
        jButton1.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton2.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton3.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton4.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel1.setFont(tipoFuente.fuente(tipoFuente.SCFT,0,9));
        jLabel2.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jLabel3.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jLabel4.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jLabel5.setFont(tipoFuente.fuente(tipoFuente.CYBER, 0, 20));
        jLabel6.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 14));
        jLabel17.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jLabel7.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jLabel14.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 9));
        jButton5.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton6.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel8.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel11.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel12.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel13.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel9.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel10.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel15.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel23.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel18.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel19.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel20.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel21.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel13.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel16.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel24.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 11));
        jLabel25.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 11));
        jLabel26.setFont(tipoFuente.fuente(tipoFuente.SCFT, 0, 11));
        jLabel27.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel28.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel29.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel30.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel31.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel32.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jButton7.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton8.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton9.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton10.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton11.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton12.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel34.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel35.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jLabel36.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 10));
        jButton13.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton14.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jButton15.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel37.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel38.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel39.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel42.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel43.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel44.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel45.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel49.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel50.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel51.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel52.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel53.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel54.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        jLabel55.setFont(tipoFuente.fuente(tipoFuente.NEBULA, 0, 9));
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ingresar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        buscar = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        modificar = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        eliminar = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\aishiterushiro\\Pictures\\perrito3.png")); // NOI18N

        jLabel47.setText("jLabel47");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 51));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        ingresar.setBackground(new java.awt.Color(242, 242, 242));
        ingresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingresar.setToolTipText("");

        jLabel7.setText("Ingresar paciente");

        jLabel8.setText("Nombre animal:");

        jLabel9.setText("Apellido paterno (familia):");

        jLabel10.setText("Apellido materno (familia):");

        jLabel11.setText("Edad:");

        jLabel12.setText("Tipo de animal:");

        jLabel13.setText("Raza:");

        jLabel14.setText("Ingresar familia");

        jLabel15.setText("Correo electronico:");

        jLabel16.setText("Telefono:");

        jButton5.setText("Ingresar paciente");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel17.setText("Ingresar medico");

        jLabel18.setText("Nombre:");

        jLabel19.setText("Apellido:");

        jLabel20.setText("Codigo:");

        jLabel21.setText("Especialidad:");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jButton6.setText("Ingresar medico");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel23.setText("Codigo animal:");

        jLabel56.setText("Codigo familia:");

        javax.swing.GroupLayout ingresarLayout = new javax.swing.GroupLayout(ingresar);
        ingresar.setLayout(ingresarLayout);
        ingresarLayout.setHorizontalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ingresarLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ingresarLayout.createSequentialGroup()
                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ingresarLayout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ingresarLayout.createSequentialGroup()
                                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ingresarLayout.createSequentialGroup()
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ingresarLayout.createSequentialGroup()
                                                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField5)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)))
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ingresarLayout.createSequentialGroup()
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(ingresarLayout.createSequentialGroup()
                                                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ingresarLayout.createSequentialGroup()
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ingresarLayout.createSequentialGroup()
                                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                                            .addComponent(jTextField10))))
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 15, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ingresarLayout.createSequentialGroup()
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ingresarLayout.createSequentialGroup()
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField11)
                                            .addComponent(jTextField12)))
                                    .addGroup(ingresarLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96))))
        );
        ingresarLayout.setVerticalGroup(
            ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ingresarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("<html> <body>   <p style=\"font-family:courier;color:Tomato;\">Ingresar</p>  </body> </html> ", ingresar);

        buscar.setBackground(new java.awt.Color(242, 242, 242));
        buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buscar.setLayout(null);

        jLabel24.setText("Buscar paciente:");
        buscar.add(jLabel24);
        jLabel24.setBounds(10, 10, 149, 13);

        jLabel25.setText("Buscar familia:");
        buscar.add(jLabel25);
        jLabel25.setBounds(10, 120, 149, 13);

        jLabel26.setText("Buscar medico:");
        buscar.add(jLabel26);
        jLabel26.setBounds(10, 240, 149, 13);

        jLabel27.setText("Por codigo :");
        buscar.add(jLabel27);
        jLabel27.setBounds(30, 50, 104, 13);
        buscar.add(jTextField18);
        jTextField18.setBounds(150, 50, 90, 19);

        jLabel28.setText("Por apellido:");
        buscar.add(jLabel28);
        jLabel28.setBounds(30, 90, 114, 13);
        buscar.add(jTextField19);
        jTextField19.setBounds(150, 90, 90, 19);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        buscar.add(jScrollPane1);
        jScrollPane1.setBounds(400, 50, 240, 70);

        jLabel29.setText("Por codigo paciente :");
        buscar.add(jLabel29);
        jLabel29.setBounds(30, 160, 97, 13);

        jLabel30.setText("Por apellido : ");
        buscar.add(jLabel30);
        jLabel30.setBounds(30, 200, 110, 13);
        buscar.add(jTextField20);
        jTextField20.setBounds(150, 160, 90, 19);
        buscar.add(jTextField21);
        jTextField21.setBounds(150, 200, 90, 19);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        buscar.add(jScrollPane2);
        jScrollPane2.setBounds(400, 160, 240, 71);

        jLabel31.setText("Por codigo :");
        buscar.add(jLabel31);
        jLabel31.setBounds(40, 280, 97, 13);

        jLabel32.setText("Por Apellido: ");
        buscar.add(jLabel32);
        jLabel32.setBounds(40, 320, 130, 13);
        buscar.add(jTextField22);
        jTextField22.setBounds(150, 280, 90, 19);
        buscar.add(jTextField23);
        jTextField23.setBounds(150, 320, 90, 19);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        buscar.add(jScrollPane3);
        jScrollPane3.setBounds(400, 280, 240, 70);

        jButton7.setText("Buscar");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        buscar.add(jButton7);
        jButton7.setBounds(300, 50, 80, 21);

        jButton8.setText("Buscar");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        buscar.add(jButton8);
        jButton8.setBounds(300, 90, 80, 21);

        jButton9.setText("Buscar");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        buscar.add(jButton9);
        jButton9.setBounds(300, 160, 80, 21);

        jButton10.setText("Buscar");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        buscar.add(jButton10);
        jButton10.setBounds(300, 200, 80, 21);

        jButton11.setText("Buscar");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        buscar.add(jButton11);
        jButton11.setBounds(300, 280, 80, 21);

        jButton12.setText("Buscar");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        buscar.add(jButton12);
        jButton12.setBounds(300, 320, 80, 21);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/Screenshot_20201129-023109.png"))); // NOI18N
        buscar.add(jLabel48);
        jLabel48.setBounds(560, 160, 150, 360);

        jTabbedPane1.addTab("<html> <body>   <p style=\"font-family:courier;color:Tomato;\">Buscar</p>  </body> </html> ", buscar);

        modificar.setBackground(new java.awt.Color(242, 242, 242));
        modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        modificar.setLayout(null);

        jLabel34.setText("Modificar Paciente.");
        modificar.add(jLabel34);
        jLabel34.setBounds(10, 10, 370, 33);

        jLabel35.setText("Modificar Familia.");
        modificar.add(jLabel35);
        jLabel35.setBounds(10, 150, 370, 28);

        jLabel36.setText("Modificar Medico.");
        modificar.add(jLabel36);
        jLabel36.setBounds(10, 270, 360, 29);

        jLabel37.setText("Codigo animal:");
        modificar.add(jLabel37);
        jLabel37.setBounds(380, 20, 100, 13);

        jLabel38.setText("Codigo familia:");
        modificar.add(jLabel38);
        jLabel38.setBounds(370, 160, 100, 13);

        jLabel39.setText("Codigo medico:");
        modificar.add(jLabel39);
        jLabel39.setBounds(370, 280, 100, 13);

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField24);
        jTextField24.setBounds(490, 20, 79, 21);

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField25);
        jTextField25.setBounds(480, 160, 83, 21);

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField26);
        jTextField26.setBounds(480, 280, 83, 21);

        jLabel40.setText("______________________________________________________________________________________________________________________________");
        modificar.add(jLabel40);
        jLabel40.setBounds(11, 130, 706, 13);

        jLabel41.setText("_________________________________________________________________________________________________________________________________");
        modificar.add(jLabel41);
        jLabel41.setBounds(1, 249, 726, 13);

        jLabel42.setText("Nombre:");
        modificar.add(jLabel42);
        jLabel42.setBounds(49, 53, 88, 13);

        jLabel43.setText("Edad:");
        modificar.add(jLabel43);
        jLabel43.setBounds(49, 78, 88, 13);

        jLabel44.setText("Tipo:");
        modificar.add(jLabel44);
        jLabel44.setBounds(49, 104, 88, 13);

        jLabel45.setText("Diagnostico:");
        modificar.add(jLabel45);
        jLabel45.setBounds(262, 53, 88, 13);

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField27);
        jTextField27.setBounds(141, 50, 74, 21);

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField28);
        jTextField28.setBounds(141, 75, 74, 21);

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField29);
        jTextField29.setBounds(141, 101, 74, 21);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        modificar.add(jScrollPane4);
        jScrollPane4.setBounds(354, 50, 178, 74);

        jButton13.setText("Modificar");
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        modificar.add(jButton13);
        jButton13.setBounds(580, 70, 90, 50);

        jLabel49.setText("Apellido Paterno");
        modificar.add(jLabel49);
        jLabel49.setBounds(50, 190, 90, 13);

        jButton14.setText("Modificar");
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        modificar.add(jButton14);
        jButton14.setBounds(580, 200, 90, 50);

        jButton15.setText("Modificar");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        modificar.add(jButton15);
        jButton15.setBounds(580, 320, 90, 50);

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/perrito2.jpg"))); // NOI18N
        jLabel46.setText("jLabel46");
        modificar.add(jLabel46);
        jLabel46.setBounds(420, 60, 640, 360);

        jLabel50.setText("Apellido Materno:");
        modificar.add(jLabel50);
        jLabel50.setBounds(50, 230, 90, 20);

        jLabel51.setText("Correo Electronico:");
        modificar.add(jLabel51);
        jLabel51.setBounds(240, 190, 150, 13);

        jLabel52.setText("Telefono:");
        modificar.add(jLabel52);
        jLabel52.setBounds(240, 230, 80, 13);

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField30);
        jTextField30.setBounds(140, 190, 80, 21);

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        modificar.add(jTextField31);
        jTextField31.setBounds(140, 230, 80, 21);

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField32);
        jTextField32.setBounds(370, 190, 80, 21);

        jTextField33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField33);
        jTextField33.setBounds(370, 230, 80, 21);

        jLabel53.setText("Nombre:");
        modificar.add(jLabel53);
        jLabel53.setBounds(50, 310, 100, 13);

        jLabel54.setText("Apellido:");
        modificar.add(jLabel54);
        jLabel54.setBounds(50, 340, 100, 13);

        jLabel55.setText("Especialidad:");
        modificar.add(jLabel55);
        jLabel55.setBounds(240, 310, 90, 13);

        jTextField34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField34);
        jTextField34.setBounds(130, 310, 80, 21);

        jTextField35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField35);
        jTextField35.setBounds(130, 340, 80, 21);

        jTextField36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modificar.add(jTextField36);
        jTextField36.setBounds(320, 310, 80, 21);

        jTabbedPane1.addTab("<html> <body>   <p style=\"font-family:courier;color:Tomato;\">Modificar</p>  </body> </html> ", modificar);

        eliminar.setBackground(new java.awt.Color(242, 242, 242));
        eliminar.setLayout(null);
        eliminar.add(jTextField1);
        jTextField1.setBounds(220, 140, 110, 19);
        eliminar.add(jTextField2);
        jTextField2.setBounds(220, 190, 110, 19);
        eliminar.add(jTextField3);
        jTextField3.setBounds(220, 240, 110, 19);
        eliminar.add(jTextField4);
        jTextField4.setBounds(220, 290, 110, 19);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ingresar codigo /animal/");
        eliminar.add(jLabel1);
        jLabel1.setBounds(20, 140, 203, 20);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresar codigo  /familiar/");
        eliminar.add(jLabel2);
        jLabel2.setBounds(20, 190, 203, 20);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingresar codigo /medico/");
        eliminar.add(jLabel3);
        jLabel3.setBounds(20, 240, 203, 20);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingresar codigo /transaccion/");
        eliminar.add(jLabel4);
        jLabel4.setBounds(20, 290, 197, 20);

        jButton1.setText("Eliminar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        eliminar.add(jButton1);
        jButton1.setBounds(390, 131, 90, 40);

        jButton2.setText("Eliminar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        eliminar.add(jButton2);
        jButton2.setBounds(390, 181, 90, 40);

        jButton3.setText("Eliminar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        eliminar.add(jButton3);
        jButton3.setBounds(390, 231, 90, 40);

        jButton4.setText("Eliminar");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        eliminar.add(jButton4);
        jButton4.setBounds(390, 281, 90, 40);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("CUIDADO*");
        eliminar.add(jLabel5);
        jLabel5.setBounds(18, 11, 483, 13);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Esta eliminando informacion permanentemente!!");
        eliminar.add(jLabel6);
        jLabel6.setBounds(18, 35, 503, 38);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fotos/perrito3_1.png"))); // NOI18N
        eliminar.add(jLabel33);
        jLabel33.setBounds(450, 10, 260, 370);

        jTabbedPane1.addTab("<html> <body>   <p style=\"font-family:courier;color:Tomato;\">Eliminar</p>  </body> </html> ", eliminar);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int cod;      
        try {
            cod = Integer.parseInt(jTextField4.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField4.requestFocus();
            return;
        }
        registro rg = new registro();
        if (rg.eliminar(cod,4)) {
            JOptionPane.showMessageDialog(this, "Se elimino transaccion: " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino la transaccion: " + cod, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int cod;      
        try {
            cod = Integer.parseInt(jTextField1.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
            return;
        }
        registro rg = new registro();
        if (rg.eliminar(cod,1)) {
            JOptionPane.showMessageDialog(this, "Se elimino animal: " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino el animal: " + cod, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int cod;      
        try {
            cod = Integer.parseInt(jTextField2.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
            return;
        }
        registro rg = new registro();
        if (rg.eliminar(cod,2)) {
            JOptionPane.showMessageDialog(this, "Se elimino familiar: " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino familiar: " + cod, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int cod;      
        try {
            cod = Integer.parseInt(jTextField3.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
            return;
        }
        registro rg = new registro();
        if (rg.eliminar(cod,3)) {
            JOptionPane.showMessageDialog(this, "Se elimino medico " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se elimino medico " + cod, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         String nomAni,tipoAni,raza,apellidoP,apellidoM,correo;
        int cod , telefono, edad,codfam;
        String diagnostico=null;
        
        try {
            cod= Integer.parseInt(jTextField17.getText());
            telefono = Integer.parseInt(jTextField12.getText());
            nomAni =jTextField5.getText();
            tipoAni =jTextField9.getText();
            raza =jTextField10.getText();
            apellidoP =jTextField6.getText();
            apellidoM =jTextField7.getText();
            correo =jTextField11.getText();
            edad = Integer.parseInt(jTextField8.getText());
            codfam= Integer.parseInt(jTextField37.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el ingreso", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField17.setText(" ");
            jTextField12.setText(" ");
            jTextField5.setText(" ");
            jTextField9.setText(" ");
            jTextField10.setText(" ");
            jTextField6.setText(" ");
            jTextField7.setText(" ");
            jTextField11.setText(" ");
            jTextField8.setText(" ");
            return;
        }    
                                                //codigofamilia,apellidoP,apellidoM,telefono,correoelectronico
        registro rg = new registro();
        
        if (rg.agregarAnimal(new animales(edad,cod,tipoAni,nomAni,diagnostico,raza)) )  {
            
            JOptionPane.showMessageDialog(this, "Se agregó paciente " , "Información", JOptionPane.INFORMATION_MESSAGE);
        }else 
            JOptionPane.showMessageDialog(this, "No se agregó paciente " , "Error", JOptionPane.ERROR_MESSAGE);
            
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           String nombre, apellido, especialidad;
           int codigomed;
        
        
        try {
            nombre= jTextField13.getText();
            apellido = jTextField14.getText();
            especialidad =jTextField15.getText();
            codigomed = Integer.parseInt(jTextField16.getText());
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en el ingreso", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField13.setText(" ");
            jTextField14 .setText(" ");   
            jTextField15.setText(" ");
            jTextField16.setText(" ");
           return;
        }    
        registro rg = new registro();
        if (rg.agregarMedico(new medico(nombre,apellido,especialidad,codigomed)) )  {
            JOptionPane.showMessageDialog(this, "Se agregó medico " , "Información", JOptionPane.INFORMATION_MESSAGE);
            jTextField13.setText(" ");
            jTextField14 .setText(" ");   
            jTextField15.setText(" ");
            jTextField16.setText(" ");
        } else {
            JOptionPane.showMessageDialog(this, "No se agregó medico " , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int cod; 
        String apellidoM = null,apellidoP = null;
        
        try {
            cod = Integer.parseInt(jTextField18.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField18.requestFocus();
            return;
        }
        registro rg = new registro();
        familia fam = rg.buscarAniPorApellido(apellidoP, apellidoM);

        animales ani = rg.buscarPorCodigoAni(cod);
        
       
        if (ani != null) {
           jTextArea1.setText("Codigo = " + ani.getCodigoanimal() + "\n");
           jTextArea1.append("Nombre = " + ani.getNombre() + "\n");
           jTextArea1.append("Tipo = " + ani.getTipo()+ "\n");
           jTextArea1.append("Diagnostico = " + ani.getDiagnostico()+ "\n");
           jTextArea1.append("Apellido paterno = " + fam.getApellidoP()+ "\n");
           jTextArea1.append("Apellido materno = " + fam.getApellidoM()+ "\n");
           jTextArea1.append("Telefono = " + fam.getTelefono()+ "\n");
           jTextArea1.append("Correo electronico = " + fam.getCorreoelectronico());




        }
        else JOptionPane.showMessageDialog(this, "Codigo inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        String apellidoM ,apellidoP;
        
        try {
            apellidoM = jTextField19.getText();
            apellidoP = jTextField19.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Apellido no valido", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField19.requestFocus();
            return;
        }
        registro rg = new registro();
        familia fam = rg.buscarAniPorApellido(apellidoP, apellidoM);
        

        
        
       
        if (fam != null) {
           
           jTextArea1.setText("Apellido paterno = " + fam.getApellidoP()+ "\n");
           jTextArea1.append("Apellido materno = " + fam.getApellidoM()+ "\n");
           jTextArea1.append("Telefono = " + fam.getTelefono()+ "\n");
           jTextArea1.append("Correo electronico = " + fam.getCorreoelectronico());
           jTextArea1.append("Codigo animal  = " + fam.getCodigoanimal() + "\n");
           jTextArea1.append("Nombre = " + fam.getNombre() + "\n");
           jTextArea1.append("Edad = " + fam.getEdad() + "\n");
           jTextArea1.append("Tipo = " + fam.getTipo()+ "\n");
           jTextArea1.append("Raza = " + fam.getRaza()+ "\n");
           jTextArea1.append("Diagnostico = " + fam.getDiagnostico()); 
           



        }
        else JOptionPane.showMessageDialog(this, "apellido inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
              
              int cod;
        
        try {
            cod = Integer.parseInt(jTextField20.getText());
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField20.requestFocus();
            return;
        }
        registro rg = new registro();
        familia fam = rg.buscarFamPorCodigoAni(cod);

        
        
       
        if (fam != null) {
           jTextArea2.setText("Codigo familia = " + fam.getCodigofamilia()+ "\n");
           jTextArea2.append("Apellido paterno = " + fam.getApellidoP()+ "\n");
           jTextArea2.append("Apellido materno = " + fam.getApellidoM()+ "\n");
           jTextArea2.append("Telefono = " + fam.getTelefono()+ "\n");
           jTextArea2.append("Correo electronico = " + fam.getCorreoelectronico());
           jTextArea2.append("Codigo animal  = " + fam.getCodigoanimal() + "\n");
           jTextArea2.append("Nombre paciente = " + fam.getNombre() );
           
           



        }
        else JOptionPane.showMessageDialog(this, "Codigo inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
          String apellidoM ,apellidoP;
        
        try {
            apellidoM = jTextField21.getText();
            apellidoP = jTextField21.getText();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Apellido no valido", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField21.requestFocus();
            return;
        }
        registro rg = new registro();
        familia fam = rg.buscarAniPorApellido(apellidoP, apellidoM);
        

        
        
       
        if (fam != null) {
           
           jTextArea2.setText("Codigo familia = " + fam.getCodigofamilia()+ "\n");
           jTextArea2.append("Apellido paterno = " + fam.getApellidoP()+ "\n");
           jTextArea2.append("Apellido materno = " + fam.getApellidoM()+ "\n");
           jTextArea2.append("Telefono = " + fam.getTelefono()+ "\n");
           jTextArea2.append("Correo electronico = " + fam.getCorreoelectronico());
           jTextArea2.append("Codigo animal  = " + fam.getCodigoanimal() + "\n");
           jTextArea2.append("Nombre paciente = " + fam.getNombre() );
           



        }
        else JOptionPane.showMessageDialog(this, "Apellido inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       int cod; 
        
        
        try {
            cod = Integer.parseInt(jTextField22.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El codigo debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField22.requestFocus();
            return;
        }
        registro rg = new registro();
        medico med = rg.buscarMedPorCod(cod);

         
        
       
        if (med != null) {
           jTextArea3.setText("Codigo = " + med.getCodigomedico() + "\n");
           jTextArea3.append("Nombre = " + med.getNombre() + "\n");
           jTextArea3.append("Apellido = " + med.getApellido()+ "\n");
           jTextArea3.append("Especialidad = " + med.getEspecialidad());
           




        }
        else JOptionPane.showMessageDialog(this, "Codigo inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        String apellido;
        
        try {
            apellido = jTextField23.getText();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Apellido no valido", "Validación", JOptionPane.WARNING_MESSAGE);
            jTextField23.requestFocus();
            return;
        }
        registro rg = new registro();
        medico med = rg.buscarMedPorApellido(apellido);
        

        
        
       
        if (med != null) {
           
           jTextArea3.setText("Codigo = " + med.getCodigomedico() + "\n");
           jTextArea3.append("Nombre = " + med.getNombre() + "\n");
           jTextArea3.append("Apellido = " + med.getApellido()+ "\n");
           jTextArea3.append("Especialidad = " + med.getEspecialidad());
           



        }
        else JOptionPane.showMessageDialog(this, "Apellido inexistente", "Informacion", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String nombre=null,tipo = null,diagnostico = null,apellidop=null,apellidom=null,correo=null,raza=null;
        
        int edad,telefono=0,codigofam=0,cod;
        int opc=1;
        
        
            try {
                cod = Integer.parseInt(jTextField24.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ingrese un codigo valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField24.requestFocus();
                return;
            
             }
            try {
                nombre = jTextField27.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nombre no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField27.requestFocus();
                return;
            }
            try {
                edad = Integer.parseInt(jTextField28.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "El la edad debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField28.requestFocus();
                return;
                }
            try {
                tipo = jTextField29.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tipo de animal no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField29.requestFocus();
                return;
            }
            try {
                diagnostico = jTextArea4.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Diagnostico no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextArea4.requestFocus();
                return;
            }
        
       
        registro rg = new registro();
        if (rg.modificarAnimalFam(new familia(apellidop, apellidom, correo, telefono,codigofam, edad, cod, tipo, nombre, diagnostico, raza),opc)) {
            JOptionPane.showMessageDialog(this, "Se modificó paciente  " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);}  
        else
                        JOptionPane.showMessageDialog(this, "no se modifico el paciente  " + cod, "Información", JOptionPane.INFORMATION_MESSAGE); 

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
String nombre=null,tipo = null,diagnostico = null,apellidop,apellidom,correo,raza=null;
int edad=0,telefono,codigofam,cod=0;
int opc=2;
        
        
            try {
                codigofam = Integer.parseInt(jTextField25.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ingrese un codigo valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField25.requestFocus();
                return;
            
             }
            try {
                apellidop = jTextField30.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Apellido no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField30.requestFocus();
                return;
            }
            try {
                apellidom = jTextField31.getText();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Apellido no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField31.requestFocus();
                return;
                }
            try {
                correo = jTextField32.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Correo no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField32.requestFocus();
                return;
            }
            try {
                telefono = Integer.parseInt(jTextField33.getText());
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "telefono no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField33.requestFocus();
                return;
            }
        
       
        registro rg = new registro();
        if (rg.modificarAnimalFam(new familia(apellidop, apellidom, correo, telefono,codigofam, edad, cod, tipo, nombre, diagnostico, raza),opc)) {
            JOptionPane.showMessageDialog(this, "Se modificó la familia  " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);}  
        else
                        JOptionPane.showMessageDialog(this, "no se modifico la familia  " + cod, "Información", JOptionPane.INFORMATION_MESSAGE);     }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
String nombre,apellido,especialidad;
int codMedico;
        
        
        
            try {
                codMedico = Integer.parseInt(jTextField26.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ingrese un codigo valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField26.requestFocus();
                return;
            
             }
            try {
                nombre = jTextField34.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Nombre no valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField27.requestFocus();
                return;
            }
            try {
                apellido = jTextField35.getText();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "El apellido no es valido", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField35.requestFocus();
                return;
                }
            try {
                especialidad = jTextField36.getText();
            
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "TEspecialidad no valida", "Validación", JOptionPane.WARNING_MESSAGE);
                jTextField36.requestFocus();
                return;
            }
           
        
       
        registro rg = new registro();
        if (rg.modificarMedico(new medico(nombre, apellido, especialidad, codMedico))) {
            JOptionPane.showMessageDialog(this, "Se modificó Medico  " + codMedico, "Información", JOptionPane.INFORMATION_MESSAGE);}  
        else
                        JOptionPane.showMessageDialog(this, "no se modifico el Medico  " + codMedico, "Información", JOptionPane.INFORMATION_MESSAGE); 
    }//GEN-LAST:event_jButton15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(manipulacion_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manipulacion_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manipulacion_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manipulacion_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manipulacion_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buscar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JPanel ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel modificar;
    // End of variables declaration//GEN-END:variables
}
