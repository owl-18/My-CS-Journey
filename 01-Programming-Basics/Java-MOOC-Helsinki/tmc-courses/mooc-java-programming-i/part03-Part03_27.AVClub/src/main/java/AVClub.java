
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String str = scanner.nextLine();
            String[] arrayString = str.split(" ");

            if (str.isEmpty()) {
                break;
            }
            for (String s : arrayString) {
                if (s.contains("av")) {
                    System.out.println(s);
                }
            }
        }

    }
}
