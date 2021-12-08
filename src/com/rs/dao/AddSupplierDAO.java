package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.AddStore;
import com.rs.model.Supplier;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddSupplierDAO implements ICommonInterface<Supplier> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Supplier t) {
        String sql = "insert into supplier (supplier_name, supplier_email, supplier_phn, supplier_address) values (?, ?, ?, ?) ";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getSupplierName());
            ps.setString(2, t.getSupplierEmail());
            ps.setString(3, t.getSupplierPhone());
            ps.setString(4, t.getSupplierAddress());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Supplier edit(Supplier t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Supplier t) {
        String sql = "update supplier set supplier_name = ?, supplier_email = ?, supplier_phn = ?, supplier_address = ? where supplier_name = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getSupplierName());
            ps.setString(2, t.getSupplierEmail());
            ps.setString(3, t.getSupplierPhone());
            ps.setString(4, t.getSupplierAddress());
            ps.setString(5, t.getSupplierName());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public int delete(Supplier t) {
        String sql = "delete from supplier where supplier_name = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getSupplierName());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Supplier getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Supplier> getAll() {
        String sql = "Select * from supplier";
        List<Supplier> supplier = new ArrayList<Supplier>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Supplier showSupplier = new Supplier();
                showSupplier.setSupplierName(rs.getString("supplier_name"));
                showSupplier.setSupplierEmail(rs.getString("supplier_email"));
                showSupplier.setSupplierPhone(rs.getString("supplier_phn"));
                showSupplier.setSupplierAddress(rs.getString("supplier_address"));
                supplier.add(showSupplier);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return supplier;
    }

}
