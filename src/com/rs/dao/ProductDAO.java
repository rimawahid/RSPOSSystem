package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.Product;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDAO implements ICommonInterface<Product> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Product t) {
        String sql = "insert into product (product_type, product_name, product_code, product_barcode, product_category, product_qty, buying_price,others_Cost, total_price, selling_price, supplier, alert_qty) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getProductType());
            ps.setString(2, t.getProductName());
            ps.setString(3, t.getProductCode());
            ps.setString(4, t.getProductBarCode());
            ps.setString(5, t.getProductCategory());
            ps.setString(6, Integer.valueOf(t.getQuantity()).toString());
            ps.setString(7, Double.valueOf(t.getBuyingCost()).toString());
            ps.setString(8, Double.valueOf(t.getOthersCost()).toString());
            ps.setString(9, Double.valueOf(t.getToalPrice()).toString());
            ps.setString(10, Double.valueOf(t.getSellingCost()).toString());
            ps.setString(11, t.getSupplier());
            ps.setString(12, Integer.valueOf(t.getAlertQty()).toString());

            status = ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Product edit(Product t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Product t) {
        String sql = "update product set  product_type = ?, product_name = ?, product_code = ?, product_barcode =?, product_category=? , product_qty = ?, buying_price = ?,others_Cost = ?, total_price = ?, selling_price = ?, supplier = ?, alert_qty = ? where product_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, t.getProductType());
            ps.setString(2, t.getProductName());
            ps.setString(3, t.getProductCode());
            ps.setString(4, t.getProductBarCode());
            ps.setString(5, t.getProductCategory());
            ps.setString(6, Integer.valueOf(t.getQuantity()).toString());
            ps.setString(7, Double.valueOf(t.getBuyingCost()).toString());
            ps.setString(8, Double.valueOf(t.getOthersCost()).toString());
            ps.setString(9, Double.valueOf(t.getToalPrice()).toString());
            ps.setString(10, Double.valueOf(t.getSellingCost()).toString());
            ps.setString(11, t.getSupplier());
            ps.setString(12, Integer.valueOf(t.getAlertQty()).toString());
            ps.setString(13, t.getProductCode());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public int delete(Product t) {
        String sql = "delete from product where product_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getProductCode());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Product getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getAll() {
        String sql = "Select * from product";
        List<Product> products = new ArrayList<Product>();

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Product showProduct = new Product();
                showProduct.setId(Integer.valueOf(rs.getString("id")));
                showProduct.setProductType(rs.getString("product_type"));
                showProduct.setProductName(rs.getString("product_name"));
                showProduct.setProductCode(rs.getString("product_code"));
                showProduct.setProductBarCode(rs.getString("product_barcode"));
                showProduct.setProductCategory(rs.getString("product_category"));
                showProduct.setQuantity(Integer.valueOf(rs.getString("product_qty")));
                showProduct.setBuyingCost(Double.valueOf(rs.getString("buying_price")));
                showProduct.setOthersCost(Double.valueOf(rs.getString("others_Cost")));
                showProduct.setToalPrice(Double.valueOf(rs.getString("total_price")));
                showProduct.setSellingCost(Double.valueOf(rs.getString("selling_price")));
                showProduct.setSupplier(rs.getString("supplier"));
                showProduct.setAlertQty(Integer.valueOf(rs.getString("alert_qty")));

                products.add(showProduct);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    
      public Product getByCode(String code) {
        String sql = "select * from product where product_code = ?";
        Product product = new Product();
        try  {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
             product.setId(rs.getInt("id"));
//                product.setProductCode(rs.getString("product_code"));
//                product.setProductName(rs.getString("product_name"));
//                product.setBasePrice(rs.getDouble("base_price"));
//                product.setSellingPrice(rs.getDouble("selling_price"));
//                product.setBuyingPrice(rs.getDouble("buying_price"));
//                product.setDiscountPercent(rs.getDouble("discount_percent"));
//                product.setVatPercent(rs.getDouble("vat_percent"));
//                System.out.println(product.getProductName());
                
               // product.setId(Integer.valueOf(rs.getString("id")));
                product.setProductType(rs.getString("product_type"));
                product.setProductName(rs.getString("product_name"));
                product.setProductCode(rs.getString("product_code"));
                product.setProductCategory(rs.getString("product_barcode"));
                product.setProductBarCode(rs.getString("product_category"));
                product.setQuantity(Integer.valueOf(rs.getString("product_qty")));
                product.setBuyingCost(Double.valueOf(rs.getString("buying_price")));
                product.setOthersCost(Double.valueOf(rs.getString("others_Cost")));
                product.setToalPrice(Double.valueOf(rs.getString("total_price")));
                product.setSellingCost(Double.valueOf(rs.getString("selling_price")));
                product.setSupplier(rs.getString("supplier"));
                product.setAlertQty(Integer.valueOf(rs.getString("alert_qty")));
            }
               
        } catch (Exception e) {
        }finally{
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return product;
    }

}
