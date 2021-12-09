package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.User;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO implements ICommonInterface<User> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(User t) {
        String sql = "insert into staff (user_role, first_name, last_name, phone, gender, email, u_name, u_pass, conf_pass, store_name) values (?,?,?,?,?,?,?,?,?,?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getUserRole());
            ps.setString(2, t.getFirstName());
            ps.setString(3, t.getLastName());
            ps.setString(4, t.getPhone());
            ps.setString(5, t.getGender());
            ps.setString(6, t.getEmail());
            ps.setString(7, t.getuName());
            ps.setString(8, t.getuPass());
            ps.setString(9, t.getConfPass());
            ps.setString(10, t.getStoreName());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User edit(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
String sql = "Select * from staff";
        List<User> user = new ArrayList<User>();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                User showUser = new User();
                
                showUser.setFirstName(rs.getString("first_name"));
                showUser.setLastName(rs.getString("last_name"));
                showUser.setEmail(rs.getString("email"));
                showUser.setPhone(rs.getString("phone"));
                showUser.setUserRole(rs.getString("user_role"));
                showUser.setStoreName(rs.getString("store_name"));
                showUser.setGender(rs.getString("gender"));
                showUser.setuName(rs.getString("u_name"));
                showUser.setuPass(rs.getString("u_pass"));
                showUser.setConfPass(rs.getString("conf_pass"));
                
                user.add(showUser);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;    }

}
