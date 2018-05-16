package Interfaz;

import Mundo.Gamer;
import javax.swing.JOptionPane;

import Mundo.*;

public class InterfazEquipoLoL extends javax.swing.JFrame {

    private EquipoLoL eQ;

    public InterfazEquipoLoL() {
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);

        int x = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width / 2 - this.getWidth() / 2;
        int y = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height / 2 - this.getHeight() / 2;
        this.setLocation(x, y);
        this.repaint();
    }

    public void limpiar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jLabel10.setText("");
        jLabel11.setText("");
        jLabel12.setText("");
        jLabel13.setText("");
        jLabel14.setText("");
        jLabel17.setText("");
        jLabel18.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitIntro = new javax.swing.JLabel();
        jTitArea = new javax.swing.JLabel();
        jBase = new javax.swing.JLabel();
        jSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelN = new javax.swing.JLabel();
        jLabelC = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelE = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Team League of Legends");
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitIntro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTitIntro.setText("League of Legends - Interfaz de usuario");
        getContentPane().add(jTitIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 32, -1, -1));

        jTitArea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTitArea.setText("Registro de Equipos - LOL");
        getContentPane().add(jTitArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 11, -1, -1));

        jBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Logo.png"))); // NOI18N
        getContentPane().add(jBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 250, 260));

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gamer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabelN.setText("Nombre :");

        jLabelC.setText("Campeón:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelN)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelC)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 90));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, -1));

        jButton3.setText("Retirar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 90, -1));

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, -1));

        jLabel3.setText("Win Rate Team : ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 20));

        jLabel4.setText("     ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 70, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Asesinatos : ");

        jLabel6.setText("Muertes : ");

        jLabel7.setText("Asistencias : ");

        jLabel8.setText("Victorias : ");

        jLabel9.setText("Derrotas : ");

        jLabel10.setText("      ");

        jLabel11.setText("      ");

        jLabel12.setText("     ");

        jLabel13.setText("     ");

        jLabel14.setText("    ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 150, 140));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("     ");

        jLabel18.setText("     ");

        jLabel15.setText("Win Rate : ");

        jLabel16.setText("KDA : ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 299, 150, 60));

        jLabel19.setText("2015 Riot Games, Inc. All rights reserved.   ");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 250, -1));

        jButton1.setText("Registrar Equipo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabelE.setText("Nombre :");
        getContentPane().add(jLabelE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel1.setText("-                              ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        jLabelL.setText("Liga :");
        getContentPane().add(jLabelL, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel2.setText("-                              ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton5.setText("Registrar Partida");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 140, -1));

        jButton6.setText("Mejor  jugador");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, -1));

        getAccessibleContext().setAccessibleName("Piloto");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nom, lig;
        try {
            nom = JOptionPane.showInputDialog(null, "Ingrese nombre del equipo : ");
            if (nom.equals("")) {
                throw new Exception("Los datos deben estar completos");
            }
            lig = JOptionPane.showInputDialog(null, "Ingrese nombre de la liga : ");
            if (lig.equals("")) {
                throw new Exception("Los datos deben estar completos");
            }
            eQ = new EquipoLoL(nom, lig);
            jLabel1.setText(eQ.consultarNombre());
            jLabel2.setText(eQ.consultarLiga());
            jButton1.setEnabled(false);
        } catch (NullPointerException e) {
        } catch (Exception e) {
            String msg = "" + e;
            JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String msg = "", nom, cam;
        int jug;
        limpiar();
        if (eQ != null) {
            if (eQ.determinarEqCompleto() != true) {
                try {
                    nom = JOptionPane.showInputDialog(null, "Ingrese nombre del jugador : ");
                    if (nom.equals("")) {
                        throw new Exception("Los datos deben estar completos");
                    }
                    cam = JOptionPane.showInputDialog(null, "Ingrese nombre del campeón : ");
                    if (cam.equals("")) {
                        throw new Exception("Los datos deben estar completos");
                    }
                    jug = eQ.registrarGamer(nom, cam);
                    jTextField1.setText(nom);
                    jTextField2.setText(cam);
                    JOptionPane.showMessageDialog(null, "Jugador - " + jug + " - registrado");
                } catch (NullPointerException e) {
                } catch (Exception e) {
                    msg += e;
                    JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo de LoL está completo");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado un Equipo");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String msg = "", nom;
        Gamer ret;
        limpiar();
        if (eQ != null) {
            if (eQ.determinarEqVacío() != true) {
                try {
                    nom = JOptionPane.showInputDialog(null, "Ingrese nombre del jugador : ");
                    if (nom.equals("")) {
                        throw new Exception("Los datos deben estar completos");
                    }
                    ret = eQ.retirarGamer(nom);
                    if (ret != null) {
                        JOptionPane.showMessageDialog(null, "Jugador  " + ret.consultarNombre() + "  y Campeón  " + ret.consultarCampeon() + "  retirados");
                    } else {
                        JOptionPane.showMessageDialog(null, "Jugador no encontrado");
                    }
                    jLabel4.setText(String.format("%.2f", eQ.calcularWinRate()));
                } catch (NullPointerException e) {
                } catch (Exception e) {
                    msg += e;
                    JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo de LoL no tiene jugadores");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado un Equipo");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String msg = "", nom;
        Gamer ret;
        limpiar();
        if (eQ != null) {
            if (eQ.determinarEqVacío() != true) {
                try {
                    nom = JOptionPane.showInputDialog(null, "Ingrese nombre del jugador : ");
                    if (nom.equals("")) {
                        throw new Exception("Los datos deben estar completos");
                    }
                    ret = eQ.consultarGamer(nom);
                    if (ret != null) {
                        jTextField1.setText(ret.consultarNombre());
                        jTextField2.setText(ret.consultarCampeon());
                        jLabel10.setText("" + ret.consultarAsesinatos());
                        jLabel11.setText("" + ret.consultarMuertes());
                        jLabel12.setText("" + ret.consultarAsistencias());
                        jLabel13.setText("" + ret.consultarVictorias());
                        jLabel14.setText("" + ret.consultarDerrotas());
                        jLabel4.setText(String.format("%.2f", eQ.calcularWinRate()));
                        jLabel17.setText(String.format("%.2f", ret.calcularWinRate()));
                        if (ret.determinarKDA() != 0) {
                            jLabel18.setText(String.format("%.2f", ret.determinarKDA()));
                        } else {
                            jLabel18.setText("Perfect");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Jugador no encontrado");
                    }
                } catch (NullPointerException e) {
                } catch (Exception e) {
                    msg += e;
                    JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo de LoL no tiene jugadores");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado un Equipo");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String msg = "", nom;
        int a, m, as, vd;
        Gamer ret;
        limpiar();
        if (eQ != null) {
            if (eQ.determinarEqVacío() != true) {
                try {
                    nom = JOptionPane.showInputDialog(null, "Ingrese nombre del jugador : ");
                    if (nom.equals("")) {
                        throw new Exception("Los datos deben estar completos");
                    }
                    ret = eQ.consultarGamer(nom);
                    if (ret != null) {
                        try {
                            a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de asesinatos : "));
                            if (a < 0) {
                                throw new Exception("El dato no puede ser negativo");
                            }
                            m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de muertes : "));
                            if (m < 0) {
                                throw new Exception("El dato no puede ser negativo");
                            }
                            as = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de asistencias : "));
                            if (as < 0) {
                                throw new Exception("El dato no puede ser negativo");
                            }
                            vd = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1 para indicar Victoria"));
                            eQ.registrarPartida(nom, a, m, as, vd);
                            jLabel4.setText(String.format("%.2f", eQ.calcularWinRate()));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Los valores de deben ser numéricos");
                        } catch (NullPointerException e) {
                        } catch (Exception e) {
                            msg += e;
                            JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Jugador no encontrado");
                    }
                } catch (NullPointerException e) {
                } catch (Exception e) {
                    msg += e;
                    JOptionPane.showMessageDialog(null, "" + msg.substring(20, msg.length()));
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo de LoL no tiene jugadores");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado un Equipo");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String msg = "", nom, opc;
        Object[] opciones = {"Mejor por KDA", "Mejor por asesinatos"};
        Gamer ret = new Gamer();
        limpiar();
        if (eQ != null) {
            if (eQ.determinarEqVacío() != true) {
                try {
                    opc = (String) JOptionPane.showInputDialog(this, "Seleccione el criterio deseado", "Mejor Jugador", JOptionPane.QUESTION_MESSAGE, null, opciones, "Mejor por KDA");
                    if (opc != null) {
                        JOptionPane.showMessageDialog(null, "EL jugador " + opc + " es : \n" + eQ.mejorJugador(opc));
                    }
                } catch (NullPointerException e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Equipo de LoL no tiene jugadores");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha registrado un Equipo");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InterfazEquipoLoL().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBase;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelC;
    private javax.swing.JLabel jLabelE;
    private javax.swing.JLabel jLabelL;
    private javax.swing.JLabel jLabelN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jSalir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jTitArea;
    private javax.swing.JLabel jTitIntro;
    // End of variables declaration//GEN-END:variables
}
