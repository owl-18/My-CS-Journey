import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }

            String[] parts = userInput.split(" ");
            for (String s : parts) {
                System.out.println(s);
            }
        }
    }
}
