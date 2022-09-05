package academic.driver;

import java.util.Scanner;
import java.util.Arrays;

import academic.model.Student;

/**
 * @author 12S20003 Marcel Joshua
 */

public class Driver2 {

    static final String delim = "|";
    static Student[] siswaz = new Student[0];

    public static void main ( String[] _args )
    {

        Scanner inp = new Scanner( System.in );
        int idx = 0;
        String[] input = null;
        String order;
        String[] buf;
        Student newStu;
        Student tempStu;

        while ( true )
        {
            input[idx] = inp.nextLine( );
            if ( input[idx].equals("---") ) break;
            else idx++;
        }

        for ( int i=0; i<idx; i++ ) {
            buf = null;
            buf = input[idx].split( delim );
            order = buf[0];

            switch ( order )
            {
                case "student-add":
                    buf = Arrays.copyOfRange( buf, 1, buf.length );
                    tempStu = null;
                    tempStu = isDuplicateStu( buf[0] );
                    if ( tempStu != null ) break;
                    else {
                        newStu = null;
                        newStu = arrayToStudent( buf );
                        addStudent( newStu );
                        break;
                    }
                
                case "student-show-all":
                    printAllStudents( );

            }
        }

        inp.close();
    }

    // Students
    public static Student isDuplicateStu ( String CODE )
    {
        for ( Student temp : siswaz ) {
            if ( temp.getId( ).equals( CODE ) ) { return temp; }
        }
        return null;
    }
    
    private static void printAllStudents ( )
    {
        for ( Student temp : siswaz) { System.out.println( temp ); }
    }

    private static void addStudent ( Student temp )
    {
        siswaz = Arrays.copyOf( siswaz, siswaz.length + 1 );
        siswaz[siswaz.length - 1] = temp;
    }

    private static Student arrayToStudent ( String[] temp )
    {
        Student siswa = new Student( temp[0], temp[1], Float.parseFloat(temp[2]), Integer.parseInt(temp[3]) );
        return siswa;
    }

}