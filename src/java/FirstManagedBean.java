
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
        genderList.add("Male");
        genderList.add("Female");
        nationalityList.add("Ethiopia");
        nationalityList.add("Ethiopia");
        nationalityList.add("USA");
        nationalityList.add("Russia");
        nationalityList.add("France");
        nationalityList.add("Other");
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
