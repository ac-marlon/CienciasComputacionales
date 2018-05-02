package boyermoore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author ACMarlon
 */
public class BoyerMoore extends javax.swing.JFrame {

    private boolean opcion = false;
    private File selectedFile;
    private Resultados resultadoFrame;

    /**
     * Creates new form PantallaFrame
     */
    public BoyerMoore() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        digitarTextoRB = new javax.swing.JRadioButton();
        cargarArchivoRB = new javax.swing.JRadioButton();
        tituloLBL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        digitarTextoTA = new javax.swing.JTextArea();
        digitarTextoLBL = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cargarTextoLBL = new javax.swing.JLabel();
        pathTF = new javax.swing.JTextField();
        cargarArchivoBTN = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        palabraABuscarTF = new javax.swing.JTextField();
        digitarPalabraLBL = new javax.swing.JLabel();
        buscarBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoCargadoTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador de Palabras");
        setResizable(false);

        buttonGroup.add(digitarTextoRB);
        digitarTextoRB.setText("Digitar Texto");
        digitarTextoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitarTextoRBActionPerformed(evt);
            }
        });

        buttonGroup.add(cargarArchivoRB);
        cargarArchivoRB.setText("Cargar Archivo");
        cargarArchivoRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoRBActionPerformed(evt);
            }
        });

        tituloLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloLBL.setText("ALGORITMO DE BOYER - MOORE");

        digitarTextoTA.setColumns(20);
        digitarTextoTA.setRows(5);
        digitarTextoTA.setEnabled(false);
        jScrollPane1.setViewportView(digitarTextoTA);

        digitarTextoLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        digitarTextoLBL.setText("Digite el texto a evaluar");
        digitarTextoLBL.setEnabled(false);

        cargarTextoLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cargarTextoLBL.setText("Cargue un archivo");
        cargarTextoLBL.setEnabled(false);

        pathTF.setEditable(false);
        pathTF.setEnabled(false);

        cargarArchivoBTN.setText("Cargar Archivo");
        cargarArchivoBTN.setEnabled(false);
        cargarArchivoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArchivoBTNActionPerformed(evt);
            }
        });

        palabraABuscarTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                palabraABuscarTFKeyTyped(evt);
            }
        });

        digitarPalabraLBL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        digitarPalabraLBL.setText("Digite palabra a buscar");

        buscarBTN.setText("Buscar");
        buscarBTN.setEnabled(false);
        buscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBTNActionPerformed(evt);
            }
        });

        textoCargadoTA.setEditable(false);
        textoCargadoTA.setColumns(20);
        textoCargadoTA.setRows(5);
        textoCargadoTA.setEnabled(false);
        jScrollPane2.setViewportView(textoCargadoTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloLBL)
                .addGap(233, 233, 233))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(digitarTextoRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cargarArchivoRB)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cargarTextoLBL)
                                        .addGap(18, 18, 18)
                                        .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cargarArchivoBTN)
                                        .addGap(6, 6, 6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(digitarTextoLBL)
                                    .addComponent(digitarPalabraLBL)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(palabraABuscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloLBL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digitarTextoRB)
                    .addComponent(cargarArchivoRB))
                .addGap(18, 18, 18)
                .addComponent(digitarTextoLBL)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargarArchivoBTN)
                    .addComponent(cargarTextoLBL))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(digitarPalabraLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palabraABuscarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBTN))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digitarTextoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitarTextoRBActionPerformed
        if (digitarTextoRB.isSelected()) {
            opcion = true;
            digitarTextoLBL.setEnabled(opcion);
            digitarTextoTA.setEnabled(opcion);
            cargarTextoLBL.setEnabled(!opcion);
            textoCargadoTA.setEnabled(!opcion);
            pathTF.setEnabled(!opcion);
            pathTF.setText("");
            cargarArchivoBTN.setEnabled(!opcion);

        }
    }//GEN-LAST:event_digitarTextoRBActionPerformed

    private void cargarArchivoRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoRBActionPerformed
        if (cargarArchivoRB.isSelected()) {
            opcion = true;
            cargarTextoLBL.setEnabled(opcion);
            pathTF.setEnabled(opcion);
            cargarArchivoBTN.setEnabled(opcion);
            textoCargadoTA.setEnabled(opcion);
            digitarTextoLBL.setEnabled(!opcion);
            digitarTextoTA.setEnabled(!opcion);
            digitarTextoTA.setText("");
        }
    }//GEN-LAST:event_cargarArchivoRBActionPerformed

    private void cargarArchivoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarArchivoBTNActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        String aux = "";
        String texto = "";
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            String absolutePath = selectedFile.getAbsolutePath();
            String ext = FilenameUtils.getExtension(absolutePath);
            if (ext.equals("txt")) {
                pathTF.setText(absolutePath);
                if (selectedFile != null) {
                    FileReader archivo = null;
                    try {
                        archivo = new FileReader(selectedFile);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(BoyerMoore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    BufferedReader leer = new BufferedReader(archivo);
                    try {
                        while ((aux = leer.readLine()) != null) {
                            texto += aux + "\n";
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(BoyerMoore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        leer.close();
                    } catch (IOException ex) {
                        Logger.getLogger(BoyerMoore.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    textoCargadoTA.setText(texto);
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor seleccione un archivo de texto con extensión: .txt",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
                selectedFile = null;
                absolutePath = "";
                ext = "";
                pathTF.setText("");
            }
        }
    }//GEN-LAST:event_cargarArchivoBTNActionPerformed

    private void buscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBTNActionPerformed
        String palabraABuscar = palabraABuscarTF.getText().trim();
        String textoCargado = "";
        if (palabraABuscar.equals("") || palabraABuscar.length() <= 0) {
            JOptionPane.showMessageDialog(
                    null,
                    "Por favor digite la palabra a buscar en intente nuevamente",
                    "Warning",
                    JOptionPane.WARNING_MESSAGE);
        } else if (digitarTextoRB.isSelected()) {
            textoCargado = digitarTextoTA.getText().trim();
            if (textoCargado.equals("") || textoCargado.length() <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor digite un texto a evaluar",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                int index = 0;
                int count = 0;
                String aux = textoCargado;
                String textoMod = textoCargado;
                StringBuilder sbuilder = new StringBuilder(textoCargado);
                String textoResaltado = "";
                String textoInv = sbuilder.reverse().toString();
                String textoInvPal = textoCargado;
                String aux2;

                String partes[] = textoInvPal.split(" ");
                for (int i = 0; i < partes.length; i++) {
                    StringBuilder sbuilder2 = new StringBuilder(partes[i]);
                    aux2 = sbuilder2.reverse().toString();
                    partes[i] = aux2;
                }
                textoInvPal = Arrays.toString(partes);

                int longitud = 0;
                boolean existe = aux.contains(palabraABuscar);
                if (existe) {
                    while (true) {
                        boolean flag = aux.contains(palabraABuscar);
                        if (flag) {
                            longitud = aux.length();
                            index = aux.indexOf(palabraABuscar) + palabraABuscar.length();
                            textoResaltado = textoMod.replaceAll(palabraABuscar, "*" + palabraABuscar + "*");
                            aux = aux.substring(index, longitud).trim();
                            count++;
                        } else {
                            break;
                        }
                    }

                }
                this.setVisible(false);
                resultadoFrame = new Resultados();
                resultadoFrame.setResultado(palabraABuscar, existe, Integer.toString(count), textoResaltado, textoInv, textoInvPal);
                resultadoFrame.setVisible(true);
            }
        } else if (cargarArchivoRB.isSelected()) {
            textoCargado = textoCargadoTA.getText().trim();
            if (textoCargado.equals("") || textoCargado.length() <= 0) {
                JOptionPane.showMessageDialog(
                        null,
                        "Por favor seleccione un archivo de texto no vacio",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                int index = 0;
                int count = 0;
                String aux = textoCargado;
                String textoMod = textoCargado;
                StringBuilder sbuilder = new StringBuilder(textoCargado);
                String textoResaltado = "";
                String textoInv = sbuilder.reverse().toString();
                String textoInvPal = textoCargado;
                String aux2;

                String partes[] = textoInvPal.split(" ");
                for (int i = 0; i < partes.length; i++) {
                    StringBuilder sbuilder2 = new StringBuilder(partes[i]);
                    aux2 = sbuilder2.reverse().toString();
                    partes[i] = aux2;
                }
                textoInvPal = Arrays.toString(partes);

                int longitud = 0;
                boolean existe = aux.contains(palabraABuscar);
                if (existe) {
                    while (true) {
                        boolean flag = aux.contains(palabraABuscar);
                        if (flag) {
                            longitud = aux.length();
                            index = aux.indexOf(palabraABuscar) + palabraABuscar.length();
                            textoResaltado = textoMod.replaceAll(palabraABuscar, "*" + palabraABuscar + "*");
                            aux = aux.substring(index, longitud).trim();
                            count++;
                        } else {
                            break;
                        }
                    }

                }
                this.setVisible(false);
                resultadoFrame = new Resultados();
                resultadoFrame.setResultado(palabraABuscar, existe, Integer.toString(count), textoResaltado, textoInv, textoInvPal);
                resultadoFrame.setVisible(true);
            }
        }

    }//GEN-LAST:event_buscarBTNActionPerformed

    private void palabraABuscarTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_palabraABuscarTFKeyTyped
        int a = palabraABuscarTF.getText().trim().length();
        if (a <= 0) {
            buscarBTN.setEnabled(false);
        } else {
            buscarBTN.setEnabled(true);
        }
    }//GEN-LAST:event_palabraABuscarTFKeyTyped

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
            java.util.logging.Logger.getLogger(BoyerMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoyerMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoyerMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoyerMoore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new BoyerMoore().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBTN;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cargarArchivoBTN;
    private javax.swing.JRadioButton cargarArchivoRB;
    private javax.swing.JLabel cargarTextoLBL;
    private javax.swing.JLabel digitarPalabraLBL;
    private javax.swing.JLabel digitarTextoLBL;
    private javax.swing.JRadioButton digitarTextoRB;
    private javax.swing.JTextArea digitarTextoTA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField palabraABuscarTF;
    private javax.swing.JTextField pathTF;
    private javax.swing.JTextArea textoCargadoTA;
    private javax.swing.JLabel tituloLBL;
    // End of variables declaration//GEN-END:variables

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    public File getSelectedFile() {
        return selectedFile;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

}
