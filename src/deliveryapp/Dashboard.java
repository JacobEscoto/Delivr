package deliveryapp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dashboard extends javax.swing.JFrame {
    
    public static ArrayList<Cliente> clientes = new ArrayList();
    public static ArrayList<Repartidor> repartidores = new ArrayList();
    public static ArrayList<Paquete> paquetes = new ArrayList();
    public static ArrayList<Pedido> pedidos = new ArrayList();
    public static char[][] mapa = new char[15][15];
    Metodos methods = new Metodos();

    public Dashboard() {
        initComponents();
        ImageIcon icon = new ImageIcon("src/Images/package.png");
        setIconImage(icon.getImage());
        setImageLabel(iconDelivr, "src/Images/deliveryIcon.png");
        this.setLocationRelativeTo(this);
        configBtn(clientesBtn);
        configBtn(repartidorBtn);
        configBtn(paquetesBtn);
        configBtn(pedidosBtn);
        
    }
    
    private void configBtn(javax.swing.JButton boton) {
        boton.setContentAreaFilled(false);
        boton.setBorderPainted(false);
        boton.setFocusPainted(false);
        boton.setOpaque(false);
    }
    
    private void setScreen(javax.swing.JPanel panel) {
        panel.setSize(766, 488);
        panel.setLocation(0, 0);
        content.removeAll();
        content.add(panel, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lateralMenu = new javax.swing.JPanel();
        clientesBtn = new javax.swing.JButton();
        repartidorBtn = new javax.swing.JButton();
        paquetesBtn = new javax.swing.JButton();
        pedidosBtn = new javax.swing.JButton();
        content = new javax.swing.JPanel();
        iconDelivr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivr App");
        setIconImage(getIconImage());
        setResizable(false);

        lateralMenu.setBackground(new java.awt.Color(31, 114, 193));

        clientesBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clientesBtn.setForeground(new java.awt.Color(255, 255, 255));
        clientesBtn.setText("Clientes");
        clientesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBtnActionPerformed(evt);
            }
        });

        repartidorBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        repartidorBtn.setForeground(new java.awt.Color(255, 255, 255));
        repartidorBtn.setText("Repartidores");
        repartidorBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        repartidorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repartidorBtnActionPerformed(evt);
            }
        });

        paquetesBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paquetesBtn.setForeground(new java.awt.Color(255, 255, 255));
        paquetesBtn.setText("Paquetes");
        paquetesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paquetesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paquetesBtnActionPerformed(evt);
            }
        });

        pedidosBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pedidosBtn.setForeground(new java.awt.Color(255, 255, 255));
        pedidosBtn.setText("Pedidos");
        pedidosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedidosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedidosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lateralMenuLayout = new javax.swing.GroupLayout(lateralMenu);
        lateralMenu.setLayout(lateralMenuLayout);
        lateralMenuLayout.setHorizontalGroup(
            lateralMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(lateralMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pedidosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paquetesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repartidorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        lateralMenuLayout.setVerticalGroup(
            lateralMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lateralMenuLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(clientesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(repartidorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(paquetesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pedidosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(19, 28, 38));
        content.setMaximumSize(new java.awt.Dimension(766, 488));
        content.setMinimumSize(new java.awt.Dimension(766, 488));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 115, 195));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO!");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconDelivr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addGap(236, 236, 236))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(iconDelivr, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lateralMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lateralMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBtnActionPerformed
        setScreen(new ClientScreen());
    }//GEN-LAST:event_clientesBtnActionPerformed

    private void repartidorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repartidorBtnActionPerformed
        setScreen(new RepartidorScreen());
    }//GEN-LAST:event_repartidorBtnActionPerformed

    private void paquetesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paquetesBtnActionPerformed
        setScreen(new PaqueteScreen());
    }//GEN-LAST:event_paquetesBtnActionPerformed

    private void pedidosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedidosBtnActionPerformed
        setScreen(new PedidosScreen());
    }//GEN-LAST:event_pedidosBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    private void setImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clientesBtn;
    private javax.swing.JPanel content;
    private javax.swing.JLabel iconDelivr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lateralMenu;
    private javax.swing.JButton paquetesBtn;
    private javax.swing.JButton pedidosBtn;
    private javax.swing.JButton repartidorBtn;
    // End of variables declaration//GEN-END:variables
}
