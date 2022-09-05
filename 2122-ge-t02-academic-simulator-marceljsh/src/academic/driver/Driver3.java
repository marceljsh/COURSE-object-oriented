package academic.driver;
import academic.model.Enrollment;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Driver3 {

    static Enrollment[ ] matkul = new Enrollment[0];
    public static void main( String[ ] _args ) {

        Scanner inp = new Scanner( System.in );
        String buffer = null;

        while( 2 > 1 ){
            buffer = inp.nextLine( );

            if ( buffer.equals( "---" ) ) { break; }
            String[ ] value = buffer.split( "#" );
            Enrollment newMatkul = arrayToEnrollment( value );
            addEnrollment( newMatkul );

        }
        PrintAllEnrollment( );
        inp.close( );

    }

    private static void PrintAllEnrollment( ) {
        for ( Enrollment temp : matkul ){
            System.out.println( temp );
        }
        
    }

    private static void addEnrollment( Enrollment temp ) {
        matkul = Arrays.copyOf( matkul, matkul.length +1 );
        matkul[ matkul.length -1 ] = temp;
    }

    private static Enrollment arrayToEnrollment( String[ ] value ) {
        Enrollment temp = new Enrollment( value[0], value[1], value[2], value[3] );
        return temp;
        
    }

}