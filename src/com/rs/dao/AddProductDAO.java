package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.AddProduct;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddProductDAO implements ICommonInterface<AddProduct> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(AddProduct t) {
        String sql = "insert into product (product_type, product_name, product_code, product_barcode, product_category, product_cost, product_price, product_tax, tax_method, alert_qty) values (?, ?, ?, ?, ?, ?, ?,?,?,?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getProductType());
            ps.setString(2, t.getProductName());
            ps.setString(3, t.getProductCode());
            ps.setString(4, t.getProductBarCode());
            ps.setString(5, t.getProductCategory());
            ps.setString(6, Double.valueOf(t.getProductCost()).toString());
            ps.setString(7, Double.valueOf(t.getProductPrice()).toString());
            ps.setString(8, Double.valueOf(t.getProductTax()).toString());
            ps.setString(9, t.getTaxMethod());
            ps.setString(10, Integer.valueOf(t.getAlertQty()).toString());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AddProduct edit(AddProduct t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(AddProduct t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(AddProduct t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AddProduct getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AddProduct> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
