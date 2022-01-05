package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.Selling;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SellingDAO implements ICommonInterface<Selling> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Selling t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Selling edit(Selling t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Selling t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Selling t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Selling getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Selling> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Selling> getInvoiceNo(String invoiceNo) {
        String sql = "select * from selling where invoice_no = ?";
        List<Selling> sellingList = new ArrayList<Selling>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, invoiceNo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Selling selling = new Selling();
                selling.setProductName(rs.getString("product_name"));
                selling.setProductCode(rs.getString("product_code"));
                selling.setProductQty(Integer.valueOf(rs.getString("product_qty")));
                selling.setPrice(Double.valueOf(rs.getString("buying_price")));
                selling.setSubTotal(Double.valueOf(rs.getString("total_price")));
                sellingList.add(selling);

                //System.out.println(rs.getString("product_name"));
    
            }

        } catch (Exception e) {
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return sellingList;
    }

}
