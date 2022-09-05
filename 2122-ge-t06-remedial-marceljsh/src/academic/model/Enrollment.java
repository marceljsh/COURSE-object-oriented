package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Enrollment {

    private String id;
    private String code;
    private String year;
    private String grade;
    private String semester;
    private String exGrade;

    public Enrollment ( )
    {
        code     = "";
        id       = "";
        year     = "";
        semester = "";
        exGrade  = "";
        grade    = "None";
    }

    public Enrollment ( String CODE, String ID, String YEAR, String SEMESTER)
    {
        id       = ID;
        code     = CODE;
        year     = YEAR;
        grade    = "None";
        semester = SEMESTER;
        exGrade  = "";
    }

    public String getCode     ( ) { return     code; }
    public String getId       ( ) { return       id; }
    public String getYear     ( ) { return     year; }
    public String getSemester ( ) { return semester; }
    public String getExGrade  ( ) { return  exGrade; }
    public String getGrade    ( ) { return grade; }
    public void   setGrade    ( String  GRADE ) { grade  =  GRADE; }
    public void   setGrade    ( String NEWGRADE, String EX_GRADE )
    {
        if ( exGrade.equals("") && !grade.equals("None") ) {
            grade = NEWGRADE;
            exGrade = EX_GRADE;
        }
    }

    public String toString ( ) {
        if (exGrade.equals(""))
            return String.format( "%s|%s|%s|%s|%s", code, id, year, semester, grade );
        else
            return String.format( "%s|%s|%s|%s|%s(%s)", code, id, year, semester, grade, exGrade );
    }

}