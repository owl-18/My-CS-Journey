
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int tmp;

        if (number1 > number2) {
            tmp = number1;
        } else {
            tmp = number2;
        }

        if (tmp > number3) {
            return tmp;
        } else {
            return number3;
        }
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
