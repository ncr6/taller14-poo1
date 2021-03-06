package presentacion;

import entidades.*;
import javax.swing.*;
import java.util.ArrayList;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class FrmBotonesHab extends javax.swing.JFrame {

    /**
     * Creates new form FrmBotonesHab
     */
    public FrmBotonesHab() {
        initComponents();    
    }
    
    public FrmBotonesHab(Hotel h) {
        initComponents();
        this.h = h;
        botones = new ArrayList();
        botones.add(btnHab1); botones.add(btnHab2); botones.add(btnHab3); botones.add(btnHab4); botones.add(btnHab5);
        botones.add(btnHab6); botones.add(btnHab7); botones.add(btnHab8); botones.add(btnHab9); botones.add(btnHab10);
        botones.add(btnHab11); botones.add(btnHab12); botones.add(btnHab13); botones.add(btnHab14); botones.add(btnHab15);
        botones.add(btnHab16); botones.add(btnHab17); botones.add(btnHab18); botones.add(btnHab19); botones.add(btnHab20);
        botones.add(btnHab21); botones.add(btnHab22); botones.add(btnHab23); botones.add(btnHab24); botones.add(btnHab25);
        botones.add(btnHab26); botones.add(btnHab27); botones.add(btnHab28); botones.add(btnHab29); botones.add(btnHab30);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHab1 = new javax.swing.JButton();
        btnHab2 = new javax.swing.JButton();
        btnHab3 = new javax.swing.JButton();
        btnHab4 = new javax.swing.JButton();
        btnHab5 = new javax.swing.JButton();
        btnHab6 = new javax.swing.JButton();
        btnHab7 = new javax.swing.JButton();
        btnHab8 = new javax.swing.JButton();
        btnHab9 = new javax.swing.JButton();
        btnHab10 = new javax.swing.JButton();
        btnHab11 = new javax.swing.JButton();
        btnHab12 = new javax.swing.JButton();
        btnHab13 = new javax.swing.JButton();
        btnHab14 = new javax.swing.JButton();
        btnHab15 = new javax.swing.JButton();
        btnHab16 = new javax.swing.JButton();
        btnHab17 = new javax.swing.JButton();
        btnHab18 = new javax.swing.JButton();
        btnHab19 = new javax.swing.JButton();
        btnHab20 = new javax.swing.JButton();
        btnHab21 = new javax.swing.JButton();
        btnHab22 = new javax.swing.JButton();
        btnHab23 = new javax.swing.JButton();
        btnHab24 = new javax.swing.JButton();
        btnHab25 = new javax.swing.JButton();
        btnHab26 = new javax.swing.JButton();
        btnHab27 = new javax.swing.JButton();
        btnHab28 = new javax.swing.JButton();
        btnHab29 = new javax.swing.JButton();
        btnHab30 = new javax.swing.JButton();
        lblSeleccione = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Habitaciones");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnHab1.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab1.setText("Habitación");
        btnHab1.setEnabled(false);

        btnHab2.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab2.setText("Habitación");
        btnHab2.setEnabled(false);

        btnHab3.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab3.setText("Habitación");
        btnHab3.setEnabled(false);

        btnHab4.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab4.setText("Habitación");
        btnHab4.setEnabled(false);

        btnHab5.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab5.setText("Habitación");
        btnHab5.setEnabled(false);

        btnHab6.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab6.setText("Habitación");
        btnHab6.setEnabled(false);

        btnHab7.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab7.setText("Habitación");
        btnHab7.setEnabled(false);

        btnHab8.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab8.setText("Habitación");
        btnHab8.setEnabled(false);

        btnHab9.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab9.setText("Habitación");
        btnHab9.setEnabled(false);

        btnHab10.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab10.setText("Habitación");
        btnHab10.setEnabled(false);

        btnHab11.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab11.setText("Habitación");
        btnHab11.setEnabled(false);

        btnHab12.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab12.setText("Habitación");
        btnHab12.setEnabled(false);

        btnHab13.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab13.setText("Habitación");
        btnHab13.setEnabled(false);

        btnHab14.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab14.setText("Habitación");
        btnHab14.setEnabled(false);

        btnHab15.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab15.setText("Habitación");
        btnHab15.setEnabled(false);

        btnHab16.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab16.setText("Habitación");
        btnHab16.setEnabled(false);

        btnHab17.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab17.setText("Habitación");
        btnHab17.setEnabled(false);

        btnHab18.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab18.setText("Habitación");
        btnHab18.setEnabled(false);

        btnHab19.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab19.setText("Habitación");
        btnHab19.setEnabled(false);

        btnHab20.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab20.setText("Habitación");
        btnHab20.setEnabled(false);

        btnHab21.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab21.setText("Habitación");
        btnHab21.setEnabled(false);

        btnHab22.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab22.setText("Habitación");
        btnHab22.setEnabled(false);

        btnHab23.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab23.setText("Habitación");
        btnHab23.setEnabled(false);

        btnHab24.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab24.setText("Habitación");
        btnHab24.setEnabled(false);

        btnHab25.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab25.setText("Habitación");
        btnHab25.setEnabled(false);

        btnHab26.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab26.setText("Habitación");
        btnHab26.setEnabled(false);

        btnHab27.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab27.setText("Habitación");
        btnHab27.setEnabled(false);

        btnHab28.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab28.setText("Habitación");
        btnHab28.setEnabled(false);

        btnHab29.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab29.setText("Habitación");
        btnHab29.setEnabled(false);

        btnHab30.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        btnHab30.setText("Habitación");
        btnHab30.setEnabled(false);

        lblSeleccione.setFont(new java.awt.Font("Cantarell", 1, 16)); // NOI18N
        lblSeleccione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSeleccione.setText("Seleccione una Habitación para acceder a sus datos");

        lblAviso.setFont(new java.awt.Font("Cantarell", 2, 14)); // NOI18N
        lblAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAviso.setText("Un botón deshabilitado indica una habitación que aún no ha sido habilitada. Revise el menú Administración.");

        btnVolver.setFont(new java.awt.Font("Cantarell", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(btnVolver))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHab21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHab1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHab6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHab26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHab27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHab16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHab17, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHab11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHab12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHab13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHab14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHab15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHab23, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHab24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHab18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHab19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnHab28, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHab29, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHab20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHab25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHab30, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblSeleccione, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblSeleccione)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAviso)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab1)
                    .addComponent(btnHab2)
                    .addComponent(btnHab3)
                    .addComponent(btnHab4)
                    .addComponent(btnHab5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab6)
                    .addComponent(btnHab7)
                    .addComponent(btnHab8)
                    .addComponent(btnHab9)
                    .addComponent(btnHab10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab12)
                    .addComponent(btnHab14)
                    .addComponent(btnHab11)
                    .addComponent(btnHab13)
                    .addComponent(btnHab15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab16)
                    .addComponent(btnHab18)
                    .addComponent(btnHab19)
                    .addComponent(btnHab20)
                    .addComponent(btnHab17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab23)
                    .addComponent(btnHab21)
                    .addComponent(btnHab22)
                    .addComponent(btnHab24)
                    .addComponent(btnHab25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHab30)
                    .addComponent(btnHab29)
                    .addComponent(btnHab26)
                    .addComponent(btnHab27)
                    .addComponent(btnHab28))
                .addGap(18, 18, 18)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        h.sortHabs();
        for (int i=0; i<h.getHabs().size(); i++){
            botones.get(i).setEnabled(true);
            botones.get(i).setText("Habitación "+h.getHabs().get(i).getNumero());
            botones.get(i).addActionListener(new HabActionListener(h, h.getHabs().get(i), i));
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf Light look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBotonesHab().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHab1;
    private javax.swing.JButton btnHab10;
    private javax.swing.JButton btnHab11;
    private javax.swing.JButton btnHab12;
    private javax.swing.JButton btnHab13;
    private javax.swing.JButton btnHab14;
    private javax.swing.JButton btnHab15;
    private javax.swing.JButton btnHab16;
    private javax.swing.JButton btnHab17;
    private javax.swing.JButton btnHab18;
    private javax.swing.JButton btnHab19;
    private javax.swing.JButton btnHab2;
    private javax.swing.JButton btnHab20;
    private javax.swing.JButton btnHab21;
    private javax.swing.JButton btnHab22;
    private javax.swing.JButton btnHab23;
    private javax.swing.JButton btnHab24;
    private javax.swing.JButton btnHab25;
    private javax.swing.JButton btnHab26;
    private javax.swing.JButton btnHab27;
    private javax.swing.JButton btnHab28;
    private javax.swing.JButton btnHab29;
    private javax.swing.JButton btnHab3;
    private javax.swing.JButton btnHab30;
    private javax.swing.JButton btnHab4;
    private javax.swing.JButton btnHab5;
    private javax.swing.JButton btnHab6;
    private javax.swing.JButton btnHab7;
    private javax.swing.JButton btnHab8;
    private javax.swing.JButton btnHab9;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblSeleccione;
    // End of variables declaration//GEN-END:variables
    private ArrayList<JButton> botones;

    private Hotel h;

    public Hotel getH() {
        return h;
    }

    public void setH(Hotel h) {
        this.h = h;
    }
    
    private class HabActionListener implements ActionListener {
        private Hotel h;
        private Habitacion hab;
        private int pos;
        
        public HabActionListener(Hotel h, Habitacion hab, int pos){
            this.h = h;
            this.hab = hab;
            this.pos = pos;
        }
        
        public void actionPerformed(ActionEvent e){
            new FrmHabitacion(h, hab).setVisible(true);
        }
    }
}
