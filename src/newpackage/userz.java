/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;// con trỏ 
import stock.Users;
/**
 *
 * @author Mr.D
 */
public class userz extends connectdb {
      public userz(){
          super();
    }
    public boolean checkLogin(Users user) {// giống phương thức categoryDao
        boolean result = false;
        String sql = "select * from users where taikhoan = ? and matkhau = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getTaikhoan());
            ps.setString(2, user.getMatkhau());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                user.setId(rs.getInt("id"));
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
