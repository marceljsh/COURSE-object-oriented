package t00.env;
import java.util.Scanner;
/**
 * @author 12S20003 Marcel Joshua
 * 
 */
public class IO {
    public static void main(String [] args) {
        Scanner inp = new Scanner(System.in);
        String nim = inp.nextLine();
        String nama = inp.nextLine();
        System.out.print(nim + "|" + nama);
    }
}
