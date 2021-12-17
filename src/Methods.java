import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Methods {
    static void mul(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " " + n * i);
            i++;
        }

    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to print table : ");
        int a = scanner.nextInt();
        System.out.println("Enter Number to print pattern : ");
        int b = scanner.nextInt();
        mul(a);
        pattern(100);

    }
}
