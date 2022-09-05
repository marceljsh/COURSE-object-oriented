package academic.driver;
import academic.model.Course;
import academic.model.Enrollment;
import academic.model.Student;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Driver1 {

    static LinkedHashSet<Course> courses = new LinkedHashSet<>();
    static LinkedHashSet<Student> students = new LinkedHashSet<>();
    static LinkedHashSet<Enrollment> enrollments = new LinkedHashSet<>();
    public static void main( String[ ] _args ) {

        Scanner inp = new Scanner( System.in );
        String buffer, command;
        String[] data;

        while( true ) {
            buffer = inp.nextLine( );

            if ( buffer.equals( "---" ) )
                break;
            data = buffer.split( "#" );
            command = data[0];

            switch (command) {
                case "course-add":
                    courses.add(new Course(data[1], data[2], Integer.parseInt(data[3]), data[4]));
                    break;
                
                case "student-add":
                    students.add(new Student(data[1], data[2], data[3], data[4]));
                    break;
                
                case "enrollment-add":
                    Course newCourse = findCourse(data[1]);
                    Student newStudent = findStudent(data[2]);
                    if (newCourse != null && newStudent != null)
                        enrollments.add(new Enrollment(newCourse, newStudent, data[3], data[4]));
            }

        }

        inp.close();
        
        for (Course obj: courses)
            System.out.println(obj);
        for (Student obj: students)
            System.out.println(obj);
        for (Enrollment obj: enrollments)
            System.out.println(obj);
    }

    // quaesitum means something sought for
    public static Course findCourse(String quaesitum) {
        for (Course member: courses)
            if (member.getCode().equals(quaesitum))
                return member;
        return null;
    }

    public static Student findStudent(String searchee) {
        for (Student member: students)
            if (member.getId().equals(searchee))
                return member;
        return null;
    }
}