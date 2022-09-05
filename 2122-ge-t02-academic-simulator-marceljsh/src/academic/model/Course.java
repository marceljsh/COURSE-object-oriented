package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Course {

    private String code;
    private String courseName;
    private int credit;
    private String passingGrade;

    public Course() {
        code        = "";
        courseName  = "";
        credit      = 0;
        passingGrade= "";
    }

    public Course( String code, String courseName,
                   int credit, String passingGrade ) {
        this.code         = code;
        this.courseName   = courseName;
        this.credit       = credit;
        this.passingGrade = passingGrade;
    }

    public String getCode() {
        return code;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public String getPassingGrade() {
        return passingGrade;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%d|%s",code,courseName,credit,passingGrade);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Course temp = (Course) obj;
        if (this.code == null) {
            return temp.code == null;
        } else return this.code.equals(temp.code);
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + ( (this.code == null)? 0 : this.code.hashCode() );
        return result;
    }
}