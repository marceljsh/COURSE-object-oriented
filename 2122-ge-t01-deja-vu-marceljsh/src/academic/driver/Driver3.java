package academic.driver;

import academic.model.Enrollment;
import java.util.Scanner;

/**
 * @author 12S20003 Marcel Joshua
 */
public class Driver3 {

    public static void main(String[] _args) {

        Enrollment enrollment = new Enrollment();
        Scanner inp = new Scanner(System.in);
        String inputan;

        inputan = inp.nextLine();
        enrollment.setCode( inputan );

        inputan = inp.nextLine();
        enrollment.setId( inputan );

        inputan = inp.nextLine();
        enrollment.setPeriod( inputan );

        inputan = inp.nextLine();
        enrollment.setSemester( inputan );

        inp.close();
        System.out.println(enrollment);

    }

}