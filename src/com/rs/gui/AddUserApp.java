/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.gui;

import com.rs.dao.StoreDAO;
import com.rs.dao.UserDAO;
import com.rs.model.Store;
import com.rs.model.User;
import java.util.List;
import javax.swing.JOptionPane;

public class AddUserApp extends javax.swing.JFrame {

    List<Store> stores;
    List<User> users;

    public AddUserApp() {
        initComponents();
        stores = new StoreDAO().getAll();
        for (int i = 0; i < stores.size(); i++) {
            storeName.addItem(stores.get(i).getStoreName());
        }
    }

    AddUserApp(User s) {
          initComponents();
        stores = new StoreDAO().getAll();
        for (int i = 0; i < stores.size(); i++) {
            storeName.addItem(stores.get(i).getStoreName());
        }
        addValue(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jPanel2 = new javax.swing.JPanel();
        listUser = new javax.swing.JLabel();
        addUsres = new javax.swing.JLabel();
        listCustomer = new javax.swing.JLabel();
        addCustomer = new javax.swing.JLabel();
        listSuppliers = new javax.swing.JLabel();
        addSuppliers = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uPass = new javax.swing.JTextField();
        confPass = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        storeName = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        userRole = new javax.swing.JComboBox<>();
        btnAddUser = new javax.swing.JButton();
        userCode = new javax.swing.JTextField();
        btnUpdateUser = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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

        listUser.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        listUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/listUsers.png"))); // NOI18N
        listUser.setText("List Users");
        listUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listUserMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addUsres, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                .addGap(241, 241, 241)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(listCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(addSuppliers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(addSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listSuppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUsres, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 1620, 140));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        jLabel2.setText("Add User");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 190, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N
        jTextField1.setText("Please fill in the information below");
        jTextField1.setBorder(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel3.setText("Group");

        email.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel5.setText("User Code");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel6.setText("Username");

        uName.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        userName.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel7.setText("user Name");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel8.setText("Password");

        uPass.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        confPass.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        phone.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel9.setText("Phone");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel10.setText("Confirm Password");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel11.setText("Store");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel12.setText("Gender");

        storeName.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N

        gender.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        userRole.setFont(new java.awt.Font("Corbel", 0, 20)); // NOI18N
        userRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "staff" }));

        btnAddUser.setBackground(new java.awt.Color(54, 127, 169));
        btnAddUser.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnAddUser.setForeground(new java.awt.Color(255, 255, 255));
        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        userCode.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N

        btnUpdateUser.setBackground(new java.awt.Color(54, 127, 169));
        btnUpdateUser.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        btnUpdateUser.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUser.setText("Update User");
        btnUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(userName)
                                .addComponent(phone)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gender, 0, 533, Short.MAX_VALUE)
                                .addComponent(userRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userCode))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(245, 245, 245)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uName)
                    .addComponent(uPass)
                    .addComponent(confPass)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(storeName, 0, 533, Short.MAX_VALUE))
                .addGap(166, 166, 166))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(userRole))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uName, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(userCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confPass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(storeName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 1560, 730));

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

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here: this.setVisible(false);
        this.setVisible(false);
        new DashboardApp().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

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

    private void addUsresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUsresMouseClicked
        // TODO add your handling code here:
//        this.setVisible(false);
//        new AddUsersApp().setVisible(true);
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

    private void listUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listUserMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new PeopleApp().setVisible(true);
    }//GEN-LAST:event_listUserMouseClicked

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setUserRole(userRole.getSelectedItem().toString());
        user.setUserCode(userCode.getText());
        user.setUserName(userName.getText());
        user.setPhone(phone.getText());
        user.setGender(gender.getSelectedItem().toString());
        user.setEmail(email.getText());
        user.setuName(uName.getText());
        user.setuPass(uPass.getText());
        user.setConfPass(confPass.getText());
        user.setStoreName(storeName.getSelectedItem().toString());
        int status = new UserDAO().save(user);
        if (status > 0) {
            System.out.println("connnn...");
            JOptionPane.showMessageDialog(rootPane, "Category Saved!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Category Not Saved!");

        }
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void btnUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserActionPerformed
        // TODO add your handling code here:
        User user = new User();
        user.setUserRole(userRole.getSelectedItem().toString());
        user.setUserCode(userCode.getText());
        user.setUserName(userName.getText());
        user.setPhone(phone.getText());
        user.setGender(gender.getSelectedItem().toString());
        user.setEmail(email.getText());
        user.setuName(uName.getText());
        user.setuPass(uPass.getText());
        user.setConfPass(confPass.getText());
        user.setStoreName(storeName.getSelectedItem().toString());
        int status = new UserDAO().update(user);
        if (status > 0) {
            
            JOptionPane.showMessageDialog(rootPane, "User Update!");

        } else {
            System.err.println(userCode.getText());
            JOptionPane.showMessageDialog(rootPane, "USer Not Update!");
        }
        this.setVisible(false);
       new PeopleApp().setVisible(true);
    }//GEN-LAST:event_btnUpdateUserActionPerformed

    public void addValue(User currentUser) {
        User u = new UserDAO().getByID(currentUser.getId());
//        

        userCode.setText(u.getUserCode());
        userName.setText(u.getUserName());
        email.setText(u.getEmail());
        phone.setText(u.getPhone());
        uName.setText(u.getuName());
        uPass.setText(u.getuPass());
        System.out.println(u.getUserCode());
        confPass.setText(u.getConfPass());
        //userRole.setText(u.getUserRole());
        String ur = u.getUserRole();
        users = new UserDAO().getAll();
        System.out.println(ur);
        for (int i = 0; i < users.size(); i++) {
            userRole.addItem(users.get(i).getUserRole());
            if (users.get(i).getUserRole().equals(ur)) {
                userRole.setSelectedItem(ur);
            }
        }
        //userGender.setText(u.getUserGender());
        String ug = u.getGender();
        users = new UserDAO().getAll();
        System.out.println(ur);
        for (int i = 0; i < users.size(); i++) {
            gender.addItem(users.get(i).getGender());
            if (users.get(i).getGender().equals(ug)) {
                gender.setSelectedItem(ug);
            }
        }
        //storeName.setText(u.getStoreName());
        String ss = u.getStoreName();
        stores = new StoreDAO().getAll();
        System.out.println(ss);
        for (int i = 0; i < stores.size(); i++) {
            storeName.addItem(stores.get(i).getStoreName());
            if (stores.get(i).getStoreName().equals(ss)) {
                storeName.setSelectedItem(ss);
            }
        }

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
            java.util.logging.Logger.getLogger(AddUserApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUserApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCustomer;
    private javax.swing.JLabel addSuppliers;
    private javax.swing.JLabel addUsres;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnUpdateUser;
    private javax.swing.JLabel categoris;
    private javax.swing.JTextField confPass;
    private javax.swing.JLabel dashboard;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel giftCard;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel listCustomer;
    private javax.swing.JLabel listSuppliers;
    private javax.swing.JLabel listUser;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel people;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pos;
    private javax.swing.JLabel product;
    private javax.swing.JLabel purchases;
    private javax.swing.JLabel reports;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel setting;
    private javax.swing.JPanel sidemenubar;
    private javax.swing.JComboBox<String> storeName;
    private javax.swing.JPanel topbar;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPass;
    private javax.swing.JTextField userCode;
    private javax.swing.JTextField userName;
    private javax.swing.JComboBox<String> userRole;
    // End of variables declaration//GEN-END:variables
}
