
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class FirstManagedBean {

    private String firstName;
    private String lastName;
    private String[] course;
    List<String> genderList;
    private String nationality;
    List<String> nationalityList;
    private String userType;
    List<String> userTypeList;

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
        userTypeList =new ArrayList<>();
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
}
