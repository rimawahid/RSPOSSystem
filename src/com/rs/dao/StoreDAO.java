package com.rs.dao;

import com.rs.common.ICommonInterface;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
                showStore.setSotreName(rs.getString("store_name"));
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
