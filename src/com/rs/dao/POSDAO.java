package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.POS;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POSDAO implements ICommonInterface<POS> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(POS t) {
        String sql = "insert into pos ( invoice, total_qty, total_price, discount, vat, total_payable, total_paying, balance, pay_method, customer,status, date) values (?,?, ?, ?, ?, ?, ?, ?,?,?,?,?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getInvoice());
            ps.setString(2, Integer.valueOf(t.getTotalQty()).toString());
            ps.setString(3, Double.valueOf(t.getTotalPrice()).toString());
            ps.setString(4, Double.valueOf(t.getDiscount()).toString());
            ps.setString(5, Double.valueOf(t.getVat()).toString());
            ps.setString(6, Double.valueOf(t.getTotalPayAmountVlaue()).toString());
            ps.setString(7, Double.valueOf(t.getTotalPayable()).toString());
            ps.setString(8, Double.valueOf(t.getBalance()).toString());
            ps.setString(9, t.getPayMethod());
            ps.setString(10, t.getCustomerName());
            ps.setString(11, "SOLD");
            ps.setString(12, t.getSellDate());
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
        String sql = "Select * from pos";
        List<POS> pos = new ArrayList<POS>();
         
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                POS showpos = new POS();
                showpos.setSellDate(rs.getString("date"));
                showpos.setInvoice(rs.getString("invoice"));
                showpos.setCustomerName(rs.getString("customer"));
                showpos.setTotalPrice(Double.valueOf(rs.getString("total_price").toString()));
                showpos.setDiscount(Double.valueOf(rs.getString("discount").toString()));
                showpos.setVat(Double.valueOf(rs.getString("vat").toString()));
                showpos.setTotalPayAmountVlaue(Double.valueOf(rs.getString("total_payable").toString()));
                showpos.setPayMethod(rs.getString("pay_method"));
                showpos.setStatus(rs.getString("status"));
                //showpos.s(rs.getString("status"));
                pos.add(showpos);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(POSDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pos;
    }

}
