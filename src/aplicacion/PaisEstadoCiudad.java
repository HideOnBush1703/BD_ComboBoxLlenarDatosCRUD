
package aplicacion;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class PaisEstadoCiudad extends javax.swing.JFrame {

    public PaisEstadoCiudad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cajaNombrePais = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cajaNombreEstado = new javax.swing.JTextField();
        botonInsertar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cajaNombreCiudad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaNombreIDEstado = new javax.swing.JTextField();
        cajaNombreIDPais = new javax.swing.JTextField();
        botonInsertar2 = new javax.swing.JButton();
        botonEliminar3en1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonInsertar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Nombre País:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Nombre Estado:");

        botonInsertar1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonInsertar1.setText("Insertar");
        botonInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertar1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("ID Pais:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Nombre Ciudad:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("ID Estado:");

        botonInsertar2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonInsertar2.setText("Insertar");
        botonInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertar2ActionPerformed(evt);
            }
        });

        botonEliminar3en1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonEliminar3en1.setText("Eliminar 3 en 1");
        botonEliminar3en1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminar3en1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cajaNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(24, 24, 24)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cajaNombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaNombreEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaNombreIDPais, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cajaNombreIDEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(botonInsertar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(botonEliminar3en1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(botonInsertar1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(botonInsertar2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaNombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)
                        .addComponent(botonInsertar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(botonEliminar3en1)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaNombreEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaNombreIDPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonInsertar1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaNombreCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaNombreIDEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(botonInsertar2)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed

        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("insert into paises (nombrePais) values (?)");
            ps.setString(1, cajaNombrePais.getText());
            
            int resultado=ps.executeUpdate();//porque haremos una insercion pue
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro de pais insertado correctamente");
                cajaNombrePais.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro del pais");
                cajaNombrePais.setText(null);
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertar1ActionPerformed
        
        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("insert into estados (nombreEstado, idPais) values (?,?)");
            ps.setString(1, cajaNombreEstado.getText());
            ps.setString(2, cajaNombreIDPais.getText());
           
            int resultado=ps.executeUpdate();//porque haremos una insercion pue
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro de estado insertado correctamente");
                cajaNombreEstado.setText(null);
                cajaNombreIDPais.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro del estado");
                cajaNombreEstado.setText(null);
                cajaNombreIDPais.setText(null);
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonInsertar1ActionPerformed

    private void botonInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertar2ActionPerformed
        
        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("insert into ciudades (nombreCiudad, idEstado) values (?,?)");
            ps.setString(1, cajaNombreCiudad.getText());
            ps.setString(2, cajaNombreIDEstado.getText());
           
            int resultado=ps.executeUpdate();//porque haremos una insercion pue
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro de la ciudad insertado correctamente");
                cajaNombreCiudad.setText(null);
                cajaNombreIDEstado.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al insertar el registro de la ciudad");
                cajaNombreCiudad.setText(null);
                cajaNombreIDEstado.setText(null);
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonInsertar2ActionPerformed

    private void botonEliminar3en1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminar3en1ActionPerformed
        
        PreparedStatement ps=null;
        
        try{
            Conexion con = new Conexion();
            Connection conexion = con.getConnection();
            
            ps=conexion.prepareStatement("delete from paises where idpais = ?");
            ps.setInt(1, Integer.parseInt(cajaNombrePais.getText()));
            
            int resultado=ps.executeUpdate();
            
            if(resultado>0){
                JOptionPane.showMessageDialog(null, "Registro de pais eliminado correctamente");
                cajaNombrePais.setText(null);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro del pais");
                cajaNombrePais.setText(null);
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
    }//GEN-LAST:event_botonEliminar3en1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaisEstadoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaisEstadoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaisEstadoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaisEstadoCiudad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaisEstadoCiudad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminar3en1;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonInsertar1;
    private javax.swing.JButton botonInsertar2;
    private javax.swing.JTextField cajaNombreCiudad;
    private javax.swing.JTextField cajaNombreEstado;
    private javax.swing.JTextField cajaNombreIDEstado;
    private javax.swing.JTextField cajaNombreIDPais;
    private javax.swing.JTextField cajaNombrePais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
