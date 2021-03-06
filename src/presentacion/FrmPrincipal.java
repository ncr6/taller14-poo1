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

        lblNombreHotel.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        lblNombreHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreHotel.setText("Le damos la bienvenida");

        btnHabitaciones.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnHabitaciones.setText("Habitaciones");
        btnHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabitacionesActionPerformed(evt);
            }
        });

        btnHabBoleta.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnHabBoleta.setText("Generar Boleta");
        btnHabBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHabBoletaActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblAccesosDirectos.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N
        lblAccesosDirectos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAccesosDirectos.setText("Accesos Directos:");

        lblRucHotel.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        lblRucHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRucHotel.setText("Por favor establezca el nombre y RUC del Hotel en el menú \"Administración\"");

        mnuPrincipal.setFont(mnuPrincipal.getFont().deriveFont(mnuPrincipal.getFont().getSize()+5f));

        mnuBuscar.setText("Buscar");
        mnuBuscar.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N

        mnuitBuscarHabNum.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitBuscarHabNum.setText("Habitación por número");
        mnuitBuscarHabNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBuscarHabNumActionPerformed(evt);
            }
        });
        mnuBuscar.add(mnuitBuscarHabNum);

        mnuitBuscarClienteDoc.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitBuscarClienteDoc.setText("Cliente por doc. de identidad");
        mnuitBuscarClienteDoc.setToolTipText("");
        mnuitBuscarClienteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBuscarClienteDocActionPerformed(evt);
            }
        });
        mnuBuscar.add(mnuitBuscarClienteDoc);

        mnuPrincipal.add(mnuBuscar);

        mnuVista.setText("Vista General");
        mnuVista.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N

        mnuitReportHabit.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitReportHabit.setText("Reporte de Habitaciones");
        mnuitReportHabit.setToolTipText("");
        mnuitReportHabit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitReportHabitActionPerformed(evt);
            }
        });
        mnuVista.add(mnuitReportHabit);

        mnuPrincipal.add(mnuVista);

        mnuAdmin.setText("Administración");
        mnuAdmin.setFont(new java.awt.Font("Cantarell", 0, 16)); // NOI18N

        mnuitHabilitarHabitacion.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitHabilitarHabitacion.setText("Habilitar Habitación");
        mnuitHabilitarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitHabilitarHabitacionActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuitHabilitarHabitacion);
        mnuAdmin.add(jSeparator1);

        mnuitNombreHotel.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitNombreHotel.setText("Establecer nombre del Hotel");
        mnuitNombreHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitNombreHotelActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuitNombreHotel);

        mnuitSetRuc.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitSetRuc.setText("Establecer RUC");
        mnuitSetRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitSetRucActionPerformed(evt);
            }
        });
        mnuAdmin.add(mnuitSetRuc);
        mnuAdmin.add(jSeparator2);

        mnuitBorrarDatos.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        mnuitBorrarDatos.setText("Borrar Datos");
        mnuitBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitBorrarDatosActionPerformed(evt);
            }
        });
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
                        .addGap(90, 90, 90)
                        .addComponent(btnHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnHabBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRucHotel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(lblAccesosDirectos)
                .addGap(18, 18, 18)
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
        new FrmBotonesBolHab(getHotel()).setVisible(true);
    }//GEN-LAST:event_btnHabBoletaActionPerformed

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

    private void btnHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHabitacionesActionPerformed
        new FrmBotonesHab(getHotel()).setVisible(true);
    }//GEN-LAST:event_btnHabitacionesActionPerformed

    private void mnuitHabilitarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitHabilitarHabitacionActionPerformed
        new FrmHabilitarHabitacion(getHotel()).setVisible(true);
    }//GEN-LAST:event_mnuitHabilitarHabitacionActionPerformed

    private void mnuitBuscarHabNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBuscarHabNumActionPerformed
        try{
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la habitación que desee buscar", "Búsqueda de habitación por número", 1));
            boolean encontrado = false;
            for (Habitacion hab : hotel.getHabs()){
                if (num == hab.getNumero()){
                    encontrado = true;
                    new FrmHabitacion(hotel, hab).setVisible(true);
                }               
            }
            if (!encontrado)
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda", "Sin resultados", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solo datos numéricos", "Búsqueda inválida", 2);
        }
    }//GEN-LAST:event_mnuitBuscarHabNumActionPerformed

    private void mnuitReportHabitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitReportHabitActionPerformed
        new FrmBotonesHab(getHotel()).setVisible(true);
    }//GEN-LAST:event_mnuitReportHabitActionPerformed

    private void mnuitBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBorrarDatosActionPerformed
        if (confirmar("¿Desea limpiar los datos de todas las habitaciones?"))
            hotel.limpiarHabs();
    }//GEN-LAST:event_mnuitBorrarDatosActionPerformed

    private void mnuitBuscarClienteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitBuscarClienteDocActionPerformed
        try{
            String dni = JOptionPane.showInputDialog(null, "Ingrese el nro. de documento del huésped que desee buscar", "Búsqueda de huesped por DNI", 1);
            boolean encontrado = false;
            for (Habitacion hab: hotel.getHabs()){
                for (Huesped hues : hab.getHuespedes()){
                    if (dni.equals(hues.getNumDoc())){
                        encontrado = true;
                        JOptionPane.showMessageDialog(null,
                                "Se encontró al huesped "+hues.getNombres()+" "+hues.getApellidos()+"\nEn la habitación "+hab.getNumero(), "Huesped encontrado", 1);

                    }
                }
            }
            if (!encontrado)
                JOptionPane.showMessageDialog(null, "No se encontraron resultados para la búsqueda", "Sin resultados", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese solo datos numéricos", "Búsqueda inválida", 2);
        }
    }//GEN-LAST:event_mnuitBuscarClienteDocActionPerformed

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
    private javax.swing.JMenuItem mnuitNombreHotel;
    private javax.swing.JMenuItem mnuitReportHabit;
    private javax.swing.JMenuItem mnuitSetRuc;
    // End of variables declaration//GEN-END:variables
    private Hotel hotel = new Hotel("indefinido", "00000000000");

    public Hotel getHotel() {
        return hotel;
    }
    
}
