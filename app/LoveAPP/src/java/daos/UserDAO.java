/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daos;

import entities.*;
import java.util.*;
import java.io.*;
import java.sql.*;
import daos.*;

/**
 *
 * @author ASUS
 */
public class UserDAO {
    
    public ArrayList<User> retrieveAllUsers() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<User> users = new ArrayList<User>();

        try {
            conn = ConnectionManager.getConnection();
            pstmt = conn.prepareStatement("SELECT fullName, nickName, gender, hpNumber, hNumber, email, password, company, year, admin FROM user"
                    + " ORDER BY email");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getString("fullName"), rs.getString("nickName"), rs.getString("gender").charAt(0), rs.getInt("hpNumber"), rs.getInt("hNumber"), rs.getString("email"), rs.getString("password"), rs.getString("company"), rs.getInt("year"),rs.getBoolean("admin")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, pstmt, rs);
        }

        return users;
    }
    
    public ArrayList<User> retrieveAllUsersByYear(int year) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<User> users = new ArrayList<User>();

        try {
            conn = ConnectionManager.getConnection();
            pstmt = conn.prepareStatement("SELECT fullName, nickName, gender, hpNumber, hNumber, email, password, company, year, admin FROM user"
                    + "WHERE year=" +year+" ORDER BY email");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getString("fullName"), rs.getString("nickName"), rs.getString("gender").charAt(0), rs.getInt("hpNumber"), rs.getInt("hNumber"), rs.getString("email"), rs.getString("password"), rs.getString("company"), rs.getInt("year"),rs.getBoolean("admin")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, pstmt, rs);
        }

        return users;
    }
    
    public User retrieveUser(String email) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = null;

        try {
            conn = ConnectionManager.getConnection();
            pstmt = conn.prepareStatement("SELECT fullName, nickName, gender, hpNumber, hNumber, email, password, company, year, admin FROM user"
                    + " WHERE email="+email);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                user = new User(rs.getString("fullName"), rs.getString("nickName"), rs.getString("gender").charAt(0), rs.getInt("hpNumber"), rs.getInt("hNumber"), rs.getString("email"), rs.getString("password"), rs.getString("company"), rs.getInt("year"),rs.getBoolean("admin"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionManager.close(conn, pstmt, rs);
        }

        return user;
    }
    
    public void addUser(String name, String nickName, char gender, int hpNumber, int hNumber, String email, String password, String company, int year, int admin) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = ConnectionManager.getConnection();
            pstmt = conn.prepareStatement("INSERT INTO `loveapp`.`user` (`fullName`, `nickName`, `gender`, `hpNumber`, `hNumber`, `email`, `password`, `company`, `year`, `admin`) VALUES (?,?,?,?,?,?,?,?,?,?);");

                pstmt.setString(1, name);
                pstmt.setString(2, nickName);
                pstmt.setString(3, "m");
                pstmt.setInt(4, hpNumber);
                pstmt.setInt(5, hNumber);
                pstmt.setString(6, email);
                pstmt.setString(7, password);
                pstmt.setString(8, company);
                pstmt.setInt(9, year);
                pstmt.setInt(10, admin);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //ConnectionManager.close(conn, pstmt, rs);
        }

    }
    
}
