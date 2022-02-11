/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author THECREW
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "userBean")
@SessionScoped
public class UserTableBean {

    public List<UserTable> getUserList() {
        List<UserTable> list = new ArrayList<UserTable>();
        try {
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            ResultSet rs = con.createStatement().executeQuery("select * from USERTBL");
            while (rs.next()) {
                UserTable usr = new UserTable();
                usr.setUser(rs.getString("USERNAME"));
                usr.setPass(rs.getString("PASSWORD"));
                usr.setUserType(rs.getString("USERTYPE"));;
                list.add(usr);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return list;
    }
}
