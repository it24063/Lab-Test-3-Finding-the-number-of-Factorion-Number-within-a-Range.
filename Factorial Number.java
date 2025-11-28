import java.util.Scanner;

public class Factorion {

    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    static boolean isFactorion(int num) {
        int sum = 0, temp = num;
        while(temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int count = 0;
        System.out.print("Factorion numbers: ");
        for(int i = start; i <= end; i++) {
            if(isFactorion(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal: " + count);
    }
}
