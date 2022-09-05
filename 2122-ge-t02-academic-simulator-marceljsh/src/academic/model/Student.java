package academic.model;

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

    public Student( String id, String studentName,
                    String eduYear, String stuPrg ) {
        this.id          = id;
        this.studentName = studentName;
        this.eduYear     = eduYear;
        this.stuPrg      = stuPrg;
    }

    public String getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getEduYear() {
        return eduYear;
    }

    public String getStuPrg() {
        return stuPrg;
    }

    @Override
    public String toString() {
        return String.format("%s|%s|%s|%s",id,studentName,eduYear,stuPrg);
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int result = 1;
        result = prime * result + ( (this.id == null)? 0 : this.id.hashCode() );
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student temp = (Student) obj;
        if (this.id == null) {
            return temp.id == null;
        } else return this.id.equals(temp.id);
    }
}