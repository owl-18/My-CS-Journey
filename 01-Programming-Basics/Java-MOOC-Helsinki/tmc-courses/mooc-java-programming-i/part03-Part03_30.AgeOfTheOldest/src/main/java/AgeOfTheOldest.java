
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggest = 0;
        while (true) {
            String info = scanner.nextLine();
            if (info.isEmpty()) {
                break;
            }

            String[] map = info.split(",");
            int currentBiggest = Integer.parseInt(map[1]);
            if (currentBiggest > biggest) {
                biggest = currentBiggest;
            }
        }

        System.out.println("Age of the oldest: " + biggest);

    }
}
