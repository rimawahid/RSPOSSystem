package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.Customer;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddCustomerDAO implements ICommonInterface<Customer> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Customer t) {
        String sql = "insert into customer (customer_name, customer_email, customer_phn, customer_address) values (?, ?, ?, ?) ";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCustomerName());
            ps.setString(2, t.getCustomerEmail());
            ps.setString(3, t.getCustomerPhone());
            ps.setString(4, t.getCustomerAddress());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Customer edit(Customer t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Customer t) {
String sql = "update customer set customer_name = ?, customer_email = ?, customer_phn = ?, customer_address = ? where customer_name = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCustomerName());
            ps.setString(2, t.getCustomerEmail());
            ps.setString(3, t.getCustomerPhone());
            ps.setString(4, t.getCustomerAddress());
            ps.setString(5, t.getCustomerName());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;    }

    @Override
    public int delete(Customer t) {
        String sql = "delete from customer where customer_name = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCustomerName());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Customer getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getAll() {
        String sql = "Select * from customer";
        List<Customer> customer = new ArrayList<Customer>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Customer showCustomer = new Customer();
                showCustomer.setCustomerName(rs.getString("customer_name"));
                showCustomer.setCustomerEmail(rs.getString("customer_email"));
                showCustomer.setCustomerPhone(rs.getString("customer_phn"));
                showCustomer.setCustomerAddress(rs.getString("customer_address"));
                customer.add(showCustomer);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddSupplierDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customer;
    }

}
