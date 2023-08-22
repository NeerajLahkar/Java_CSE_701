import java.util.*;
public class Pro_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str = sc.nextLine();              //reads string
        //System.out.print("You have entered: " + str);

        String m1 = "January";
        String m2 = "March";
        String m3 = "May";
        String m4 = "July";
        String m5 = "August";
        String m6 = "October";
        String m7 = "December";
        String m8 = "February";

        if (str.equals(m1) || str.equals(m2) || str.equals(m3) || str.equals(m4) || str.equals(m5) || str.equals(m6) || str.equals(m7)) {

            System.out.print("31");
        } else if (str.equals(m8)) {
            System.out.print("28");
        }
        else { System.out.print("30");}
    }
}


