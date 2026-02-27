import java.util.Scanner;

public class MathDemo {

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int sum(int[] args) {
        int total = 0;
        for (int num : args) {
            total += num;
        }
        return total;
    }

    public static float mean(int[] args) {
        if (args.length == 0) return 0;
        return (float) sum(args) / args.length;
    }

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined");
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Min: " + min(a, b));
        System.out.println("Max: " + max(a, b));

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum: " + sum(arr));
        System.out.println("Mean: " + mean(arr));

        System.out.print("Enter number for factorial: ");
        int num = sc.nextInt();
        System.out.println("Factorial: " + factorial(num));

        //f. They can be called without creating an object of the class, which makes them suitable for utility methods like mathematical operations and saves memory when no instance variables are needed.
    }
}
