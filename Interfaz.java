package clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() throws Exception {
        initComponents();
        TextoCifraado.setEditable(false);
        TextoClaaro.setLineWrap(true);
        TextoCifraado.setLineWrap(true);
        
    }

    SecretKey key = KeyGenerator.getInstance("DES").generateKey();
    DES des = new DES(key);
    AES aes = new AES();
    
    byte[] hidden = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextoClaaro = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoCifraado = new javax.swing.JTextArea();
        CifrarDES = new javax.swing.JButton();
        DescifrarDES = new javax.swing.JButton();
        CifrarAES = new javax.swing.JButton();
        DescifrarAES = new javax.swing.JButton();
        Clavesss = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(620, 581));
        setResizable(false);
        getContentPane().setLayout(null);

        TextoClaaro.setColumns(20);
        TextoClaaro.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        TextoClaaro.setRows(5);
        jScrollPane1.setViewportView(TextoClaaro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 60, 280, 156);

        TextoCifraado.setColumns(20);
        TextoCifraado.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        TextoCifraado.setRows(5);
        jScrollPane2.setViewportView(TextoCifraado);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(350, 60, 208, 410);

        CifrarDES.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        CifrarDES.setText("CifrarDES");
        CifrarDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CifrarDESActionPerformed(evt);
            }
        });
        getContentPane().add(CifrarDES);
        CifrarDES.setBounds(49, 307, 120, 23);

        DescifrarDES.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        DescifrarDES.setText("DescifrarDES");
        DescifrarDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifrarDESActionPerformed(evt);
            }
        });
        getContentPane().add(DescifrarDES);
        DescifrarDES.setBounds(49, 359, 120, 23);

        CifrarAES.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        CifrarAES.setText("CifrarAES");
        CifrarAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CifrarAESActionPerformed(evt);
            }
        });
        getContentPane().add(CifrarAES);
        CifrarAES.setBounds(219, 307, 120, 23);

        DescifrarAES.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        DescifrarAES.setText("DescifrarAES");
        DescifrarAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescifrarAESActionPerformed(evt);
            }
        });
        getContentPane().add(DescifrarAES);
        DescifrarAES.setBounds(219, 359, 120, 23);

        Clavesss.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        Clavesss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClavesssActionPerformed(evt);
            }
        });
        getContentPane().add(Clavesss);
        Clavesss.setBounds(50, 240, 270, 20);

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel1.setText("Cifrado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 40, 50, 14);

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel2.setText("Mensaje");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 40, 49, 14);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        jLabel3.setText("Clave");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 220, 35, 14);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clases/Wallpaper.jpg"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 620, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CifrarDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CifrarDESActionPerformed
        String cadena = TextoClaaro.getText();
        try {
            String encryptedDES = des.encryptDES(cadena);
            TextoCifraado.setText(encryptedDES);
        } catch (Exception ex) {
            TextoCifraado.setText("No se pudo encriptar el mensaje por un error interno");
        }

    }//GEN-LAST:event_CifrarDESActionPerformed

    private void DescifrarDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifrarDESActionPerformed
        String cadena = TextoClaaro.getText();
        try {
            String decryptedDES = des.decryptDES(cadena);
            TextoCifraado.setText(decryptedDES);
        } catch (Exception ex) {
            TextoCifraado.setText("No se pudo desencriptar el mensaje por un error interno");
        }
    }//GEN-LAST:event_DescifrarDESActionPerformed

    private void CifrarAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CifrarAESActionPerformed
        String cadena = TextoClaaro.getText();
        String llave = Clavesss.getText();
        try {
            String encryptedAES = aes.encryptAES(llave, cadena);
            TextoCifraado.setText(encryptedAES);
            hidden = aes.encryptAESHidden(llave, cadena);
        } catch (Exception ex) {
            TextoCifraado.setText("La logitud de la llave tiene que ser de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_CifrarAESActionPerformed

    private void DescifrarAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescifrarAESActionPerformed
        String llave = Clavesss.getText();
        try {
            String decryptedAES = aes.decryptAES(llave, hidden);
            TextoCifraado.setText(decryptedAES);
        } catch (Exception ex) {
            TextoCifraado.setText("La logitud de la llave tiene que ser de 16, 24 o 32 caracteres");
        }
    }//GEN-LAST:event_DescifrarAESActionPerformed

    private void ClavesssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClavesssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClavesssActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CifrarAES;
    private javax.swing.JButton CifrarDES;
    private javax.swing.JTextField Clavesss;
    private javax.swing.JButton DescifrarAES;
    private javax.swing.JButton DescifrarDES;
    private javax.swing.JTextArea TextoCifraado;
    private javax.swing.JTextArea TextoClaaro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
