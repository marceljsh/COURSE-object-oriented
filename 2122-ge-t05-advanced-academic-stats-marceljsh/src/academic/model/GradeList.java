package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */

public class GradeList {
    private String code;
    private String id;
    private String grade;
    private int credit;

    public GradeList ( ) {
        code   = "";
        id     = "";
        grade  = "";
        credit =  0;
    }

    public GradeList ( String code, String id, int credit ) {
        this.code   = code;
        this.id     = id;
        this.grade  = "";
        this.credit = credit;
    }

    public void setGrade ( String grade ) {
        this.grade = grade;
    }

    public String getCode ( ) { return this.code; }
    public String getId ( ) { return this.id; }
    public int getCredit ( ) { return this.credit; }
    public String getGrade ( ) { return this.grade; }

}
