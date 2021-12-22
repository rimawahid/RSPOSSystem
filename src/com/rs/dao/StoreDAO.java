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

        String sql = "insert into store (store_name, store_code, store_email, store_phn, store_address, store_city, store_state, store_postal, store_country) values (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
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
            ps.setString(7, t.getStoreState());
            ps.setString(8, Integer.valueOf(t.getStorePostalCode()).toString());
            ps.setString(9, t.getStoreCountry());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(AddStoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
    }

    @Override
    public Store edit(Store t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Store t) {
        String sql = "update store set store_name = ?, store_code = ?, store_email = ?, store_phn = ?, store_address = ?,store_city =?, store_state=?, store_postal = ?, store_country =? where store_code = ?";
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
            ps.setString(7, t.getStoreState());
            ps.setString(8, Integer.valueOf(t.getStorePostalCode()).toString());
            ps.setString(9, t.getStoreCountry());
            ps.setString(10, t.getStoreCode());

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
        String sql = "delete from store where store_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getStoreCode());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiftCardDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public Store getByID(int id) {
        String sql = "Select * from store where id = ?";
        Store showStore = new Store();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                showStore.setId(Integer.valueOf(rs.getString("id")));
                showStore.setStoreName(rs.getString("store_name"));
                showStore.setStoreCode(rs.getString("store_code"));
                showStore.setStoreEmail(rs.getString("store_email"));
                showStore.setStorePhone(rs.getString("store_phn"));
                showStore.setStoreAddress(rs.getString("store_address"));
                showStore.setStoreCity(rs.getString("store_city"));
                showStore.setStoreState(rs.getString("store_state"));
                showStore.setStorePostalCode(Integer.valueOf(rs.getString("store_postal")));
                showStore.setStoreCountry(rs.getString("store_country"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return showStore;
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
                showStore.setId(Integer.valueOf(rs.getString("id")));
                showStore.setStoreName(rs.getString("store_name"));
                showStore.setStoreCode(rs.getString("store_code"));
                showStore.setStoreEmail(rs.getString("store_email"));
                showStore.setStorePhone(rs.getString("store_phn"));
                showStore.setStoreAddress(rs.getString("store_address"));
                showStore.setStoreCity(rs.getString("store_city"));
                showStore.setStoreState(rs.getString("store_state"));
                showStore.setStorePostalCode(Integer.valueOf(rs.getString("id")));
                showStore.setStoreCountry(rs.getString("store_country"));

                stores.add(showStore);

                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StoreDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stores;
    }

}
