package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.AddStore;
import com.rs.model.Store;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoreDAO implements ICommonInterface<Store> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(Store t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store edit(Store t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Store t) {
        String sql = "update store set store_name = ?, store_code = ?, store_email = ?, store_phn = ?, store_address = ?,store_city =? where store_code = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getStoreName());
            ps.setString(2, t.getStoreCode());
            ps.setString(3, t.getStoreEmail());
            ps.setString(4, t.getStorePhone());
            ps.setString(5, t.getStoreAddress());
            ps.setString(6, t.getStoreCity());
            ps.setString(7, t.getStoreCode());

            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(Store t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Store getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Store> getAll() {
        String sql = "Select * from store";
        List<Store> stores = new ArrayList<Store>();

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                Store showStore = new Store();
                showStore.setStoreName(rs.getString("store_name"));
                showStore.setStoreCode(rs.getString("store_code"));
                showStore.setStoreEmail(rs.getString("store_email"));
                showStore.setStorePhone(rs.getString("store_phn"));
                showStore.setStoreAddress(rs.getString("store_address"));
                showStore.setStoreCity(rs.getString("store_city"));

                stores.add(showStore);

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stores;
    }

    
}
