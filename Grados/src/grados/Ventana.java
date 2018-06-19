
package grados;

import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

 
    public Ventana() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grados = new javax.swing.JLabel();
        conversion = new javax.swing.JLabel();
        ingresargrados = new javax.swing.JTextField();
        respuestaconversion = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        convertir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        grados.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        grados.setForeground(new java.awt.Color(255, 0, 0));
        grados.setText("Grados ℃");
        getContentPane().add(grados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        conversion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        conversion.setForeground(new java.awt.Color(255, 0, 0));
        conversion.setText("Grados °F");
        getContentPane().add(conversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        ingresargrados.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(ingresargrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 360, -1));

        respuestaconversion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(respuestaconversion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 360, -1));

        exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 0, 0));
        titulo.setText("Conversion de grados ℃ a °F");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        convertir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        convertir.setText("Convertir");
        convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirActionPerformed(evt);
            }
        });
        getContentPane().add(convertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, -1, -1));

        Fondo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cel.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirActionPerformed
        
        if (!ingresargrados.getText().equals("")){
        double grado1= Double.parseDouble(ingresargrados.getText());
        
        double gradof= ((grado1*9)/5)+32; 
        
        respuestaconversion.setText(""+gradof);
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar los grados ℃");
        }
        
    }//GEN-LAST:event_convertirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel conversion;
    private javax.swing.JButton convertir;
    private javax.swing.JButton exit;
    private javax.swing.JLabel grados;
    private javax.swing.JTextField ingresargrados;
    private javax.swing.JTextField respuestaconversion;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
