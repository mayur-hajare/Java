import com.sun.source.tree.IfTree;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
import java.util.SortedMap;

class Error extends Exception {

    public void ArithMatic() {
        int a = 10, b = 0;
        try {
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Illegal() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Positive Number :");
        int a = scanner.nextInt();

        try {
            if (a < 0) {
                System.out.println("Number is less than Zero.");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class Error_handling {
    public static void main(String[] args) {

        Error error = new Error();
        error.ArithMatic();
        error.Illegal();
    }
}
