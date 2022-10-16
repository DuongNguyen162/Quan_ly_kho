/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mr.D
 */
public class connectdb {
    public static Connection con;

    public connectdb(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/stockmanagement?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.cj.jdbc.Driver";

            try {
                    Class.forName(dbClass);
                    con = DriverManager.getConnection (dbUrl, "root", "");
            }catch(Exception e) {
                    e.printStackTrace();
            }
        }
    }
}
