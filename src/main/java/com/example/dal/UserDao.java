package com.example.dal;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import jakarta.annotation.Resource;
import java.sql.*;

public class UserDao {

    public static String AUTHENTICATE_QUERY = "SELECT * FROM employers where email=? and password=?";
    public static String ADD_NEW_EMPLOYR_QUERY = "INSERT INTO employers (id, name, email, password) VALUES (?, ?, ?,?)";
    public static String UPDATE_EMPLOYER_QUERY = "UPDATE employers SET name = ? , email = ? , password = ? WHERE id = ? and email = ? ";
    public static String DELETE_EMPLOYER_QUERY = "";
    public UserDao(){
        try{
            myDB = InitialContext.doLookup("jdbc/myDB");
        }catch(NamingException e){
            throw new RuntimeException(e);
        }
    }

    @Resource(lookup="jdbc/myDB")
    private DataSource myDB;
    private Connection conn;

    public boolean authenticate(String email,String password){
        try{
            conn = myDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(AUTHENTICATE_QUERY);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet res = ps.executeQuery();
            if(res.isBeforeFirst() || res.getRow()!=0){
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean addEmployer(int id , String name, String email, String password) {
        try {
            conn = myDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(ADD_NEW_EMPLOYR_QUERY);
            ps.setInt(1, 0);
            ps.setString(2, name);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    

    public boolean updateEmployer(int id, String name, String email, String password) {
        try {
            Connection conn = myDB.getConnection();
            PreparedStatement ps = conn.prepareStatement(UPDATE_EMPLOYER_QUERY);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setInt(4, id);
            ps.setString(5, email);
    
            int rowsUpdated = ps.executeUpdate();
    
            return rowsUpdated > 0;
        } catch (SQLException e) {
            // Handle exception
            return false;
        }
    }
    
}
