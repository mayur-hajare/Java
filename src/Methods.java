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

    static void pattern1(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.println("\n");
            for (int i = n; i >= j; i--) {
                System.out.print(" * ");
            }
        }

    }

    int sum(int n) {
        int result = 0;

        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    static int fact(int n) {
        int factorial = 0;
        if (n == 0 || n == 1)
            return 1;
        else
            factorial = n * fact(n - 1);
        return factorial;
    }

    float fahr(float c) {

        return (float) ((c * 1.8) + 32);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to print table : ");
        int a = scanner.nextInt();
        System.out.println("Enter Number to print pattern : ");
        int b = scanner.nextInt();
        mul(a);
        pattern(b);
        Methods obj = new Methods();
        int c = obj.sum(10);
        System.out.println(c);
        pattern1(6);
        int fact = fact(5);
        System.out.println("\n" + fact);

        System.out.println(obj.fahr(23.0F));
    }
}
