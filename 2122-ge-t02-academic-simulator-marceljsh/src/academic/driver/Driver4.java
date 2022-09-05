package academic.driver;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Driver4 {

    static final String SEPARATOR = "#";
    static Course[] matkul = new Course[0];
    static Student[] siswa = new Student[0];
    static Enrollment[] enrol = new Enrollment[0];

    public static void main( String[] _args ) {

        Scanner inp = new Scanner( System.in );
        String inputan = null;

        while (2 > 1) {
            inputan = inp.nextLine();
            if (inputan.equals("---")) { break; }
            String[] container = inputan.split(SEPARATOR);
            String order = container[0];
            container = Arrays.copyOfRange(container, 1, container.length);

            switch ( order )
            {
                case "course-add":
                    Course matkulBaru = arrayToCourse( container );
                    addCourse( matkulBaru );
                    break;
                
                case "student-add":
                    Student siswaBaru = arrayToStudent( container );
                    addStudent( siswaBaru );
                    break;
                
                case "enrollment-add":
                    Enrollment enrolBaru = arrayToEnrollment( container );
                    addEnrollment( enrolBaru );
                    break;
            }

            printAll();
            inp.close();

        }

    }
    
    private static void printAll( ) {
        PrintAllCourse();
        PrintAllStudent();
        PrintAllEnrollment();
    }

    //          COURSE
    private static void PrintAllCourse( ) {
        for ( Course i : matkul ) {
            System.out.println( i );
        }
        
    }

    private static void addCourse( Course temp ) {
        matkul = Arrays.copyOf( matkul, matkul.length +1 );
        matkul[ matkul.length -1 ] = temp;
    }

    private static Course arrayToCourse( String[] value ) {
        Course course = new Course(
                value[0],
                value[1],
                Integer.parseInt(value[2]),
                value[3] );
        return course;
        
    }

    //          STUDENT
    private static void PrintAllStudent( ) {
        for ( Student i : siswa ) {
            System.out.println( i );
        }
    }

    private static void addStudent( Student temp ) {
        siswa = Arrays.copyOf( siswa, siswa.length+1 );
        siswa[siswa.length+1] = temp;
    }

    private static Student arrayToStudent( String[] value ) {
        Student temp = new Student(
            value[0],
            value[1],
            value[2],
            value[3]);

        return temp;
    }

    //          ENROLLMENT
    private static void PrintAllEnrollment( ) {
        for ( Enrollment i : enrol ) {
            System.out.println( i );
        }
    }

    private static void addEnrollment( Enrollment temp ) {
        enrol = Arrays.copyOf( enrol, enrol.length+1 );
        enrol[enrol.length+1] = temp;
    }

    private static Enrollment arrayToEnrollment( String[] value) {
        Enrollment temp = new Enrollment(
            value[0],
            value[1],
            value[2],
            value[3]);
        
        return temp;
    }

}