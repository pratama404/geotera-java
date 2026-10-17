/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geotera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ageng
 */

public class konfig {
private static Connection MySQLConfig;

public static Connection configDB()throws SQLException{
    try{
        String url = "jdbc:mysql://localhost:3306/geotera";
        String user = "root";
        String pass = "";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(url, user, pass);
    }catch(SQLException e){
     System.out.println("koneksi ke database gagal" + e.getMessage());   
    }
    return MySQLConfig;
    
}

}


