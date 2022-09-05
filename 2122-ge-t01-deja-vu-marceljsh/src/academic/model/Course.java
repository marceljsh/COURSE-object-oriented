package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Course {

    private String code;
    private String courseName;
    private int credit;
    private String passingGrade;

    public Course( ) {
        code        = "";
        courseName  = "";
        credit      = 0;
        passingGrade= "";
    }

    public Course( String CODE, String COURSE_NAME,
                   int CREDIT, String PASSING_GRADE ) {
        code         = CODE;
        courseName   = COURSE_NAME;
        credit       = CREDIT;
        passingGrade = PASSING_GRADE;
    }

    public String getCode( ) { return code; }
    public void setCode( String code ) { this.code = code; }

    public String getCourseName( ) { return courseName; }
    public void setCourseName( String courseName ) { this.courseName = courseName; }

    public int getCredit( ) { return credit; }
    public void setCredit( int credit ) { this.credit = credit; }

    public String getPassingGrade( ) { return passingGrade; }
    public void setPassingGrade( String passingGrade ) { this.passingGrade = passingGrade; }

    public String toString( ) {
        return String.format("%s|%s|%d|%s",code,courseName,credit,passingGrade);
        // return this.code + "|" + this.courseName + "|" + this.credit + "|" + this.passingGrade;
    }

    

}