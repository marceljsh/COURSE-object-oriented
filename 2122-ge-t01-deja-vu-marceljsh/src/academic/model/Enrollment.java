package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Enrollment {

    private String code;
    private String id;
    private String period;
    private String semester;
    private String grade;

    public Enrollment( ) {
        code        = "";
        id          = "";
        period      = "";
        semester    = "";
        grade       = "None";
    }

    public Enrollment(  String CODE, String ID,
                    String PERIOD, String SEMESTER, String GRADE ) {
        code        = CODE;
        id          = ID;
        period      = PERIOD;
        semester    = SEMESTER;
        grade       = GRADE;
    }

    public String getCode( ) { return code; }
    public void setCode( String code ) { this.code = code; }

    public String getId( ) { return id; }
    public void setId( String id ) { this.id = id; }

    public String getPeriod( ) { return period; }
    public void setPeriod( String period ) { this.period = period; }

    public String getSemester( ) { return semester; }
    public void setSemester( String semester ) { this.semester = semester; }

    public String toString( ) {
        return String.format("%s|%s|%s|%s|%s",code,id,period,semester,grade);
    }


}