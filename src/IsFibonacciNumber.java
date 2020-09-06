import java.util.Scanner;

public class IsFibonacciNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int Number = sc.nextInt();

        checkIfFibonacci(Number);
    }

    private static void checkIfFibonacci(int Number) {
        int fibonacci1 = (5 * Number * Number) + 4;
        int fibonacci2 = (5 * Number * Number) - 4;

        if (isPerfectSquare(fibonacci1) ||
                isPerfectSquare(fibonacci2))
            System.out.println("Yes, Number is Fibonacci");
        else
            System.out.println("No, Number is not Fibonacci");
    }

    private static boolean isPerfectSquare (int fibonacci) {
        double sqrt = Math.sqrt(fibonacci);
        return sqrt % 1 == 0;
    }
}
