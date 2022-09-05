package academic.driver;
import academic.model.Student;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Driver2 {

    static Student[ ] siswa = new Student[0];
    public static void main( String[ ] _args ) {

        Scanner inp = new Scanner( System.in );
        String buffer = null;

        while( 2 > 1 ) {
            buffer = inp.nextLine( );

            if ( buffer.equals( "---" ) ) { break; }
            String[ ] value = buffer.split( "#" );
            Student newMatkul = arrayToStudent( value );
            addStudent( newMatkul );

        }
        PrintAllStudent( );
        inp.close( );

    }

    private static void PrintAllStudent( ) {
        for ( Student temp : siswa ){
            System.out.println( temp );
        }
        
    }

    private static void addStudent( Student temp ) {
        siswa = Arrays.copyOf( siswa, siswa.length +1 );
        siswa[ siswa.length -1 ] = temp;
    }

    private static Student arrayToStudent(String[ ] value) {
        Student temp = new Student( value[0], value[1], value[2], value[3] );
        return temp;
        
    }

}