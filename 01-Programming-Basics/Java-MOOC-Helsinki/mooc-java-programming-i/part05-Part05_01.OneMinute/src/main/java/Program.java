
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();

        int i = 0;
        while (i < 366410) {
            System.out.println(timer);
            timer.advance();

        }

    }
}
