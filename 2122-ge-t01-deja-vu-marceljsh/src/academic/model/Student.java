package academic.model;

// import java.security.Identity;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Student {

    private String id;
    private String studentName;
    private String eduYear;
    private String stuPrg;

    public Student( ) {
        id          = "";
        studentName = "";
        eduYear     = "";
        stuPrg      = "";
    }

    public Student( String ID, String STUDENT_NAME,
                    String EDU_YEAR, String STU_PRG ) {
        id          = ID;
        studentName = STUDENT_NAME;
        eduYear     = EDU_YEAR;
        stuPrg      = STU_PRG;
    }

    public String getId( ) { return id; }
    public void setId( String id ) { this.id = id;  }

    public String getStudentName( ) { return studentName; }
    public void setName( String studentName ) { this.studentName = studentName;  }

    public String getEduYear( ) { return eduYear; }
    public void setYear( String eduYear ) { this.eduYear = eduYear; }

    public String getStuPrg( ) { return stuPrg; }
    public void setStudyProgram( String stuPrg ) { this.stuPrg = stuPrg;  }

    public String toString( ) {
        return String.format("%s|%s|%s|%s",id,studentName,eduYear,stuPrg);
    }


}