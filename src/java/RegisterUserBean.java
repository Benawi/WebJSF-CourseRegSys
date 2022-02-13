
import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author THECREW
 */
@ManagedBean
@SessionScoped
public class RegisterUserBean implements Serializable {

    public List<FirstManagedBean> getUserList() {
        List<FirstManagedBean> list = new ArrayList<>();
        try {
            String[] course = null;
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            ResultSet rs = con.createStatement().executeQuery("select * from USERPROFILE1");
            while (rs.next()) {
                FirstManagedBean usr = new FirstManagedBean();
                usr.setFirstName(rs.getString("FIRSTNAME"));
                usr.setLastName(rs.getString("LASTNAME"));
                usr.setGender(rs.getString("GENDER"));
                usr.setNationality(rs.getString("NATIONALITY"));
                usr.setCourse1(rs.getString("COURSE"));
                //course[1]=rs.getString("COURSE");
                //usr.setCourse(course);
                list.add(usr);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return list;
    }

}
