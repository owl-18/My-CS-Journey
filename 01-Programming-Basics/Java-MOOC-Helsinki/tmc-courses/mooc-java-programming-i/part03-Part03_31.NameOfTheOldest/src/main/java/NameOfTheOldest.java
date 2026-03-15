
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggestAge = 0;
        String oldest = "";
        while (true) {
            String info = scanner.nextLine();
            if (info.isEmpty()) {
                break;
            }

            String[] stringSplit = info.split(",");
            int currentAge = Integer.parseInt(stringSplit[1]);
            if (currentAge > biggestAge) {
                biggestAge = currentAge;
                oldest = stringSplit[0];
            }
        }

        System.out.println("Name of the oldest: " + oldest);
    }
}
