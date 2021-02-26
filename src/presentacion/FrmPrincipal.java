package presentacion;

import entidades.*;
import javax.swing.*;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Nícolas Castillo (tecncr@NCR-TOSHIBA)
 */

public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }
    
    public static boolean confirmar(String pregunta){
        boolean confirmado = false;
        int resultado = JOptionPane.showConfirmDialog(null, pregunta, "Confirmación", JOptionPane.YES_NO_OPTION);
        if (resultado == JOptionPane.YES_OPTION){
            confirmado = true;
        } else if (resultado == JOptionPane.NO_OPTION){
            confirmado = false;
        }
        return confirmado;
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreHotel = new javax.swing.JLabel();
        btnHabitaciones = new javax.swing.JButton();
        btnHabBoleta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblAccesosDirectos = new javax.swing.JLabel();
        lblRucHotel = new javax.swing.JLabel();
        mnuPrincipal = new javax.swing.JMenuBar();
        mnuBuscar = new javax.swing.JMenu();
        mnuitBuscarHabNum = new javax.swing.JMenuItem();
        mnuitBuscarClienteDoc = new javax.swing.JMenuItem();
        mnuVista = new javax.swing.JMenu();
        mnuitReportHabit = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuitHuespHabitacion = new javax.swing.JMenuItem();
        mnuitHuespApellido = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        mnuitHabilitarHabitacion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuitNombreHotel = new javax.swing.JMenuItem();
        mnuitSetRuc = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuitBorrarDatos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Administración del Hotel");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNombreHotel.setFont(lblNombreHotel.getFont().deriveFont(lblNombreHotel.getFont().getStyle() | java.awt.Font.BOLD, lblNombreHotel.getFont().getSize()+19));
        lblNombreHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreHotel.setText("Le damos la bienvenida");

        btnHabitaciones.setFont(btnHabitaciones.getFont().deriveFont(btnHabitaciones.getFont().getSize()+3f));
        btnHabitaciones.setText("Habitaciones");

        btnHabBoleta.setFont(btnHabBoleta.getFont().deriveFont(btnHabBoleta.getFont().getSize()+3f));
        btnHabBoleta.setText("Generar Boleta");
        btnHabBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabBoletaActionPerformed(evt);
            }
        });

        btnSalir.setFont(btnSalir.getFont().deriveFont(btnSalir.getFont().getSize()+3f));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblAccesosDirectos.setFont(lblAccesosDirectos.getFont().deriveFont((lblAccesosDirectos.getFont().getStyle() | java.awt.Font.ITALIC), lblAccesosDirectos.getFont().getSize()+3));
        lblAccesosDirectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccesosDirectos.setText("Accesos Directos:");

        lblRucHotel.setFont(lblRucHotel.getFont().deriveFont(lblRucHotel.getFont().getSize()+4f));
        lblRucHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRucHotel.setText("Por favor establezca el nombre y RUC del Hotel en el menú \"Administración\"");

        mnuPrincipal.setFont(mnuPrincipal.getFont().deriveFont(mnuPrincipal.getFont().getSize()+5f));

        mnuBuscar.setText("Buscar");
        mnuBuscar.setFont(mnuBuscar.getFont().deriveFont(mnuBuscar.getFont().getSize()+3f));

        mnuitBuscarHabNum.setFont(mnuitBuscarHabNum.getFont().deriveFont(mnuitBuscarHabNum.getFont().getSize()+2f));
        mnuitBuscarHabNum.setText("Habitación por número");
        mnuBuscar.add(mnuitBuscarHabNum);

        mnuitBuscarClienteDoc.setFont(mnuitBuscarClienteDoc.getFont().deriveFont(mnuitBuscarClienteDoc.getFont().getSize()+2f));
        mnuitBuscarClienteDoc.setText("Cliente por doc. de identidad");
        mnuitBuscarClienteDoc.setToolTipText("");
        mnuBuscar.add(mnuitBuscarClienteDoc);

        mnuPrincipal.add(mnuBuscar);

        mnuVista.setText("Vista General");
        mnuVista.setFont(mnuVista.getFont().deriveFont(mnuVista.getFont().getSize()+3f));

        mnuitReportHabit.setFont(mnuitReportHabit.getFont().deriveFont(mnuitReportHabit.getFont().getSize()+2f));
        mnuitReportHabit.setText("Reporte de Habitaciones");
        mnuitReportHabit.setToolTipText("");
        mnuVista.add(mnuitReportHabit);
        mnuVista.add(jSeparator3);

        mnuitHuespHabitacion.setFont(mnuitHuespHabitacion.getFont().deriveFont(mnuitHuespHabitacion.getFont().getSize()+2f));
        mnuitHuespHabitacion.setText("Huéspedes por Habitación");
        mnuitHuespHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitHuespHabitacionActionPerformed(evt);
            }
        });
        mnuVista.add(mnuitHuespHabitacion);

        mnuitHuespApellido.setFont(mnuitHuespApellido.getFont().deriveFont(mnuitHuespApellido.getFont().getSize()+2f));
        mnuitHuespApellido.setText("Huéspedes por Apellido");
        mnuVista.add(mnuitHuespApellido);

        mnuPrincipal.add(mnuVista);

        mnuAdmin.setText("Administración");
        mnuAdmin.setFont(mnuAdmin.getFont().deriveFont(mnuAdmin.getFont().getSize()+3f));

        mnuitHabilitarHabitacion.setFont(mnuitHabilitarHabitacion.getFont().deriveFont(mnuitHabilitarHabitacion.getFont().getSize()+2f));
        mnuitHabilitarHabitacion.setText("Habilitar Habitación");
        mnuAdmin.add(mnuitHabilitarHabitacion);
        mnuAdmin.add(jSeparator1);

        mnuitNombreHotel.setFont(mnuitNombreHotel.getFont().deriveFont(mnuitNombreHotel.getFont().getSize()+2f));
        mnuitNombreHotel.setText("Establecer nombre del Hotel");
        mnuitNombreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNombreHotelActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuitNombreHotel);

        mnuitSetRuc.setFont(mnuitSetRuc.getFont().deriveFont(mnuitSetRuc.getFont().getSize()+2f));
        mnuitSetRuc.setText("Establecer RUC");
        mnuitSetRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitSetRucActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuitSetRuc);
        mnuAdmin.add(jSeparator2);

        mnuitBorrarDatos.setFont(mnuitBorrarDatos.getFont().deriveFont(mnuitBorrarDatos.getFont().getSize()+2f));
        mnuitBorrarDatos.setText("Borrar Datos");
        mnuAdmin.add(mnuitBorrarDatos);

        mnuPrincipal.add(mnuAdmin);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnHabBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRucHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAccesosDirectos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreHotel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(lblNombreHotel)
                .addGap(18, 18, 18)
                .addComponent(lblRucHotel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lblAccesosDirectos)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHabBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHabBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHabBoletaActionPerformed

    private void mnuitHuespHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitHuespHabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuitHuespHabitacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (confirmar("¿Desea salir del programa?"))
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (confirmar("¿Desea salir del programa?"))
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //TODO: Añadir cosas aquí
    }//GEN-LAST:event_formWindowOpened

    private void mnuitNombreHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitNombreHotelActionPerformed
        String nuevoNombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del hotel",
                            "Cambio de nombre del hotel", 3);
        if (nuevoNombre != null){hotel.setNombre(nuevoNombre);}
        lblNombreHotel.setText(hotel.getNombre());
    }//GEN-LAST:event_mnuitNombreHotelActionPerformed

    private void mnuitSetRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitSetRucActionPerformed
        String nuevoRuc = JOptionPane.showInputDialog(null, "Ingrese el nuevo RUC del hotel",
                            "Cambio de RUC del hotel", 3);
        if (nuevoRuc != null){hotel.setRuc(nuevoRuc);}
        lblRucHotel.setText("RUC: " + hotel.getRuc());
    }//GEN-LAST:event_mnuitSetRucActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the FlatLaf Light look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHabBoleta;
    private javax.swing.JButton btnHabitaciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblAccesosDirectos;
    private javax.swing.JLabel lblNombreHotel;
    private javax.swing.JLabel lblRucHotel;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuBuscar;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JMenu mnuVista;
    private javax.swing.JMenuItem mnuitBorrarDatos;
    private javax.swing.JMenuItem mnuitBuscarClienteDoc;
    private javax.swing.JMenuItem mnuitBuscarHabNum;
    private javax.swing.JMenuItem mnuitHabilitarHabitacion;
    private javax.swing.JMenuItem mnuitHuespApellido;
    private javax.swing.JMenuItem mnuitHuespHabitacion;
    private javax.swing.JMenuItem mnuitNombreHotel;
    private javax.swing.JMenuItem mnuitReportHabit;
    private javax.swing.JMenuItem mnuitSetRuc;
    // End of variables declaration//GEN-END:variables
    private Hotel hotel = new Hotel("indefinido", "00000000000");
}