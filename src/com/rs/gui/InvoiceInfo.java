/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rs.gui;

import com.rs.dao.SellingDAO;
import com.rs.model.POS;
import com.rs.model.Product;
import com.rs.model.Selling;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class InvoiceInfo extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceInfo
     */
    //List<Selling> selling;
    public String invoice = "";

    double tprice;

    public InvoiceInfo(String s) {
        initComponents();
        showProduct();
        this.invoice = s;
        //System.out.println("invoice is: " + this.invoice);
        invoiceNo.setText(s);
        List<Selling> sellings = new SellingDAO().getInvoiceNo(invoice);
        DefaultTableModel model = (DefaultTableModel) invoiceInfoTable.getModel();

        for (int i = 0; i < sellings.size(); i++) {
            Vector v = new Vector();
            v.add(sellings.get(i).getProductCode());
            v.add(sellings.get(i).getProductName());
            v.add(sellings.get(i).getPrice());
            v.add(sellings.get(i).getProductQty());
            v.add(sellings.get(i).getPrice() * sellings.get(i).getProductQty());
            model.addRow(v);
        }

    }

    public InvoiceInfo() {
        initComponents();
        showProduct();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceInfoTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        invoiceNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        invoiceInfoTable.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        invoiceInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Product", "Qty", "Price", "SubTotal"
            }
        ));
        invoiceInfoTable.setRowHeight(28);
        jScrollPane1.setViewportView(invoiceInfoTable);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setText("Invoice No :");

        invoiceNo.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(invoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Selling s;

    private void showProduct() {
//        s = new Selling();
//        DefaultTableModel model = (DefaultTableModel) invoiceInfoTable.getModel();
//            Vector v = new Vector();
//            v.add(s.getProductCode());
//            v.add(s.getProductName());
//            v.add(s.getProductQty());
//            v.add(s.getPrice());
//            tQty += pQuantity;
//            totalQty.setText(String.valueOf(tQty));
//            v.add((p.getSellingCost() * pQuantity));
//            tprice += (p.getSellingCost() * pQuantity);
//            model.addRow(v);
//            totalPrice.setText(String.valueOf(tprice));

        List<Selling> selling = new SellingDAO().getInvoiceNo(invoice);
        String[] columnNames = {"Code", "Name", "price", "Quantity", "Sub Total"};
        Object[][] data = new Object[selling.size()][5];
        for (int i = 0; i < selling.size(); i++) {
            Selling s = selling.get(i);
            Object[] o = {s.getProductCode(), s.getProductName(), s.getPrice(), s.getProductQty(), s.getSubTotal()};
            for (int j = 0; j < 8; j++) {
                data[i][j] = o[j];
                System.out.println("inv" + s.getProductCode());
            }
        }
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        invoiceInfoTable.setModel(model);
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
            java.util.logging.Logger.getLogger(InvoiceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable invoiceInfoTable;
    private javax.swing.JLabel invoiceNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
