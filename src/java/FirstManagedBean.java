
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class FirstManagedBean implements Serializable {

    private String firstName;
    private String lastName;
    private String[] course;
     private String course1;

    public String getCourse1() {
        return course1;
    }

    public void setCourse1(String course1) {
        this.course1 = course1;
    }
    List<String> genderList;
    private String nationality;
    List<String> nationalityList;
    private String userType;
    List<String> userTypeList;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    private String pwd;
    private String user;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<String> getUserTypeList() {
        return userTypeList;
    }

    public void setUserTypeList(List<String> userTypeList) {
        this.userTypeList = userTypeList;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getNationalityList() {
        return nationalityList;
    }

    public void setNationalityList(List<String> nationalityList) {
        this.nationalityList = nationalityList;
    }
    private String gender;

    public List<String> getGenderList() {
        return genderList;
    }

    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public FirstManagedBean() {
        genderList = new ArrayList<>();
        nationalityList = new ArrayList<>();
        userTypeList = new ArrayList<>();
        genderList.add("Male");
        genderList.add("Female");
        nationalityList.add("Ethiopia");
        nationalityList.add("Ethiopia");
        nationalityList.add("USA");
        nationalityList.add("Russia");
        nationalityList.add("France");
        nationalityList.add("Other");
        userTypeList.add("Admin");
        userTypeList.add("User");
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void profilerInsert() {
        //List<FirstManagedBean> list = new ArrayList<>();
        try {
            
            FirstManagedBean reg = new FirstManagedBean();
            DBConnection dbcon = new DBConnection();
            Connection con = dbcon.connMethod();
            String sql = "Insert into USERPROFILE1(FIRSTNAME,LASTNAME,GENDER,NATIONALITY,COURSE) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, gender);
            ps.setString(4, nationality);
            ps.setString(5, Arrays.toString(course));
            ps.executeUpdate();
            String sql1 = "Insert into USERTBL(USERNAME,PASSWORD,USERTYPE) values(?,?,?)";
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps1.setString(1,user);
            ps1.setString(2, pwd);
            ps1.setString(3, userType);
            ps1.executeUpdate();
            System.err.println("success");
        } catch (Exception e) {
        }
    }

}
