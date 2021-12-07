/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.gui;

/**
 *
 * @author USER
 */
public class PeopleApp extends javax.swing.JFrame {

    /**
     * Creates new form PeopleApp
     */
    public PeopleApp() {
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

        bg = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        sidemenubar = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        pos = new javax.swing.JLabel();
        product = new javax.swing.JLabel();
        categoris = new javax.swing.JLabel();
        sales = new javax.swing.JLabel();
        purchases = new javax.swing.JLabel();
        giftCard = new javax.swing.JLabel();
        people = new javax.swing.JLabel();
        setting = new javax.swing.JLabel();
        reports = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addUsres = new javax.swing.JLabel();
        listCustomer = new javax.swing.JLabel();
        addCustomer = new javax.swing.JLabel();
        listSuppliers = new javax.swing.JLabel();
        addSuppliers = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        topbar.setBackground(new java.awt.Color(0, 166, 90));

        logo.setFont(new java.awt.Font("Corbel", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setText("RS POS");

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1692, Short.MAX_VALUE))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg.add(topbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        sidemenubar.setBackground(new java.awt.Color(34, 45, 50));

        dashboard.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-bookmark-24.png"))); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        pos.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        pos.setForeground(new java.awt.Color(255, 255, 255));
        pos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-sale-32.png"))); // NOI18N
        pos.setText("POS");
        pos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                posMouseClicked(evt);
            }
        });

        product.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        product.setForeground(new java.awt.Color(255, 255, 255));
        product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/productmenu.png"))); // NOI18N
        product.setText("Products");
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
        });

        categoris.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        categoris.setForeground(new java.awt.Color(255, 255, 255));
        categoris.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-opened-folder-24.png"))); // NOI18N
        categoris.setText("Categories");
        categoris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorisMouseClicked(evt);
            }
        });

        sales.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cart-24.png"))); // NOI18N
        sales.setText("Sales");
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
        });

        purchases.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        purchases.setForeground(new java.awt.Color(255, 255, 255));
        purchases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-plus-math-24.png"))); // NOI18N
        purchases.setText("Purchases");
        purchases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchasesMouseClicked(evt);
            }
        });

        giftCard.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        giftCard.setForeground(new java.awt.Color(255, 255, 255));
        giftCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-credit-card-24.png"))); // NOI18N
        giftCard.setText("Gift Card");
        giftCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giftCardMouseClicked(evt);
            }
        });

        people.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        people.setForeground(new java.awt.Color(255, 255, 255));
        people.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-users-24.png"))); // NOI18N
        people.setText("People");
        people.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peopleMouseClicked(evt);
            }
        });

        setting.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        setting.setForeground(new java.awt.Color(255, 255, 255));
        setting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-setting-24.png"))); // NOI18N
        setting.setText("Setting");
        setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingMouseClicked(evt);
            }
        });

        reports.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        reports.setForeground(new java.awt.Color(255, 255, 255));
        reports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-report-24.png"))); // NOI18N
        reports.setText("Reports");
        reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidemenubarLayout = new javax.swing.GroupLayout(sidemenubar);
        sidemenubar.setLayout(sidemenubarLayout);
        sidemenubarLayout.setHorizontalGroup(
            sidemenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemenubarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(sidemenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoris, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(giftCard, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        sidemenubarLayout.setVerticalGroup(
            sidemenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidemenubarLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categoris, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sales, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purchases, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giftCard, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(people, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setting, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reports, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        bg.add(sidemenubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 82, -1, 1000));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listUsers.png"))); // NOI18N
        jLabel1.setText("List Users");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addUsres.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addUsres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addUsers.png"))); // NOI18N
        addUsres.setText("Add Users");
        addUsres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addUsres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUsresMouseClicked(evt);
            }
        });

        listCustomer.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        listCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listCustomer.png"))); // NOI18N
        listCustomer.setText("List Customers");
        listCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCustomerMouseClicked(evt);
            }
        });

        addCustomer.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addCustomer.png"))); // NOI18N
        addCustomer.setText("Add Customers");
        addCustomer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCustomerMouseClicked(evt);
            }
        });

        listSuppliers.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        listSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listSupplier.png"))); // NOI18N
        listSuppliers.setText("List Suppliers");
        listSuppliers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listSuppliersMouseClicked(evt);
            }
        });

        addSuppliers.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        addSuppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addSupplier.png"))); // NOI18N
        addSuppliers.setText("Add Supplier");
        addSuppliers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addSuppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSuppliersMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUsres, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addGap(241, 241, 241)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(listCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(addSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(addSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUsres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 1620, 140));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel2.setText("list users");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void posMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_posMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new POSApp().setVisible(true);
    }//GEN-LAST:event_posMouseClicked

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProductsApp().setVisible(true);
    }//GEN-LAST:event_productMouseClicked

    private void categorisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorisMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new CategoryApp().setVisible(true);
    }//GEN-LAST:event_categorisMouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SalesApp().setVisible(true);
    }//GEN-LAST:event_salesMouseClicked

    private void purchasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchasesMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new PurchasesApp().setVisible(true);
    }//GEN-LAST:event_purchasesMouseClicked

    private void giftCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giftCardMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new GiftCardApp().setVisible(true);
    }//GEN-LAST:event_giftCardMouseClicked

    private void peopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peopleMouseClicked
        // TODO add your handling code here:   
    }//GEN-LAST:event_peopleMouseClicked

    private void settingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new SettingApp().setVisible(true);
    }//GEN-LAST:event_settingMouseClicked

    private void reportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ReportsApp().setVisible(true);
    }//GEN-LAST:event_reportsMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here: this.setVisible(false);
        this.setVisible(false);
        new DashboardApp().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void addUsresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUsresMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new AddUsersApp().setVisible(true);
    }//GEN-LAST:event_addUsresMouseClicked

    private void listCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCustomerMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ListCustomersApp().setVisible(true);
    }//GEN-LAST:event_listCustomerMouseClicked

    private void addCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCustomerMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new AddCustomersApp().setVisible(true);
    }//GEN-LAST:event_addCustomerMouseClicked

    private void listSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listSuppliersMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ListSuppliersApp().setVisible(true);
    }//GEN-LAST:event_listSuppliersMouseClicked

    private void addSuppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSuppliersMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new AddSuppliersApp().setVisible(true);
    }//GEN-LAST:event_addSuppliersMouseClicked

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
            java.util.logging.Logger.getLogger(PeopleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCustomer;
    private javax.swing.JLabel addSuppliers;
    private javax.swing.JLabel addUsres;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel categoris;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel giftCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel listCustomer;
    private javax.swing.JLabel listSuppliers;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel people;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel product;
    private javax.swing.JLabel purchases;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel setting;
    private javax.swing.JPanel sidemenubar;
    private javax.swing.JPanel topbar;
    // End of variables declaration//GEN-END:variables
}