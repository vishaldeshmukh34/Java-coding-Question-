import java.util.Scanner;

public class NumberAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The Sum Of " + a + " And " + b + " Is " + sum);

        sc.close();
    }
}
