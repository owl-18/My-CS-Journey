
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.print("Last number: ");
        int n = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <= n; ++i) {
            sum += i;
        }
        System.out.print("The sum is " + sum);
    }
}
