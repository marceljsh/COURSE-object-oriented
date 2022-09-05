package academic.model;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Enrollment {

    private Course course;
    private Student student;
    private String period;
    private String semester;
    // private String grade;

    public Enrollment( ) {
        course      = new Course();
        student     = new Student();
        period      = "";
        semester    = "";
        // grade       = "None";
    }

    public Enrollment(  Course course, Student student,
                        String period, String semester ) {
        this.course   = course;
        this.student  = student;
        this.period   = period;
        this.semester = semester;
    }

    public String getCode() {
        return this.course.getCode();
    }

    public String getId() {
        return this.student.getId();
    }

    public String getPeriod() {
        return period;
    }
    
    public String getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%s|%s|None", course.getCode(), student.getId(), period, semester);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        
        Enrollment other = (Enrollment) obj;
        if (this.period == null) {
            if (other.period != null)
                return false;
        } else if (!period.equals(other.period))
            return false;
        if (this.course == null) {
            if (other.course != null)
                return false;
        } else if (!this.course.equals(other.course))
            return false;
        if (this.student == null) {
            if (other.student != null)
                return false;
        } else if (!this.student.equals(other.student))
            return false;
        if (!this.semester.equals(other.semester))
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + ( (this.period   == null)? 0 :   this.period.hashCode());
        result = prime * result + ( (this.course   == null)? 0 :   this.course.hashCode());
        result = prime * result + ( (this.semester == null)? 0 : this.semester.hashCode());
        result = prime * result + ( (this.student  == null)? 0 :  this.student.hashCode());
        return result;
    }
}