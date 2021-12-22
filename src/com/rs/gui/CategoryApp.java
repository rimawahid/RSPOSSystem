/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.gui;

import com.rs.dao.CategoryDAO;
import com.rs.dao.StoreDAO;
import com.rs.model.Category;
import com.rs.model.Store;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class CategoryApp extends javax.swing.JFrame {

    /**
     * Creates new form CategoriesApp
     */
    public CategoryApp() {
        initComponents();
        getAllCategory();
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
        jLabel1 = new javax.swing.JLabel();
        categoriesTable = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        categoryCode = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        categoryName = new javax.swing.JTextField();
        btnAddCategory = new javax.swing.JButton();
        btnDeleteCategory = new javax.swing.JButton();
        btnUpdateCategory = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();

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

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        jLabel1.setText("Categories");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 270, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel2.setText("Code");

        jTextField1.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N
        jTextField1.setText("Please fill in the information below");
        jTextField1.setBorder(null);

        categoryCode.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        name.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        name.setText("Name");

        categoryName.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        btnAddCategory.setBackground(new java.awt.Color(54, 127, 169));
        btnAddCategory.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        btnAddCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCategory.setText("Add Category");
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        btnDeleteCategory.setBackground(new java.awt.Color(54, 127, 169));
        btnDeleteCategory.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        btnDeleteCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteCategory.setText("Delete Category");
        btnDeleteCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCategoryActionPerformed(evt);
            }
        });

        btnUpdateCategory.setBackground(new java.awt.Color(54, 127, 169));
        btnUpdateCategory.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        btnUpdateCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCategory.setText("Update Category");
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(categoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(865, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318)
                .addComponent(btnDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(btnAddCategory)
                    .addContainerGap(1368, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryCode, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(214, Short.MAX_VALUE)
                    .addComponent(btnAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)))
        );

        javax.swing.GroupLayout categoriesTableLayout = new javax.swing.GroupLayout(categoriesTable);
        categoriesTable.setLayout(categoriesTableLayout);
        categoriesTableLayout.setHorizontalGroup(
            categoriesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoriesTableLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        categoriesTableLayout.setVerticalGroup(
            categoriesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(categoriesTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        bg.add(categoriesTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 1620, 350));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        jLabel3.setText("Add Categories");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 270, 70));

        categoryTable.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        categoryTable.setRowHeight(28);
        jScrollPane1.setViewportView(categoryTable);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 650, 1558, 286));

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
        new POSApp2().setVisible(true);
    }//GEN-LAST:event_posMouseClicked

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ProductsApp().setVisible(true);
    }//GEN-LAST:event_productMouseClicked

    private void categorisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorisMouseClicked
        // TODO add your handling code here:
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
        this.setVisible(false);
        new PeopleApp().setVisible(true);
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
        // TODO add your handling code here:
        this.setVisible(false);
        new DashboardApp().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        // TODO add your handling code here:
        Category categories = new Category();
        categories.setCategoryCode(categoryCode.getText());
        categories.setCategoryName(categoryName.getText());
        int status = new CategoryDAO().save(categories);
        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Category Saved!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Category Not Saved!");

        }
        getAllCategory();

    }//GEN-LAST:event_btnAddCategoryActionPerformed


    private void btnDeleteCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCategoryActionPerformed

        Category category = new Category();
        int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete?", null, WIDTH);
        if (option == 0) {
            category.setCategoryCode(categoryCode.getText());
            int status = new CategoryDAO().delete(category);
            if (status > 0) {
                JOptionPane.showMessageDialog(rootPane, "Category delete!");

            } else {
                JOptionPane.showMessageDialog(rootPane, "Category Not delete!");
            }
        }
        getAllCategory();
    }//GEN-LAST:event_btnDeleteCategoryActionPerformed

    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed
        // TODO add your handling code here:

        categoryTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                categoryCode.setText(categoryTable.getValueAt(categoryTable.getSelectedRow(), 0).toString());
                categoryName.setText(categoryTable.getValueAt(categoryTable.getSelectedRow(), 1).toString());

            }
        });
        Category category = new Category();
        category.setCategoryCode(categoryCode.getText());
        category.setCategoryName(categoryName.getText());

        int status = new CategoryDAO().update(category);
        if (status > 0) {
            JOptionPane.showMessageDialog(rootPane, "Category Update!");

        } else {
            JOptionPane.showMessageDialog(rootPane, "Category Not Update!");
        }
        getAllCategory();
    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void getAllCategory() {
        List<Category> categories = new CategoryDAO().getAll();
        String[] columnNames = {"Code", "Name"};
        Object[][] data = new Object[categories.size()][3];
        for (int i = 0; i < categories.size(); i++) {
            Category s = categories.get(i);
            Object[] o = {s.getCategoryCode(), s.getCategoryName()};
            for (int j = 0; j < 2; j++) {
                data[i][j] = o[j];
            }
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        categoryTable.setModel(model);
    }

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
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnDeleteCategory;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JPanel categoriesTable;
    private javax.swing.JLabel categoris;
    private javax.swing.JTextField categoryCode;
    private javax.swing.JTextField categoryName;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel giftCard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel name;
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
