
package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.AddStore;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddStoreDAO implements ICommonInterface<AddStore>{
Connection con;
PreparedStatement ps;
    @Override
    public int save(AddStore t) {
        String sql = "insert into store (store_name, store_code, store_email, store_phn, store_address, store_city, store_state, store_postal, store_country) values (?, ?, ?, ?, ?, ?, ?, ?, ?) ";
        int status = 0;
        
    try {
        con = DBConnection.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, t.getStoreName());
        ps.setString(2, t.getStoreCode());
        ps.setString(3, t.getStoreEmail());
        ps.setString(4, t.getStorePhn());
        ps.setString(5, t.getStoreAddress());
        ps.setString(6, t.getStoreCity());
        ps.setString(7, t.getStoreState());
        ps.setString(8, Integer.valueOf(t.getStorePostalCode()).toString());
        ps.setString(9, t.getStoreCountry());
        status = ps.executeUpdate();
    } catch (SQLException ex) {
        //Logger.getLogger(AddStoreDAO.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AddStoreDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return status;
        
    }

    @Override
    public AddStore edit(AddStore t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(AddStore t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(AddStore t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AddStore getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AddStore> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
