import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        ArrayList<Book> listBook = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages  = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            String year = scanner.nextLine();

            listBook.add(new Book(name, pages, year));
        }

        System.out.print("\nWhat information will be printed? ");
        String printedChoice = scanner.nextLine();

        if (printedChoice.equals("everything")) {
            for (Book i : listBook) {
                System.out.println(i);
            }
        } else {
            for (Book i : listBook) {
                System.out.println(i.getTitle());
            }
        }
    }
}
