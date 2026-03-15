
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggestLenghtName = 0, countInfo = 0, sum = 0;
        String name = "";
        while (true) {
            String info = scanner.nextLine();
            if (info.isEmpty()) {
                break;
            }

            ++countInfo;
            String[] strSplit = info.split(",");
            sum += Integer.parseInt(strSplit[1]);
            int currentLengthName = Integer.parseInt(String.valueOf(strSplit[0].length()));
            String currentName = strSplit[0];
            if (biggestLenghtName < currentLengthName) {
                biggestLenghtName = currentLengthName;
                name = currentName;
            }
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum / countInfo);
    }
}
