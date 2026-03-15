
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String name = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String answer = scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
