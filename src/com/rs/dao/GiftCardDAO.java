package com.rs.dao;

import com.rs.common.ICommonInterface;
import com.rs.model.GiftCard;
import com.rs.model.User;
import com.rs.util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class GiftCardDAO implements ICommonInterface<GiftCard> {

    Connection con;
    PreparedStatement ps;

    @Override
    public int save(GiftCard t) {
        String sql = "insert into gift (card_no, value, balance, expiry_date, created_by) values (?,?,?,?,?)";
        int status = 0;
        
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.valueOf(t.getCardNo()).toString());
            ps.setString(2, Integer.valueOf(t.getValue()).toString());
            ps.setString(3, Double.valueOf(t.getBalance()).toString());
            ps.setDate(4, new Date(t.getExpiryDate().getTime()));            
            ps.setString(5, t.getCreatedBy());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiftCardDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    @Override
    public GiftCard edit(GiftCard t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(GiftCard t) {
        String sql = "update gift set card_no = ?, value = ?, balance = ?, expiry_date = ?, created_by = ? where card_no = ?";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.valueOf(t.getCardNo()).toString());
            ps.setString(2, Integer.valueOf(t.getValue()).toString());
            ps.setString(3, Double.valueOf(t.getBalance()).toString());
            ps.setDate(4, new Date(t.getExpiryDate().getTime()));
             ps.setString(5, t.getCreatedBy());
            System.err.println(t.getExpiryDate());
            ps.setString(6, Integer.valueOf(t.getCardNo()).toString());

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
    }

    @Override
    public int delete(GiftCard t) {
        String sql = "delete from gift where card_no = ?";
        int status = 0;

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Integer.valueOf(t.getCardNo()).toString());

            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiftCardDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    @Override
    public GiftCard getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GiftCard> getAll() {
        String sql = "Select * from gift";
        List<GiftCard> gift = new ArrayList<GiftCard>();

        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                GiftCard showGift = new GiftCard();
                showGift.setCardNo(Integer.valueOf(rs.getString("card_no")));
                showGift.setValue(Integer.valueOf(rs.getString("value")));
                showGift.setBalance(Double.valueOf(rs.getString("balance")));
                showGift.setExpiryDate(rs.getDate("expiry_date"));
                showGift.setCreatedBy(rs.getString("created_by"));
                gift.add(showGift);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiftCardDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gift;
    }

}
