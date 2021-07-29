package bean;

public class Student extends Person {
    private String schoolName;
    private String scholarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }
}
