package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.Purchase;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PurchaseDAO implements ICommonInterface<Purchase> {

    Connection con;
    PreparedStatement ps;

    @Override

    public int save(Purchase t) {
        String sql = "insert into purchase (purchase_date, reference, total_price, note) values (?,?,?,?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPurchaseDate());
            ps.setString(2, t.getReference());
            ps.setString(3, Double.valueOf(t.getTotal()).toString());
            ps.setString(4, t.getNote());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Purchase edit(Purchase t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Purchase t) {
        String sql = "update purchase set purchase_date = ?,reference =?, total_price = ?, note =? where reference = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getPurchaseDate());
            ps.setString(2, t.getReference());
            ps.setString(3, Double.valueOf(t.getTotal()).toString());
            ps.setString(4, t.getNote());
            ps.setString(5, t.getReference());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public int delete(Purchase t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Purchase getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Purchase> getAll() {
        String sql = "Select * from purchase";
        List<Purchase> purchase = new ArrayList<Purchase>();

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Purchase showpurchase = new Purchase();
                showpurchase.setPurchaseDate(rs.getString("purchase_date"));
                showpurchase.setReference(rs.getString("reference"));
                showpurchase.setTotal(Double.valueOf(rs.getString("total_price").toString()));
                showpurchase.setNote(rs.getString("note"));
                purchase.add(showpurchase);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PurchaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return purchase;
    }

}
