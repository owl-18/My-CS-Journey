
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumber = 0, sumNumber = 0;
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 0) {
                ++countNumber;
                sumNumber += number;
            } else {
                break;
            }
        }

        double averageOfNumbers = 1.00 * sumNumber / countNumber;
        System.out.println("Average of the numbers: " +averageOfNumbers);
    }
}
