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
        String sql = "insert into staff (user_role, user_code, user_name, phone, gender, email, u_name, u_pass, conf_pass, store_name) values (?,?,?,?,?,?,?,?,?,?)";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getUserRole());
            ps.setString(2, t.getUserCode());
            ps.setString(3, t.getUserName());
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

        String sql = "update staff set  user_role = ?, user_code = ?, user_name = ?, phone = ?, gender = ?, email = ?, u_name = ?, u_pass = ?,conf_pass = ?, store_name = ? where user_code = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, t.getUserRole());
            ps.setString(2, t.getUserCode());
            ps.setString(3, t.getUserName());
            ps.setString(4, t.getPhone());
            ps.setString(5, t.getGender());
            ps.setString(6, t.getEmail());
            ps.setString(7, t.getuName());
            ps.setString(8, t.getuPass());
            ps.setString(9, t.getConfPass());
            ps.setString(10, t.getStoreName());
            ps.setString(11, t.getUserCode());
            //ps.setString(11, Integer.valueOf(t.getId()).toString());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public int delete(User t) {
        String sql = "delete from staff where id = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.valueOf(t.getId()).toString());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public User getByID(int id) {
        String sql = "Select * from staff where id =?";
        User showUser = new User();
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                showUser.setId(Integer.valueOf(rs.getString("id")));
                showUser.setUserCode(rs.getString("user_code"));
                showUser.setUserName(rs.getString("user_name"));
                showUser.setEmail(rs.getString("email"));
                showUser.setPhone(rs.getString("phone"));
                showUser.setUserRole(rs.getString("user_role"));
                showUser.setStoreName(rs.getString("store_name"));
                showUser.setGender(rs.getString("gender"));
                showUser.setuName(rs.getString("u_name"));
                showUser.setuPass(rs.getString("u_pass"));
                showUser.setConfPass(rs.getString("conf_pass"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return showUser;
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
                showUser.setId(Integer.valueOf(rs.getString("id")));
                showUser.setUserCode(rs.getString("user_code"));
                showUser.setUserName(rs.getString("user_name"));
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
        return user;
    }

}
