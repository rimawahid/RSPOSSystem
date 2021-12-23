package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.POS;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POSDAO implements ICommonInterface<POS> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(POS t) {
        String sql = "insert into pos ( invoice_no, total_qty, total_price, discount, vat, total_payable) values (?, ?, ?, ?, ?, ?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.valueOf(t.getInvoice()).toString());
            ps.setString(2, Integer.valueOf(t.getTotalQty()).toString());
            ps.setString(3, Double.valueOf(t.getTotalPrice()).toString());
            ps.setString(4, Double.valueOf(t.getDiscount()).toString());
            ps.setString(5, Double.valueOf(t.getVat()).toString());
            ps.setString(6, Double.valueOf(t.getTotalPayAmountVlaue()).toString());
            //ps.setString(7, t.getPayMethod());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(POSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public POS edit(POS t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(POS t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(POS t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public POS getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<POS> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
