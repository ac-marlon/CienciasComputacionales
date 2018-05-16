/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosNumericos;

import java.awt.HeadlessException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author FamiliaAC
 */
public class AlgoritmosNumericos extends javax.swing.JFrame {

    /**
     * Creates new form AlgoritmosNumericos
     */
    public AlgoritmosNumericos() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnConversorNum = new javax.swing.JButton();
        btnSerieUlam = new javax.swing.JButton();
        btnMetodoRuso = new javax.swing.JButton();
        btnOrdenamiento = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmos Numericos");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Algoritmos Numericos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Bienvenido a la interfaz de ususario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Por favor seleccione una funcion");

        btnConversorNum.setBackground(new java.awt.Color(255, 153, 153));
        btnConversorNum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnConversorNum.setText("Conversor numerico de Base 10 a Base 2");
        btnConversorNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConversorNumActionPerformed(evt);
            }
        });

        btnSerieUlam.setBackground(new java.awt.Color(255, 153, 153));
        btnSerieUlam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSerieUlam.setText("Serie de Ulam");
        btnSerieUlam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerieUlamActionPerformed(evt);
            }
        });

        btnMetodoRuso.setBackground(new java.awt.Color(255, 153, 153));
        btnMetodoRuso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMetodoRuso.setText("Algoritmo de multiplicacion (Metodo ruso)");
        btnMetodoRuso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetodoRusoActionPerformed(evt);
            }
        });

        btnOrdenamiento.setBackground(new java.awt.Color(255, 153, 153));
        btnOrdenamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOrdenamiento.setText("Ordenamiento numerico");
        btnOrdenamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenamientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOrdenamiento)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(53, 53, 53))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(jLabel3)))
                                .addGap(0, 136, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMetodoRuso)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnConversorNum)
                                    .addGap(159, 159, 159))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnSerieUlam)
                                    .addGap(242, 242, 242)))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConversorNum)
                .addGap(35, 35, 35)
                .addComponent(btnSerieUlam)
                .addGap(32, 32, 32)
                .addComponent(btnMetodoRuso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConversorNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConversorNumActionPerformed
        int decimal, exp, digito;
        double binario;
        try {
            String respuesta = JOptionPane.showInputDialog("Escribe un numero en Base DECIMAL:");
            decimal = Integer.parseInt(respuesta);
            if (decimal < 0) {
                JOptionPane.showMessageDialog(null, "Debe ser un numero entero mayor que cero");
            } else {
                exp = 0;
                binario = 0;
                while (decimal != 0) {
                    digito = decimal % 2;
                    binario = binario + digito * Math.pow(10, exp);
                    exp++;
                    decimal = decimal / 2;
                }
                DecimalFormat formato = new DecimalFormat("###");
                JOptionPane.showMessageDialog(null, "El numero en Base BINARIA es: " + formato.format(binario));
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ser un numero entero mayor que cero");
        }
    }//GEN-LAST:event_btnConversorNumActionPerformed

    private void btnSerieUlamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerieUlamActionPerformed
        int termino, contador = 0;
        ArrayList<Integer> ulamI = new ArrayList<>();
        ulamI.add(1);
        ulamI.add(2);
        ulamI.add(3);
        ArrayList<Integer> ulamJ = new ArrayList<>();
        ulamJ.add(1);
        ulamJ.add(2);
        ulamJ.add(3);
        try {
            String respuesta = JOptionPane.showInputDialog("Escribe la cantidad de terminos:");
            termino = Integer.parseInt(respuesta);
            if (termino <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ser un numero entero mayor que cero");
            } else if (termino == 1) {
                JOptionPane.showMessageDialog(null, "La Serie de Ulam con " + termino + " termino es: [1]");
            } else if (termino == 2) {
                JOptionPane.showMessageDialog(null, "La Serie de Ulam con " + termino + " terminos es: [1, 2]");
            } else if (termino == 3) {
                JOptionPane.showMessageDialog(null, "La Serie de Ulam con " + termino + " terminos es: [1, 2, 3]");
            } else {
                for (int k = 4; k < 10000; k++) {
                    for (int i = 0; i < ulamI.size(); i++) {
                        for (int j = 0; j < ulamJ.size(); j++) {
                            if (((ulamI.get(i) + ulamJ.get(j)) == k) && ((!Objects.equals(ulamI.get(i), ulamJ.get(j))))) {
                                contador++;
                            }
                        }
                    }
                    if (contador == 2 && ulamI.size() < termino) {
                        ulamI.add(k);
                        ulamJ.add(k);
                    }
                    contador = 0;
                }
                JOptionPane.showMessageDialog(null, "La Serie de Ulam con " + termino + " terminos es: " + ulamI);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ser un numero entero mayor que cero");
        }
    }//GEN-LAST:event_btnSerieUlamActionPerformed

    private void btnMetodoRusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetodoRusoActionPerformed
        int A, B, numeroA, numeroB, resultado = 0, contador = 0;
        ArrayList<Integer> descomposicionA = new ArrayList<>();
        ArrayList<Integer> descomposicionB = new ArrayList<>();
        try {
            String respuesta1 = JOptionPane.showInputDialog("Escribe el primer numero:");
            numeroA = Integer.parseInt(respuesta1);
            A = numeroA;
            String respuesta2 = JOptionPane.showInputDialog("Escribe el segundo numero:");
            numeroB = Integer.parseInt(respuesta2);
            B = numeroB;
            if (numeroA == 0 || numeroB == 0) {
                JOptionPane.showMessageDialog(null, "El resultado del producto es 0");
            } else {
                if (numeroA < 0) {
                    numeroA = numeroA * -1;
                }
                if (numeroB < 0) {
                    numeroB = numeroB * -1;
                }
                descomposicionA.add(numeroA);
                descomposicionB.add(numeroB);
                while ((numeroA) != 1) {
                    numeroA = numeroA / 2;
                    descomposicionA.add(numeroA);
                    contador++;
                }
                for (int i = 1; i <= contador; i++) {
                    numeroB = numeroB * 2;
                    descomposicionB.add(numeroB);
                }
                for (int j = 0; j < descomposicionA.size(); j++) {
                    if ((descomposicionA.get(j) % 2) != 0) {
                        resultado = resultado + descomposicionB.get(j);
                    }
                }
            }
            if (A < 0 && B < 0) {
                resultado = resultado * 1;
            } else if (A < 0 || B < 0) {
                resultado = resultado * -1;
            }
            JOptionPane.showMessageDialog(null, "El producto entre " + A + " y " + B + " es: " + resultado);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ser un numero entero");
        }
    }//GEN-LAST:event_btnMetodoRusoActionPerformed

    private void btnOrdenamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenamientoActionPerformed
        int[] numeros = new int[20];
        int contPos = 0, contNeg = 0, contCeros = 0, contPar = 0, contInpar = 0;
        try {
            for (int i = 0; i < numeros.length; i++) {
                String respuesta = JOptionPane.showInputDialog("Escribe el " + (i + 1) + "º" + " numero:");
                numeros[i] = Integer.parseInt(respuesta);
            }
            for (int j = 0; j < numeros.length; j++) {
                if (numeros[j] > 0) {
                    contPos++;
                }
                if (numeros[j] < 0) {
                    contNeg++;
                }
                if (numeros[j] == 0) {
                    contCeros++;
                }
                if (numeros[j] % 2 == 0) {
                    contPar++;
                }
                if (numeros[j] % 2 != 0) {
                    contInpar++;
                }
            }
            System.out.println(Arrays.toString(numeros));
            JOptionPane.showMessageDialog(null, "De la lista de numeros anteriormente digitada hay: " + contPos + " positivos, " + contNeg + " negativos, " + contCeros + " ceros, " + contPar + " pares y " + contInpar + " inpares");
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ser un numero entero");
        }
    }//GEN-LAST:event_btnOrdenamientoActionPerformed

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
            java.util.logging.Logger.getLogger(AlgoritmosNumericos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosNumericos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosNumericos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosNumericos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgoritmosNumericos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConversorNum;
    private javax.swing.JButton btnMetodoRuso;
    private javax.swing.JButton btnOrdenamiento;
    private javax.swing.JButton btnSerieUlam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}